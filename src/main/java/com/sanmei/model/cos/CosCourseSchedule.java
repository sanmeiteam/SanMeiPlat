package com.sanmei.model.cos;

import java.io.Serializable;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-13 0:20
 */
public class CosCourseSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer courseId; //课程id
    private String scheduleName; //课程表名字

    private String scheduleDate; //课程表日期


}
