package com.sanmei.controller.cos;

import com.sanmei.model.cos.CosCourseType;
import com.sanmei.service.inf.cos.CosCourseTypeService;
import com.sanmei.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping(value = "selectCosCourseType")
    public Response<List<CosCourseType>> selectCosCourseType(CosCourseType cosCourseType) {
        Response<List<CosCourseType>> response = new Response<>();
        List<CosCourseType> cosCourseTypes = cosCourseTypeService.selectCosCourseType(cosCourseType);
        response.setResult(cosCourseTypes);
        return response;
    }

}
