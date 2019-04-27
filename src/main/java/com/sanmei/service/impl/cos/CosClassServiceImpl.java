package com.sanmei.service.impl.cos;

import com.sanmei.dao.cos.CosClassDao;
import com.sanmei.model.cos.CosClass;
import com.sanmei.model.cos.CosCourses;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.cos.CosClassService;
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
public class CosClassServiceImpl implements CosClassService {

    @Autowired
    private CosClassDao CosClassDao;
    /**
     *
     * @param CosClass
     * @return
     */
    @Override
    public List<CosClass> selectCosClass(CosClass CosClass) {
        List<CosClass> CosClassList = CosClassDao.selectCosClass(CosClass);
        return CosClassList;
    }

    /**
     * 更新方法
     * @param CosClass
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer updateCosClass(CosClass CosClass) {
        return CosClassDao.updateCosClass(CosClass);
    }

    /**
     * 添加方法
     * @param CosClass
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer addCosClass(CosClass CosClass) {
        return CosClassDao.addCosClass(CosClass);
    }

    /**
     * 删除方法
     * @param CosClass
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer deleteCosClass(CosClass CosClass) {
        return CosClassDao.deleteCosClass(CosClass);
    }


    /**
     *
     * @param
     * @return
     */
    @Override
    public List<SysUser> getUsers() {
        List<SysUser> SysUserList = CosClassDao.getUsers();
        return SysUserList;
    }
}
