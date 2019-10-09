package com.sanmei.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.sanmei.config.exception.ArgumentException;
import com.sanmei.config.exception.CommonJsonException;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.user.UserService;
import com.sanmei.util.CommonUtil;
import com.sanmei.util.ExcelUtils;
import com.sanmei.util.Response;
import com.sanmei.util.constants.ErrorEnum;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

/**
 * @author: hxy
 * @description: 用户/角色/权限相关controller
 * @date: 2017/11/2 10:19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     */
    @RequiresPermissions("user:list")
    @GetMapping("/list")
    public JSONObject listUser(HttpServletRequest request) {
        String username = request.getParameter("username");
        JSONObject jsonObject = CommonUtil.request2Json(request);
        return userService.listUser(jsonObject);
    }

    /**
     * 查询用户信息
     */
    @GetMapping("/myInfo")
    public Response<List<SysUser>> getMyInfo(SysUser SysUser) {
        Response<List<SysUser>> response = new Response<>();
        try {
            List<SysUser> rerurnList = userService.getMyInfo(SysUser);
            response.setResult(rerurnList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }

    /**
     * 修改密码
     * @param SysUser
     * @return
     */
    @PostMapping("/changePsd")
    public Response<String> changePsd(@RequestBody SysUser SysUser) {
        Response<String> response = new Response<>();
        try {
            userService.changePsd(SysUser);
            response.setResult("密码更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }

    /**
     * 修改我的信息
     * @param SysUser
     * @return
     */
    @PostMapping("/updateMyInfo")
    public Response<String> updateMyInfo(@RequestBody SysUser SysUser) {
        Response<String> response = new Response<>();
        try {
            userService.updateMyInfo(SysUser);
            response.setResult("更新个人信息成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }

    @RequiresPermissions("user:add")
    @PostMapping("/addUser")
    public JSONObject addUser(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "username, password, nickname,   roleId");
        return userService.addUser(requestJson);
    }


    /**
     * 导入用户excel写入数据库
     *
     * @param request
     * @return
     */
    @RequiresPermissions(value = "user:importExcel")
    @PostMapping(value = "importUserExcel")
    public Response<String> importExcel(HttpServletRequest request) {
        Response<String> response = new Response<>();
        String username = request.getParameter("username");
        MultipartHttpServletRequest multipartRequest = null;
        try {
            multipartRequest = (MultipartHttpServletRequest) request;
            Iterator<String> fileNames = multipartRequest.getFileNames();
            if (fileNames == null) {
                new CommonJsonException(ErrorEnum.E_90004);
            }
            MultipartFile file = multipartRequest.getFile(fileNames.next());
            if (file == null) {
                new CommonJsonException(ErrorEnum.E_90004);
            }
            if (file.getOriginalFilename() == null) {
                new CommonJsonException(ErrorEnum.E_90004);
            }
            if (!file.getOriginalFilename().endsWith(".xls")) {
                throw new ArgumentException("导入功能只支持xls文件");
            }

            InputStream inputStream = file.getInputStream();
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(inputStream);
            //默认有一个sheet页面
            HSSFSheet sheet = hssfWorkbook.getSheetAt(0);
            int count = 0;
            //从第一行开始,第一行是表头
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                HSSFRow row = sheet.getRow(i);
                SysUser sysUser = new SysUser();
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    String stringValue = ExcelUtils.getStringValue(row.getCell(j));
                    //姓名
                    if (j == 0) {
//                        sysUser.setNickName(stringValue);
//                    } else if (j == 1) {
                        //用户名
                        sysUser.setNickName(stringValue);
                        sysUser.setUserName(stringValue);
//                    } else if (j == 1) {
//                        //角色
//                        sysUser.setRoleName(stringValue);
                    } else if (j == 1) {
                        //性别
                        sysUser.setSex(stringValue);
                    } else if (j == 2) {
                        //年龄
                        sysUser.setAge(Integer.parseInt(stringValue));
                    } else if (j == 3) {
                        //电话
                        sysUser.setPhone(stringValue);
                    } else if (j == 4) {
                        //qq
                        sysUser.setQq(stringValue);
                    } else if (j == 5) {
                        //微信
                        sysUser.setWechat(stringValue);
                    } else if (j == 6) {
                        //区域
                        sysUser.setAera(stringValue);
                    } else if (j == 7) {
                        //学历
                        sysUser.setEducation(stringValue);
                    } else {
                        //介绍人
                        sysUser.setIntroducer(stringValue);
                    }
                    sysUser.setRoleName("学员");//默认为学员
                    sysUser.setPassWord("lingguibafa");//默认为学员
                    //sysUser.setCreateTime(LocalDate.now());
                    //sysUser.setUpdateTime(LocalDate.now());
                    sysUser.setDeleteStatus("1");
                }
                //插入sysuser
                int i1 = userService.saveSysUser(sysUser);
                count += i1;
            }
            response.setResult("导入了" + count + "条数据");
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("导入失败");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            response.setError("导入失败");
        } catch (IOException e) {
            e.printStackTrace();
            response.setError("导入失败");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("导入失败");
        }
        return response;
    }


    @RequiresPermissions("user:update")
    @PostMapping("/updateUser")
    public JSONObject updateUser(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, " nickname,   roleId, deleteStatus, userId");
        return userService.updateUser(requestJson);
    }

    @RequiresPermissions(value = {"user:add", "user:update"}, logical = Logical.OR)
    @GetMapping("/getAllRoles")
    public JSONObject getAllRoles() {
        return userService.getAllRoles();
    }

    /**
     * 角色列表
     */
    @RequiresPermissions("role:list")
    @GetMapping("/listRole")
    public JSONObject listRole() {
        return userService.listRole();
    }

    /**
     * 查询所有权限, 给角色分配权限时调用
     */
    @RequiresPermissions("role:list")
    @GetMapping("/listAllPermission")
    public JSONObject listAllPermission() {
        return userService.listAllPermission();
    }

    /**
     * 新增角色
     */
    @RequiresPermissions("role:add")
    @PostMapping("/addRole")
    public JSONObject addRole(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "roleName,permissions");
        return userService.addRole(requestJson);
    }

    /**
     * 修改角色
     */
    @RequiresPermissions("role:update")
    @PostMapping("/updateRole")
    public JSONObject updateRole(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "roleId,roleName,permissions");
        return userService.updateRole(requestJson);
    }

    /**
     * 删除角色
     */
    @RequiresPermissions("role:delete")
    @PostMapping("/deleteRole")
    public JSONObject deleteRole(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "roleId");
        return userService.deleteRole(requestJson);
    }
}
