package com.sanmei.controller.hwk;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.hwk.HwkMyHomework;
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

    @RequiresPermissions("class:list")
    @GetMapping("/list")
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
     * 新增
     * @param HwkMyHomework
     * @return
     */
    @RequiresPermissions("class:add")
    @PostMapping("/addData")
    public Response<String> addHwkMyHomework(@RequestBody HwkMyHomework HwkMyHomework) {
        Response<String> response = new Response<>();
        try {
            int rtnValue=hwkMyHomeworkService.addHwkMyHomework(HwkMyHomework);
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
     * @param HwkMyHomework
     * @return
     */
    @RequiresPermissions("class:update")
    @PostMapping("/updateData")
    public Response<String> updateHwkMyHomework(@RequestBody HwkMyHomework HwkMyHomework) {
        Response<String> response = new Response<>();
        try {
            hwkMyHomeworkService.updateHwkMyHomework(HwkMyHomework);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }


    /**
     * 删除
     * @param HwkMyHomework
     * @return
     */
    @RequiresPermissions("class:delete")
    @PostMapping("/deleteData")
    public Response<String> deleteHwkMyHomework(@RequestBody HwkMyHomework HwkMyHomework) {
        Response<String> response = new Response<>();
        try {
            hwkMyHomeworkService.deleteHwkMyHomework(HwkMyHomework);
            response.setResult("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("删除失败");
        }
        return response;
    }


}
