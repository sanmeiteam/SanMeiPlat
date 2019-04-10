package com.sanmei.service.impl.cos;

import com.sanmei.dao.cos.CosClassDao;
import com.sanmei.service.inf.cos.CosClassService;
import com.sanmei.util.model.cos.CosClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
