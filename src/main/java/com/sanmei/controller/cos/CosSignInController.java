package com.sanmei.controller.cos;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.cos.CosSignIn;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.cos.CosSignInService;
import com.sanmei.util.Response;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 21:32
 */
@RestController
@RequestMapping(value = "sign")
public class CosSignInController {

    @Autowired
    private CosSignInService cosSignInService;
    /**
     * 获取签到列表
     * @param cosSignIn
     * @return
     */
//    @RequiresPermissions("class:list")
    @GetMapping("/list")
    public Response<List<CosSignIn>> selectHwkMyHomework(CosSignIn cosSignIn) {
        Response<List<CosSignIn>> response = new Response<>();
        try {
            List<CosSignIn> returnList = cosSignInService.selectCosSignIn(cosSignIn);
            response.setResult(returnList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }

    /**
     * 获取选择 课时 下拉列表
     *
     * @param
     * @return
     */
    @GetMapping("/getCourseSchedule")
    public Response<List<CosCourseSchedule>> getCourseSchedule(CosSignIn cosSignIn ) {
        Response<List<CosCourseSchedule>> response = new Response<>();
        try {
            List<CosCourseSchedule> CosCourseSchedule = cosSignInService.getCourseSchedule(cosSignIn);
            response.setResult(CosCourseSchedule);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("获取课时列表失败！");
        }
        return response;
    }

    /**
     * 获取选择班内人员 下拉列表
     *
     * @param
     * @return
     */
    @GetMapping("/getClassUsers")
    public Response<List<SysUser>> getClassUsers(CosSignIn cosSignIn ) {
        Response<List<SysUser>> response = new Response<>();
        try {
            List<SysUser> SysUser = cosSignInService.getClassUsers(cosSignIn);
            response.setResult(SysUser);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("获取学员列表失败！");
        }
        return response;
    }

    /**
     * 新增
     * @param cosSignIn
     * @return
     */
    @RequiresPermissions("class:add")
    @PostMapping("/addData")
    public Response<String> addCosSignIn(@RequestBody CosSignIn cosSignIn) {
        Response<String> response = new Response<>();
        try {
            cosSignInService.addCosSignIn(cosSignIn);
            response.setResult("签到成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("签到失败");
        }
        return response;
    }

    /**
     * 新增 app sign
     * @param cosSignIn
     * @return
     */
    @PostMapping("/sign")
    public Response<String> appCosSignIn(@RequestBody CosSignIn cosSignIn) {
        Response<String> response = new Response<>();
        try {
            //cosSignInService.appCosSignIn(cosSignIn);
            response.setResult("签到成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("签到失败");
        }
        return response;
    }

}
