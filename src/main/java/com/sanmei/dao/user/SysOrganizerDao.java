package com.sanmei.dao.user;

import com.sanmei.model.sysUser.SysOrganizer;
import com.sanmei.model.sysUser.SysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: goho
 * @date: 2019-04-30 07:45
 */
public interface SysOrganizerDao {

    /**
     * 查询方法
     * @param sysOrganizer
     * @return
     */
    @Transactional
    List<SysOrganizer> selectOrganizer(SysOrganizer sysOrganizer);

    Integer addOrganizer(SysOrganizer sysOrganizer);

    Integer updateOrganizer(SysOrganizer sysOrganizer);

    Integer deleteOrganizer(SysOrganizer sysOrganizer);

    List<SysUser> getUsers();

    Integer queryExistOrganizer(SysOrganizer sysOrganizer);
}
