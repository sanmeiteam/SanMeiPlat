package com.sanmei.service.impl.cos;

import com.sanmei.dao.cos.CosCoursesDao;
import com.sanmei.service.inf.cos.CosCoursesService;
import com.sanmei.util.model.cos.CosCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-09 19:07
 */
@Service
public class CosCoursesServiceImpl implements CosCoursesService {

    @Autowired
    private CosCoursesDao cosCoursesDao;

    /**
     * 查询方法
     *
     * @param cosCourses
     * @return
     */
    @Override
    public List<CosCourses> selectCosCourses(CosCourses cosCourses) {
        return cosCoursesDao.selectCosCourses(cosCourses);
    }

    /**
     * 更新方法|| 删除方法
     * @param cosCourses
     * @return
     */
    @Override
    public Integer updateCosCourses(CosCourses cosCourses) {
        return null;
    }

    /**
     * 新增方法
     * @param cosCourses
     * @return
     */
    @Override
    public Integer saveCosCourses(CosCourses cosCourses) {
        return null;
    }
}
