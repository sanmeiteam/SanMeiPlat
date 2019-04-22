package com.sanmei.dao.cos;

import com.sanmei.model.cos.CosClass;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.model.sysUser.SysUser;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 20:56
 */

public interface CosClassDao {

    /**
     * 查询
     * @param CosClass
     * @return
     */
    @Transactional
    List<CosClass> selectCosClass(CosClass CosClass);

    Integer updateCosClass(CosClass CosClass);

    Integer addCosClass(CosClass CosClass);

    Integer deleteCosClass(CosClass CosClass);

    List<CosCourses> getCourses();

    List<SysUser> getUsers();
}
