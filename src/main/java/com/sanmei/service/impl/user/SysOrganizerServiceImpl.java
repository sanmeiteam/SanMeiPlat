package com.sanmei.service.impl.user;

import com.sanmei.dao.user.SysOrganizerDao;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.model.sysUser.SysOrganizer;
import com.sanmei.service.inf.user.SysOrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-09 19:07
 */
@Service
public class SysOrganizerServiceImpl implements SysOrganizerService {

    @Autowired
    private SysOrganizerDao sysOrganizerDao;

    /**
     * 查询方法
     *
     * @param sysOrganizer
     * @return
     */
    @Override
    public List<SysOrganizer> selectOrganizer(SysOrganizer sysOrganizer) {
        return sysOrganizerDao.selectOrganizer(sysOrganizer);
    }

    @Override
    public List<SysUser> getUsers() {
        return sysOrganizerDao.getUsers();
    }



    /**
     * 新增方法
     * @param sysOrganizer
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer addOrganizer(SysOrganizer sysOrganizer) {
        int exist = sysOrganizerDao.queryExistOrganizer(sysOrganizer);
        if (exist > 0) {
            return -1;
        }
        return sysOrganizerDao.addOrganizer(sysOrganizer);
    }

    /**
     * 更新方法
     * @param sysOrganizer
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer updateOrganizer(SysOrganizer sysOrganizer) {
        return sysOrganizerDao.updateOrganizer(sysOrganizer);

    }

    /**
     * 删除方法
     * @param sysOrganizer
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer deleteOrganizer(SysOrganizer sysOrganizer) {
        return sysOrganizerDao.deleteOrganizer(sysOrganizer);

    }


}
