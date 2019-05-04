package com.sanmei.controller.cos;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosCourseType;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.service.inf.cos.CosCourseTypeService;
import com.sanmei.util.Response;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-21 2:58
 */
@RestController
@RequestMapping(value = "CosCourseType")
public class CosCourseTypeController {

    @Autowired
    private CosCourseTypeService cosCourseTypeService;


    /**
     * 查询
     *
     * @param cosCourseType
     * @return
     */
    @RequiresPermissions("cosType:list")
    @GetMapping(value = "list")
    public Response<List<CosCourseType>> selectCosCourseType(CosCourseType cosCourseType) {
        Response<List<CosCourseType>> response = new Response<>();
        try {
            List<CosCourseType> rtnList = cosCourseTypeService.selectCosCourseType(cosCourseType);
            response.setResult(rtnList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }

    /**
     * 新增
     *
     * @param cosCourseType
     * @return
     */
    @RequiresPermissions("cosType:add")
    @PostMapping("/addData")
    public Response<String> addCosCourseType(@RequestBody CosCourseType cosCourseType) {
        Response<String> response = new Response<>();
        try {
            int rtnValue = cosCourseTypeService.addCosCourseType(cosCourseType);
            if (rtnValue == -1) {
                response.setError("该课程已经存在");
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
     * @param cosCourseType
     * @return
     */
    @RequiresPermissions("cosType:update")
    @PostMapping("/updateData")
    public Response<String> updateCosCourseType(@RequestBody CosCourseType cosCourseType) {
        Response<String> response = new Response<>();
        try {
            cosCourseTypeService.updateCosCourseType(cosCourseType);
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
     * @param cosCourseType
     * @return
     */
    @RequiresPermissions("cosType:delete")
    @PostMapping("/deleteData")
    public Response<String> deleteCosCourseType(@RequestBody CosCourseType cosCourseType) {
        Response<String> response = new Response<>();
        try {
            cosCourseTypeService.deleteCosCourseType(cosCourseType);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }

}
