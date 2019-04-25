package com.sanmei.dao.cos;

import com.sanmei.model.cos.CosCourseSchedule;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 20:56
 */

public interface CosCourseScheduleDao {

    /**
     * 查询
     * @param CosCourseSchedule
     * @return
     */
    @Transactional
    List<CosCourseSchedule> selectCosCourseSchedule(CosCourseSchedule CosCourseSchedule);

    Integer addCosCourseSchedule(CosCourseSchedule CosCourseSchedule);

    Integer updateCosCourseSchedule(CosCourseSchedule CosCourseSchedule);

    Integer deleteCosCourseSchedule(CosCourseSchedule CosCourseSchedule);

    Integer queryExistCourseSchedule(CosCourseSchedule CosCourseSchedule);
}
