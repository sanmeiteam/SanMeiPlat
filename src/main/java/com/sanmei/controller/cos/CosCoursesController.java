package com.sanmei.controller.cos;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosCourseType;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.service.inf.cos.CosCoursesService;
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
@RequestMapping(value = "CosCourses")
public class CosCoursesController {

    @Autowired
    private CosCoursesService cosCoursesService;


    /**
     * 查询
     * @param cosCourses
     * @return
     */
    @RequiresPermissions("cos:list")
    @GetMapping(value = "list")
    public Response<List<CosCourses>> selectCosCourses(CosCourses cosCourses) {
        Response<List<CosCourses>> response = new Response<>();
        try {
            List<CosCourses> cosCourses1 = cosCoursesService.selectCosCourses(cosCourses);
            response.setResult(cosCourses1);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }

    @GetMapping("/getCourseType")
    public Response<List<CosCourseType>> getCourseType() {
        Response<List<CosCourseType>> response = new Response<>();
        try {
            List<CosCourseType> CosCourseType = cosCoursesService.getCourseType();
            response.setResult(CosCourseType);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("获取课程列表失败！");
        }
        return response;
    }

    /**
     * 新增
     * @param cosCourses
     * @return
     */
    @RequiresPermissions("cos:add")
    @PostMapping("/addData")
    public Response<String> addCosCourse(@RequestBody CosCourses cosCourses) {
        Response<String> response = new Response<>();
        try {
            int rtnValue=cosCoursesService.addCosCourse(cosCourses);
            if (rtnValue==-1) {
                response.setError("该课程已经存在");
            }
            else {
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
     * @param cosCourses
     * @return
     */
    @RequiresPermissions("cos:update")
    @PostMapping("/updateData")
    public Response<String> updateCosCourses(@RequestBody CosCourses cosCourses) {
        Response<String> response = new Response<>();
        try {
            cosCoursesService.updateCosCourses(cosCourses);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }

    /**
     * 删除
     * @param cosCourses
     * @return
     */
    @RequiresPermissions("cos:delete")
    @PostMapping("/deleteData")
    public Response<String> deleteCosCourses(@RequestBody CosCourses cosCourses) {
        Response<String> response = new Response<>();
        try {
            cosCoursesService.deleteCosCourses(cosCourses);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }
}
