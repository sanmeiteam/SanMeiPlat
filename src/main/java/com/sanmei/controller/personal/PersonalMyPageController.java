package com.sanmei.controller.personal;

import com.sanmei.config.exception.ArgumentException;
import com.sanmei.model.personal.PersonalMyPage;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.personal.PersonalMyPageService;
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
@RequestMapping(value = "PersonalMyPage")
public class PersonalMyPageController {

    @Autowired
    private PersonalMyPageService personalMyPageService;

    @GetMapping("/curUser")
    public Response<List<SysUser>> getUsers(@RequestParam("0") String userId) {
        Response<List<SysUser>> response = new Response<>();
        try {
            List<SysUser> SysUser = personalMyPageService.getUsers(userId);
            response.setResult(SysUser);
        } catch (ArgumentException e) {
            e.printStackTrace();
            response.setError("获取人员信息失败！");
        }
        return response;
    }



}
