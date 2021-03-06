package com.sanmei.service.inf.cos;

import com.sanmei.model.cos.CosCourseType;
import com.sanmei.model.cos.CosCourses;
import java.util.List;

/**
 * @description: 课程接口
 * @author: theYuMiao
 * @date: 2019-04-09 19:06
 */
public interface CosCoursesService {

    /**
     * 查询方法
     * @param cosCourses
     * @return
     */
    List<CosCourses> selectCosCourses(CosCourses cosCourses);

    Integer addCosCourse(CosCourses cosCourses);

    Integer updateCosCourses(CosCourses cosCourses);

    Integer deleteCosCourses(CosCourses cosCourses);

    List<CosCourseType> getCourseType();

    List<CosCourses> getCourses(CosCourses cosCourses);
}
