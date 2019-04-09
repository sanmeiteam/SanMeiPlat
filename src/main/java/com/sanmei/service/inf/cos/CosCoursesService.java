package com.sanmei.service.inf.cos;

import com.sanmei.util.model.cos.CosCourses;

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

}
