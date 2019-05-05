package com.sanmei.service.impl.hwk;

import com.sanmei.dao.hwk.HwkMyHomeworkDao;
import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.hwk.HwkMyHomework;
import com.sanmei.model.sysUser.SysUser;
import com.sanmei.service.inf.hwk.HwkMyHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: gohoLee
 * @date: 2019-04-10 21:04
 */
@Service
public class HwkMyHomeworkServiceImpl implements HwkMyHomeworkService {

    @Autowired
    private HwkMyHomeworkDao HwkMyHomeworkDao;

    @Override
    public List<HwkMyHomework> selectHwkMyHomework(HwkMyHomework hwkMyHomework) {
        List<HwkMyHomework> DataList = HwkMyHomeworkDao.selectHwkMyHomework(hwkMyHomework);
        return DataList;
    }

    @Override
    public List<HwkMyHomework> selectHwkRemarkHomework(HwkMyHomework hwkMyHomework) {
        List<HwkMyHomework> DataList = HwkMyHomeworkDao.selectHwkRemarkHomework(hwkMyHomework);
        return DataList;
    }

    @Override
    public List<SysUser> getClassUsers(HwkMyHomework hwkMyHomework) {
        List<SysUser> DataList = HwkMyHomeworkDao.getClassUsers(hwkMyHomework);
        return DataList;
    }

    @Override
    public List<CosCourseSchedule> getCourseSchedule(HwkMyHomework hwkMyHomework) {
        List<CosCourseSchedule> DataList = HwkMyHomeworkDao.getCourseSchedule(hwkMyHomework);
        return DataList;
    }

    @Override
    public Integer uploadHwkMyHomework(HwkMyHomework hwkMyHomework) {
        Integer rtn = HwkMyHomeworkDao.addHwkMyHomework(hwkMyHomework);
        return HwkMyHomeworkDao.uploadHwkMyHomework(hwkMyHomework);
    }

    @Override
    public Integer remarkHwkMyHomework(HwkMyHomework hwkMyHomework) {
        return HwkMyHomeworkDao.remarkHwkMyHomework(hwkMyHomework);
    }

}
