package com.sanmei.model.cos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description: 课程模型类
 * @author: theYuMiao
 * @date: 2019-04-09 18:20
 */
public class CosCourses implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String courseTypeId; //课程类型id
    private String courseNumber; //课程期数
    private String courseName;   //课程名称
    private String teacher;      //授课老师
    private String address;      //地址  ??? 什么地址
    private String startTime;    //开始时间
    private String signTeacher;  //报名老师
    private String signTel;      //报名电话
    private String organizer;    //承办方
    private String deleteStatus; //是否有效
    private LocalDate createTime;   //创建时间
    private LocalDate updateTime;    //更新时间
    private String courseType; //课程类型

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getSignTeacher() {
        return signTeacher;
    }

    public void setSignTeacher(String signTeacher) {
        this.signTeacher = signTeacher;
    }

    public String getSignTel() {
        return signTel;
    }

    public void setSignTel(String signTel) {
        this.signTel = signTel;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
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
