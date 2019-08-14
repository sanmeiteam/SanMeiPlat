package com.sanmei.service.inf.personal;

import com.sanmei.model.personal.PersonalMyPage;
import com.sanmei.model.sysUser.SysUser;

import java.util.List;

/**
 * @description: 班级接口
 * @author: goholee
 * @date: 2019-04-10 20:58
 */
public interface PersonalMyPageService {


    //List<PersonalMyPage> selectCosClass(PersonalMyPage CosClass);

    List<SysUser> getUsers(String userId);
}
