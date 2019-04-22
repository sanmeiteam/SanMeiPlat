package com.sanmei.service.inf.cos;

import com.sanmei.model.cos.CosClass;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.model.sysUser.SysUser;

import java.util.List;

/**
 * @description: 班级接口
 * @author: goholee
 * @date: 2019-04-10 20:58
 */
public interface CosClassService {

    /**
     * 查询方法
     * @param CosClass
     * @return
     */
    List<CosClass> selectCosClass(CosClass CosClass);

    Integer updateCosClass(CosClass CosClass);

    Integer addCosClass(CosClass CosClass);

    Integer deleteCosClass(CosClass CosClass);

    List<CosCourses> getCourses();

    List<SysUser> getUsers();
}
