package com.sanmei.service.impl.cos;

import com.sanmei.dao.cos.CosCourseScheduleDao;
import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.service.inf.cos.CosCourseScheduleService;
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
public class CosCourseScheduleServiceImpl implements CosCourseScheduleService {

    @Autowired
    private CosCourseScheduleDao CosCourseScheduleDao;


    @Override
    public List<CosCourseSchedule> selectCosCourseSchedule(CosCourseSchedule CosCourseSchedule) {
        List<CosCourseSchedule> CosClassList = CosCourseScheduleDao.selectCosCourseSchedule(CosCourseSchedule);
        return CosClassList;
    }

    @Override
    public Integer updateCosCourseSchedule(CosCourseSchedule CosCourseSchedule) {
        return CosCourseScheduleDao.updateCosCourseSchedule(CosCourseSchedule);
    }

    @Override
    public Integer addCosCourseSchedule(CosCourseSchedule CosCourseSchedule) {
        int exist = CosCourseScheduleDao.queryExistCourseSchedule(CosCourseSchedule);
        if (exist > 0) {
            return -1;
        }
        return CosCourseScheduleDao.addCosCourseSchedule(CosCourseSchedule);
    }

    @Override
    public Integer deleteCosCourseSchedule(CosCourseSchedule CosCourseSchedule) {
        return CosCourseScheduleDao.deleteCosCourseSchedule(CosCourseSchedule);
    }
}
