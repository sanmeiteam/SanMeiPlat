package com.sanmei.controller.user;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.sysUser.SysOrganizer;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.user.SysOrganizerService;
import com.sanmei.util.Response;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-09 19:09
 */
@RestController
@RequestMapping(value = "SysOrganizer")
public class SysOrganizerController {

    @Autowired
    private SysOrganizerService sysOrganizerService;


    /**
     * 查询
     *
     * @param sysOrganizer
     * @return
     */
    @RequiresPermissions("cos:list")
    @GetMapping(value = "list")
    public Response<List<SysOrganizer>> selectOrganizer(SysOrganizer sysOrganizer) {
        Response<List<SysOrganizer>> response = new Response<>();
        try {
            List<SysOrganizer> returnList = sysOrganizerService.selectOrganizer(sysOrganizer);
            response.setResult(returnList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }

    /**
     * 获取选择 学员 下拉列表
     *
     * @param
     * @return
     */
    @GetMapping("/getUsers")
    public Response<List<SysUser>> getUsers() {

        Response<List<SysUser>> response = new Response<>();
        try {
            List<SysUser> returnList = sysOrganizerService.getUsers();
            response.setResult(returnList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("获取人员列表失败！");
        }
        return response;
    }

    /**
     * 获取选择 承办方 下拉列表
     *
     * @param
     * @return
     */
    @GetMapping("/getOrganizer")
    public Response<List<SysOrganizer>> getOrganizer() {

        Response<List<SysOrganizer>> response = new Response<>();
        try {
            List<SysOrganizer> returnList = sysOrganizerService.getOrganizer();
            response.setResult(returnList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("获取承办方列表失败！");
        }
        return response;
    }
    /**
     * 新增
     *
     * @param sysOrganizer
     * @return
     */
    @RequiresPermissions("cos:add")
    @PostMapping("/addData")
    public Response<String> addOrganizer(@RequestBody SysOrganizer sysOrganizer) {
        Response<String> response = new Response<>();
        try {
            int rtnValue = sysOrganizerService.addOrganizer(sysOrganizer);
            if (rtnValue == -1) {
                response.setError("该承办方已经存在");
            } else {
                response.setResult("添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("添加失败");
        }
        return response;
    }

    /**
     * 更新
     *
     * @param sysOrganizer
     * @return
     */
    @RequiresPermissions("cos:update")
    @PostMapping("/updateData")
    public Response<String> updateOrganizer(@RequestBody SysOrganizer sysOrganizer) {
        Response<String> response = new Response<>();
        try {
            sysOrganizerService.updateOrganizer(sysOrganizer);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }

    /**
     * 删除
     *
     * @param sysOrganizer
     * @return
     */
    @RequiresPermissions("cos:delete")
    @PostMapping("/deleteData")
    public Response<String> deleteOrganizer(@RequestBody SysOrganizer sysOrganizer) {
        Response<String> response = new Response<>();
        try {
            sysOrganizerService.deleteOrganizer(sysOrganizer);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }


}
