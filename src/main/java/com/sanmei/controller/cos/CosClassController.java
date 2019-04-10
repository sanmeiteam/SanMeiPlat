package com.sanmei.controller.cos;

import com.sanmei.dao.cos.CosClassDao;
import com.sanmei.service.inf.cos.CosClassService;
import com.sanmei.util.Response;
import com.sanmei.util.model.cos.CosClass;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
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
    private CosClassService CosClassService;

    @RequiresPermissions("user:list")
    @GetMapping("/list")
    public Response<List<CosClass>> selectCosClass(CosClass cosClass) {
        Response<List<CosClass>> response = null;
        try {
            response = new Response<>();
            List<CosClass> CosClassList = CosClassService.selectCosClass(cosClass);
            response.setResult(CosClassList);
        } catch (Exception e) {
            e.printStackTrace();
            response.setError("失败");
        }
        return response;

    }
}
