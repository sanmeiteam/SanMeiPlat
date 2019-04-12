package com.sanmei.model.cos;

import java.awt.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description:课程类型类
 * @author: theYuMiao
 * @date: 2019-04-11 15:24
 */
public class CosCourseType implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String courseType; //课程类型名称
    private String deleteStatus; //状态
    private LocalDate createTime; //创建时间
    private LocalDate updateTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }
}
