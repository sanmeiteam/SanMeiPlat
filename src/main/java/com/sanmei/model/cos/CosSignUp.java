package com.sanmei.model.cos;

import org.apache.tomcat.jni.Local;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-13 1:03
 */
public class CosSignUp implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer scheduleId; //课程计划表id
    private Integer userId;     //用户id
    private LocalDate signTime; //签到时间

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDate getSignTime() {
        return signTime;
    }

    public void setSignTime(LocalDate signTime) {
        this.signTime = signTime;
    }
}
