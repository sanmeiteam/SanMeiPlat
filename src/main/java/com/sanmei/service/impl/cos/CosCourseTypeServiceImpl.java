package com.sanmei.service.impl.cos;

import com.sanmei.dao.cos.CosCourseTypeDao;
import com.sanmei.model.cos.CosCourseType;
import com.sanmei.service.inf.cos.CosCourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-21 2:56
 */
@Service
public class CosCourseTypeServiceImpl implements CosCourseTypeService {

    @Autowired
    private CosCourseTypeDao cosCourseTypeDao;

    @Override
    public List<CosCourseType> selectCosCourseType(CosCourseType cosCourseType) {
        List<CosCourseType> cosCourseTypes = cosCourseTypeDao.selectCosCourseType(cosCourseType);
        return cosCourseTypes;
    }

    @Override
    public Integer saveCosCourseType(CosCourseType cosCourseType) {
        return null;
    }

    @Override
    public Integer updateCosCourseType(CosCourseType cosCourseType) {
        return null;
    }
}
