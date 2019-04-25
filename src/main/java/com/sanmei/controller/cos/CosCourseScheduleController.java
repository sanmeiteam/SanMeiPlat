package com.sanmei.controller.cos;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.service.inf.cos.CosCourseScheduleService;
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
@RequestMapping(value = "CosCourseSchedule")
public class CosCourseScheduleController {

    @Autowired
    private CosCourseScheduleService cosCourseScheduleService;

    @RequiresPermissions("class:list")
    @GetMapping("/list")
    public Response<List<CosCourseSchedule>> selectCosCourseSchedule(CosCourseSchedule CosCourseSchedule) {
        Response<List<CosCourseSchedule>> response = new Response<>();
        try {
            List<CosCourseSchedule> CosCourseScheduleList = cosCourseScheduleService.selectCosCourseSchedule(CosCourseSchedule);
            response.setResult(CosCourseScheduleList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }


    /**
     * 新增
     * @param CosCourseSchedule
     * @return
     */
    @RequiresPermissions("class:add")
    @PostMapping("/addData")
    public Response<String> addCosClass(@RequestBody CosCourseSchedule CosCourseSchedule) {
        Response<String> response = new Response<>();
        try {
            int rtnValue=cosCourseScheduleService.addCosCourseSchedule(CosCourseSchedule);
            if (rtnValue==-1) {
                response.setError("该课程已经存在");
            }
            else {
                response.setResult("添加成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }


    /**
     * 更新
     * @param CosCourseSchedule
     * @return
     */
    @RequiresPermissions("class:update")
    @PostMapping("/updateData")
    public Response<String> updateCosClass(@RequestBody CosCourseSchedule CosCourseSchedule) {
        Response<String> response = new Response<>();
        try {
            cosCourseScheduleService.updateCosCourseSchedule(CosCourseSchedule);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }


    /**
     * 删除
     * @param CosCourseSchedule
     * @return
     */
    @RequiresPermissions("class:delete")
    @PostMapping("/deleteData")
    public Response<String> deleteCosClass(@RequestBody CosCourseSchedule CosCourseSchedule) {
        Response<String> response = new Response<>();
        try {
            cosCourseScheduleService.deleteCosCourseSchedule(CosCourseSchedule);
            response.setResult("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("删除失败");
        }
        return response;
    }


}
