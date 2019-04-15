package com.sanmei.controller.cos;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.cos.CosClass;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.service.inf.cos.CosClassService;
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
@RequestMapping(value = "CosClass")
public class CosClassController {

    @Autowired
    private CosClassService cosClassService;

    @RequiresPermissions("class:list")
    @GetMapping("/list")
    public Response<List<CosClass>> selectCosClass(CosClass cosClass) {
        Response<List<CosClass>> response = new Response<>();
        try {
            List<CosClass> CosClassList = cosClassService.selectCosClass(cosClass);
            response.setResult(CosClassList);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("查询失败！");
        }
        return response;
    }

    @GetMapping("/getCourses")
    public CosCourses getCourses() {
        return cosClassService.getCourses();
    }

    /**
     * 更新
     * @param CosClass
     * @return
     */
    @RequiresPermissions("class:update")
    @GetMapping("/updateData")
    public Response<String> updateCosClass(CosClass CosClass) {
        Response<String> response = new Response<>();
        try {
            cosClassService.updateCosClass(CosClass);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }

    /**
     * 新增
     * @param CosClass
     * @return
     */
    @GetMapping("/addData")
    public Response<String> addCosClass(CosClass CosClass) {
        Response<String> response = new Response<>();
        try {
            cosClassService.addCosClass(CosClass);
            response.setResult("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("更新失败");
        }
        return response;
    }

    /**
     * 删除
     * @param CosClass
     * @return
     */
    @GetMapping("/deleteData")
    public Response<String> deleteCosClass(CosClass CosClass) {
        Response<String> response = new Response<>();
        try {
            cosClassService.deleteCosClass(CosClass);
            response.setResult("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("删除失败");
        }
        return response;
    }


}
