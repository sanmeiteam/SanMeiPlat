package com.sanmei.dao.cos;

import com.sanmei.model.cos.CosCourseType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-11 15:28
 */
public interface CosCourseTypeDao {

    List<CosCourseType> selectCosCourseType(CosCourseType cosCourseType);

    @Transactional(rollbackFor = Exception.class)
    Integer saveCosCourseType(CosCourseType cosCourseType);

    @Transactional(rollbackFor = Exception.class)
    Integer updateCosCourseType(CosCourseType cosCourseType);
}
