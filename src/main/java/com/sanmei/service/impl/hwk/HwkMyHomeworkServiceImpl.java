package com.sanmei.service.impl.hwk;

import com.sanmei.dao.hwk.HwkMyHomeworkDao;
import com.sanmei.model.hwk.HwkMyHomework;
import com.sanmei.service.inf.hwk.HwkMyHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 21:04
 */
@Service
public class HwkMyHomeworkServiceImpl implements HwkMyHomeworkService {

    @Autowired
    private HwkMyHomeworkDao HwkMyHomeworkDao;

    @Override
    public List<HwkMyHomework> selectHwkMyHomework(HwkMyHomework hwkMyHomework) {
        List<HwkMyHomework> CosClassList = HwkMyHomeworkDao.selectHwkMyHomework(hwkMyHomework);
//        List<HwkMyHomework> dataControl =  HwkMyHomeworkDao.getDataControl(hwkMyHomework);
//        List<HwkMyHomework> CosClassList;
//        if (dataControl.get(0).getDataControl().equals("0"))
//        {
//            CosClassList = HwkMyHomeworkDao.selectHwkMyHomework(hwkMyHomework);
//        }
//        else
//        {
//            CosClassList = HwkMyHomeworkDao.selectHwkMyHomeworkByUserId(hwkMyHomework);
//        }

        return CosClassList;
    }

    @Override
    public Integer addHwkMyHomework(HwkMyHomework hwkMyHomework) {
        int exist = HwkMyHomeworkDao.queryExistMyHomework(hwkMyHomework);
        if (exist > 0) {
            return -1;
        }
        return HwkMyHomeworkDao.addHwkMyHomework(hwkMyHomework);
    }

    @Override
    public Integer updateHwkMyHomework(HwkMyHomework hwkMyHomework) {
        return HwkMyHomeworkDao.updateHwkMyHomework(hwkMyHomework);
    }

    @Override
    public Integer deleteHwkMyHomework(HwkMyHomework hwkMyHomework) {
        return HwkMyHomeworkDao.deleteHwkMyHomework(hwkMyHomework);
    }


}
