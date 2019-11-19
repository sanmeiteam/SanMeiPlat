package com.sanmei.model.hwk;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description:
 * @author: goho
 * @date: 2019-04-27
 */
public class HwkMyHomework implements Serializable {
    private static final long serialVersionUID = 1L;

    private String keywords; //关键字查询
    private String userId; //登录用户ID
    private String dataControl; //数据控制
    private String tempUserId; //批阅时，按学员选择  学员ID
    private String tempScheduleId; //批阅时，按课时选择  课时ID

    private Long id;
    private String courseId; //课程id
    private String courseName; //课程名称
    private Integer scheduleId; //课时ID
    private Integer scheduleNo; //课时编号
    private String scheduleName; //课程表名称
    private String scheduleDate; //课程表开始日期
    private String lastDate;   //最晚提交作业时间
    private String hwkUserId;   //作业提交人
    private String userName;   //作业提交人
    private String nickName;   //作业提交人
    private String title;      //作业标题
    private String content;      //作业内容
    private Integer homeworkWords;      //作业字数
    private String secret;      //保密程度 公开程度
    private String comment;      //讲师评语
    private String showComment;      //讲师评语 用于列表显示  显示不开...
    private Integer reviewScore;      //讲师评阅学分
    private String reviewTime;      //讲师评阅时间
    private String reviewTeacherId;      //讲师评阅时间
    private String isReview;      //是否评阅
    private String deleteStatus; //是否有效
    private LocalDate createTime;   //创建时间
    private LocalDate updateTime;    //更新时间

    // 以下用于作业完成情况学分统计
    private Integer signScore;      //签到所得学分
    private Integer hwkScore;      //作业字数所得学分
    private Integer timeScore;      //按时提交作业所得学分
    private Integer actReviewScore;      //讲师评阅所得学分
    private Integer scores;    //课时总学分


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

    public String getTempUserId() {
        return tempUserId;
    }

    public void setTempUserId(String tempUserId) {
        this.tempUserId = tempUserId;
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

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getHwkUserId() {
        return hwkUserId;
    }

    public void setHwkUserId(String hwkUserId) {
        this.hwkUserId = hwkUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getHomeworkWords() {
        return homeworkWords;
    }

    public void setHomeworkWords(Integer homeworkWords) {
        this.homeworkWords = homeworkWords;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShowComment() {
        return showComment;
    }

    public void setShowComment(String showComment) {
        this.showComment = showComment;
    }

    public Integer getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getReviewTeacherId() {
        return reviewTeacherId;
    }

    public void setReviewTeacherId(String reviewTeacherId) {
        this.reviewTeacherId = reviewTeacherId;
    }

    public String getIsReview() {
        return isReview;
    }

    public void setIsReview(String isReview) {
        this.isReview = isReview;
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

    public Integer getSignScore() {
        return signScore;
    }

    public void setSignScore(Integer signScore) {
        this.signScore = signScore;
    }

    public Integer getHwkScore() {
        return hwkScore;
    }

    public void setHwkScore(Integer hwkScore) {
        this.hwkScore = hwkScore;
    }

    public Integer getTimeScore() {
        return timeScore;
    }

    public void setTimeScore(Integer timeScore) {
        this.timeScore = timeScore;
    }

    public Integer getActReviewScore() {
        return actReviewScore;
    }

    public void setActReviewScore(Integer actReviewScore) {
        this.actReviewScore = actReviewScore;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }
}
