package com.sanmei.dao.cos;

import com.sanmei.model.cos.CosCourseType;
import com.sanmei.model.cos.CosCourses;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-09 18:57
 */
public interface CosCoursesDao {

    /**
     * 查询方法
     * @param cosCourses
     * @return
     */
    @Transactional
    List<CosCourses> selectCosCourses(CosCourses cosCourses);

    Integer addCosCourse(CosCourses cosCourses);

    Integer updateCosCourses(CosCourses cosCourses);

    Integer deleteCosCourses(CosCourses cosCourses);

    List<CosCourseType> selectCosCourseType();

    List<CosCourses> getCourses(CosCourses cosCourses);

    Integer queryExistCourse(CosCourses cosCourses);
}
