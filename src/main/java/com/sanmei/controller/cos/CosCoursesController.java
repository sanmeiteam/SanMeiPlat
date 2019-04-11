package com.sanmei.controller.cos;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.service.inf.cos.CosCoursesService;
import com.sanmei.util.Response;
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
    @GetMapping(value = "selectCosCourses")
    public Response<List<CosCourses>> selectCosCourses(CosCourses cosCourses) {
        Response<List<CosCourses>> response = new Response<>();
        try {
            List<CosCourses> cosCourses1 = cosCoursesService.selectCosCourses(cosCourses);
            response.setResult(cosCourses1);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败,请检查错误");
        }
        return response;
    }


    /**
     * 更新or删除
     * @param cosCourses
     * @return
     */
    @PutMapping(value = "updateCosCourses")
    public Response<String> updateCosCourses(CosCourses cosCourses) {
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
     * 新增
     * @param cosCourses
     * @return
     */
    @PostMapping(value = "saveCosCourses")
    public Response<String> saveCosCourses(CosCourses cosCourses) {
        Response<String> response = new Response<>();
        try {
            cosCoursesService.saveCosCourses(cosCourses);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }
}
