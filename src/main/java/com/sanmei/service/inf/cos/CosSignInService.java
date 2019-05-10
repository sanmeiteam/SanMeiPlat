package com.sanmei.service.inf.cos;

import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.cos.CosSignIn;
import com.sanmei.model.sysUser.SysUser;

import java.util.List;

/**
 * @description: 班级接口
 * @author: goholee
 * @date: 2019-04-10 20:58
 */
public interface CosSignInService {

    /**
     * 查询方法
     * @param cosSignIn
     * @return
     */
    List<CosSignIn> selectCosSignIn(CosSignIn cosSignIn);

    Integer queryExistSignIn(CosSignIn cosSignIn);

    List<SysUser> getClassUsers(CosSignIn cosSignIn);

    List<CosCourseSchedule> getCourseSchedule(CosSignIn cosSignIn);

    Integer addCosSignIn(CosSignIn cosSignIn);

    Integer appCosSignIn(CosSignIn cosSignIn);
}
