package com.sanmei.service.inf.cos;

import com.sanmei.model.cos.CosCourseSchedule;

import java.util.List;

/**
 * @description: 班级接口
 * @author: goholee
 * @date: 2019-04-10 20:58
 */
public interface CosCourseScheduleService {

    /**
     * 查询方法
     * @param CosCourseSchedule
     * @return
     */
    List<CosCourseSchedule> selectCosCourseSchedule(CosCourseSchedule CosCourseSchedule);

    Integer updateCosCourseSchedule(CosCourseSchedule CosCourseSchedule);

    Integer addCosCourseSchedule(CosCourseSchedule CosCourseSchedule);

    Integer deleteCosCourseSchedule(CosCourseSchedule CosCourseSchedule);
}
