package com.sanmei.model.sysUser;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @description: 班级模型类
 * @author: goholee
 * @date: 2019-04-10 20:00
 */
public class SysOrganizer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String keywords; //关键字查询

    private Long id;
    private String organizer; //承办方单位
    private String organizerAddress; //承办方 地址
    private String organizerMaster; //承办方负责人id
    private String organizerMasterName; //承办方负责人id
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

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getOrganizerAddress() {
        return organizerAddress;
    }

    public void setOrganizerAddress(String organizerAddress) {
        this.organizerAddress = organizerAddress;
    }

    public String getOrganizerMaster() {
        return organizerMaster;
    }

    public void setOrganizerMaster(String organizerMaster) {
        this.organizerMaster = organizerMaster;
    }

    public String getOrganizerMasterName() {
        return organizerMasterName;
    }

    public void setOrganizerMasterName(String organizerMasterName) {
        this.organizerMasterName = organizerMasterName;
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
