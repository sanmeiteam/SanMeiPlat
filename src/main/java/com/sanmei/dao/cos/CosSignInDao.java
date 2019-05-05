package com.sanmei.dao.cos;

import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.cos.CosSignIn;
import com.sanmei.model.sysUser.SysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 20:56
 */

public interface CosSignInDao {

    /**
     * 查询
     * @param cosSignIn
     * @return
     */
    @Transactional
    List<CosSignIn> selectCosSignIn(CosSignIn cosSignIn);

    Integer queryExistSignIn(CosSignIn cosSignIn);

    //返回人员
    List<SysUser> getClassUsers(CosSignIn cosSignIn);

    //返回课时
    List<CosCourseSchedule> getCourseSchedule(CosSignIn cosSignIn);

    Integer addCosSignIn(CosSignIn cosSignIn);
}
