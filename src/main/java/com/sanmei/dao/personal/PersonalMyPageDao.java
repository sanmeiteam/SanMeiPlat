package com.sanmei.dao.personal;

import com.sanmei.model.personal.PersonalMyPage;
import com.sanmei.model.sysUser.SysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 20:56
 */

public interface PersonalMyPageDao {

    @Transactional

    List<SysUser> getCurUsers(String userId);
}
