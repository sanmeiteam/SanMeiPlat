package com.sanmei.service.inf.user;

import com.sanmei.model.sysUser.SysOrganizer;
import com.sanmei.model.sysUser.SysUser;

import java.util.List;

/**
 * @description: 课程接口
 * @author: theYuMiao
 * @date: 2019-04-09 19:06
 */
public interface SysOrganizerService {

    /**
     * 查询方法
     * @param sysOrganizer
     * @return
     */
    List<SysOrganizer> selectOrganizer(SysOrganizer sysOrganizer);

    Integer addOrganizer(SysOrganizer sysOrganizer);

    Integer updateOrganizer(SysOrganizer sysOrganizer);

    Integer deleteOrganizer(SysOrganizer sysOrganizer);

    List<SysUser> getUsers();

    List<SysOrganizer> getOrganizer();

}
