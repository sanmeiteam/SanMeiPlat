package com.sanmei.model.cos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description:
 * @author: goho
 * @date: 2019-04-27
 */
public class CosSignIn implements Serializable {
    private static final long serialVersionUID = 1L;

    private String keywords; //关键字查询
    private String userId; //登录用户ID
    private String dataControl; //数据控制
    private String signUser; //签到人id
    private String nickName; //签到人姓名
    private String phone; //签到人电话
    private String tempScheduleId; //批阅时，按课时选择  课时ID

    private Long id;
    private String courseId; //课程id
    private String courseName; //课程名称
    private Integer scheduleId; //课时ID
    private Integer scheduleNo; //课时编号
    private String scheduleName; //课程表名称
    private String scheduleDate; //课程表开始日期
    private String startTime; //课程表开始时间
    private String signTime;      //签到时间
    private String isSign;      //是否签到
    private String signState;      //签到状态
    private String signUserId;      //签到人id  代
    private String signUserName;      //签到人姓名  代

    private LocalDate createTime;   //创建时间
    private LocalDate updateTime;    //更新时间

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDataControl() {
        return dataControl;
    }

    public void setDataControl(String dataControl) {
        this.dataControl = dataControl;
    }

    public String getSignUser() {
        return signUser;
    }

    public void setSignUser(String signUser) {
        this.signUser = signUser;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTempScheduleId() {
        return tempScheduleId;
    }

    public void setTempScheduleId(String tempScheduleId) {
        this.tempScheduleId = tempScheduleId;
    }

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

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(Integer scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }

    public String getSignState() {
        return signState;
    }

    public void setSignState(String signState) {
        this.signState = signState;
    }

    public String getSignUserId() {
        return signUserId;
    }

    public void setSignUserId(String signUserId) {
        this.signUserId = signUserId;
    }

    public String getSignUserName() {
        return signUserName;
    }

    public void setSignUserName(String signUserName) {
        this.signUserName = signUserName;
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
