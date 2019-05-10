package com.sanmei.service.impl.cos;

import com.sanmei.dao.cos.CosSignInDao;
import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.cos.CosSignIn;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.cos.CosSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: gohoLee
 * @date: 2019-04-10 21:04
 */
@Service
public class CosSignInServiceImpl implements CosSignInService {

    @Autowired
    private CosSignInDao cosSignInDao;

    @Override
    public List<CosSignIn> selectCosSignIn(CosSignIn cosSignIn) {
        return cosSignInDao.selectCosSignIn(cosSignIn);
    }

    @Override
    public Integer queryExistSignIn(CosSignIn cosSignIn) {
        return cosSignInDao.queryExistSignIn(cosSignIn);
    }

    @Override
    public List<SysUser> getClassUsers(CosSignIn cosSignIn) {
        return cosSignInDao.getClassUsers(cosSignIn);
    }

    @Override
    public List<CosCourseSchedule> getCourseSchedule(CosSignIn cosSignIn) {
        return cosSignInDao.getCourseSchedule(cosSignIn);
    }

    @Override
    public Integer addCosSignIn(CosSignIn cosSignIn) {
        return cosSignInDao.addCosSignIn(cosSignIn);
    }

    @Override
    public Integer appCosSignIn(CosSignIn cosSignIn) {
        return cosSignInDao.appCosSignIn(cosSignIn);
    }
}
