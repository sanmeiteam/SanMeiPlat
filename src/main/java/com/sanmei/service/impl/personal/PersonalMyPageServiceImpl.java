package com.sanmei.service.impl.personal;

import com.sanmei.dao.personal.PersonalMyPageDao;
import com.sanmei.model.personal.PersonalMyPage;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.personal.PersonalMyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 21:04
 */
@Service
public class PersonalMyPageServiceImpl implements PersonalMyPageService {

    @Autowired
    private PersonalMyPageDao PersonalMyPageDao;


    /**
     *
     * @param
     * @return
     */
    @Override
    public List<SysUser> getUsers(String userId) {
        List<SysUser> SysUserList = PersonalMyPageDao.getCurUsers(userId);
        return SysUserList;
    }
}
