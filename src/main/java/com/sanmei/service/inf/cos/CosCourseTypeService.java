package com.sanmei.service.inf.cos;

import com.sanmei.model.cos.CosCourseType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: theYuMiao
 * @date: 2019-04-11 15:52
 */
public interface CosCourseTypeService {

    List<CosCourseType> selectCosCourseType(CosCourseType cosCourseType);

    Integer saveCosCourseType(CosCourseType cosCourseType);

    Integer updateCosCourseType(CosCourseType cosCourseType);
}
