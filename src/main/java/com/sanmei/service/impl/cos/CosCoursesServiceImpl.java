package com.sanmei.service.impl.cos;

import com.sanmei.dao.cos.CosCoursesDao;
import com.sanmei.model.cos.CosCourseType;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.service.inf.cos.CosCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Override
    public List<CosCourseType> getCourseType() {
        return cosCoursesDao.selectCosCourseType();
    }

    /**
     * 新增方法
     * @param cosCourses
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer addCosCourse(CosCourses cosCourses) {
        return cosCoursesDao.addCosCourse(cosCourses);
    }

    /**
     * 更新方法
     * @param cosCourses
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer updateCosCourses(CosCourses cosCourses) {
        return cosCoursesDao.updateCosCourses(cosCourses);

    }

    /**
     * 删除方法
     * @param cosCourses
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer deleteCosCourses(CosCourses cosCourses) {
        return cosCoursesDao.deleteCosCourses(cosCourses);

    }


}
