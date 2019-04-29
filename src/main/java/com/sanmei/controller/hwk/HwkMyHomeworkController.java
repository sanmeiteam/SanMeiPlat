package com.sanmei.controller.hwk;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.hwk.HwkMyHomework;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.hwk.HwkMyHomeworkService;
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
@RequestMapping(value = "MyHomework")
public class HwkMyHomeworkController {

    @Autowired
    private HwkMyHomeworkService hwkMyHomeworkService;
    /**
     * 根据个人获取心得  用于我的作业
     * @param HwkMyHomework
     * @return
     */
    @RequiresPermissions("class:list")
    @GetMapping("/hwkList")
    public Response<List<HwkMyHomework>> selectHwkMyHomework(HwkMyHomework HwkMyHomework) {
        Response<List<HwkMyHomework>> response = new Response<>();
        try {
            List<HwkMyHomework> HwkMyHomeworkList = hwkMyHomeworkService.selectHwkMyHomework(HwkMyHomework);
            response.setResult(HwkMyHomeworkList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }

    /**
     * 根据课时或学员获取作业  用于批阅
     * @param HwkMyHomework
     * @return
     */
    @RequiresPermissions("class:list")
    @GetMapping("/remarkList")
    public Response<List<HwkMyHomework>> selectHwkRemarkHomework(HwkMyHomework HwkMyHomework) {
        Response<List<HwkMyHomework>> response = new Response<>();
        try {
            List<HwkMyHomework> HwkMyHomeworkList = hwkMyHomeworkService.selectHwkRemarkHomework(HwkMyHomework);
            response.setResult(HwkMyHomeworkList);
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
    public Response<List<CosCourseSchedule>> getCourseSchedule(HwkMyHomework HwkMyHomework ) {

        Response<List<CosCourseSchedule>> response = new Response<>();
        try {
            List<CosCourseSchedule> CosCourseSchedule = hwkMyHomeworkService.getCourseSchedule(HwkMyHomework);
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
    public Response<List<SysUser>> getClassUsers(HwkMyHomework HwkMyHomework ) {

        Response<List<SysUser>> response = new Response<>();
        try {
            List<SysUser> SysUser = hwkMyHomeworkService.getClassUsers(HwkMyHomework);
            response.setResult(SysUser);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("获取学员列表失败！");
        }
        return response;
    }

    /**
     * 上传心得
     * @param HwkMyHomework
     * @return
     */
    @RequiresPermissions("class:update")
    @PostMapping("/uploadData")
    public Response<String> uploadHwkMyHomework(@RequestBody HwkMyHomework HwkMyHomework) {
        Response<String> response = new Response<>();
        try {
            hwkMyHomeworkService.uploadHwkMyHomework(HwkMyHomework);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }


    /**
     * 心得评阅
     * @param HwkMyHomework
     * @return
     */
    @RequiresPermissions("class:delete")
    @PostMapping("/remarkData")
    public Response<String> remarkHwkMyHomework(@RequestBody HwkMyHomework HwkMyHomework) {
        Response<String> response = new Response<>();
        try {
            hwkMyHomeworkService.remarkHwkMyHomework(HwkMyHomework);
            response.setResult("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("删除失败");
        }
        return response;
    }

}
