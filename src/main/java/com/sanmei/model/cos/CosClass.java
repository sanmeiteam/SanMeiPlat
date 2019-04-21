package com.sanmei.model.cos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description: 班级模型类
 * @author: goholee
 * @date: 2019-04-10 20:00
 */
public class CosClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private String keywords; //关键字查询

    private Long id;
    private String courseId; //课程id
    private String courseName; //课程名称
    private String userId; //用户id
    private String username; //用户名
    private String nickname; //姓名
    private String sex;   //性别
    private String role;   //班内角色
    private String oldMember;      //是否老学员：1是，0否
    private String score;      //分数
    private String deleteStatus; //是否有效
    private LocalDate createTime;   //创建时间
    private LocalDate updateTime;    //更新时间

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getKeywords() { return keywords;}

    public void setKeywords(String keywords) { this.keywords = keywords;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOldMember() {
        return oldMember;
    }

    public void setOldMember(String oldMember) {
        this.oldMember = oldMember;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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
