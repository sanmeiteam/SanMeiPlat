package com.sanmei.model.cos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-13 0:20
 */
public class CosCourseSchedule implements Serializable {
    private static final long serialVersionUID = 1L;

    private String keywords; //关键字查询

    private Long id;
    private String courseId; //课程id
    private String courseName; //课程名称
    private Integer scheduleNo; //课时编号
    private String scheduleName; //课程表名称
    private String scheduleDate; //课程表开始日期
    private String period; //时段  上午 下午 晚上
    private String startTime; //课程开始时间：例如8:00，用于签到计算
    private Integer homeworkWords;   //作业字数
    private String lastDate;   //最晚提交作业时间
    private Integer signScore;      //签到学分
    private Integer homeworkTimeScore;      //作业按时提交学分
    private Integer homeworkWordsScore;      //作业字数学分
    private Integer reviewScore;      //讲师评阅学分
    private String deleteStatus; //是否有效
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getHomeworkWords() {
        return homeworkWords;
    }

    public void setHomeworkWords(Integer homeworkWords) {
        this.homeworkWords = homeworkWords;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public Integer getSignScore() {
        return signScore;
    }

    public void setSignScore(Integer signScore) {
        this.signScore = signScore;
    }

    public Integer getHomeworkTimeScore() {
        return homeworkTimeScore;
    }

    public void setHomeworkTimeScore(Integer homeworkTimeScore) {
        this.homeworkTimeScore = homeworkTimeScore;
    }

    public Integer getHomeworkWordsScore() {
        return homeworkWordsScore;
    }

    public void setHomeworkWordsScore(Integer homeworkWordsScore) {
        this.homeworkWordsScore = homeworkWordsScore;
    }

    public Integer getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
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
