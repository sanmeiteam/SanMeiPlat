package com.sanmei.controller.cos;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.service.inf.cos.CosCoursesService;
import com.sanmei.util.Response;
import com.sanmei.util.model.cos.CosCourses;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
