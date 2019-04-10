package com.sanmei.dao.cos;

import com.sanmei.util.model.cos.CosClass;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 20:56
 */

public interface CosClassDao {

    /**
     *
     * @param CosClass
     * @return
     */
    @Transactional
    List<CosClass> selectCosClass(CosClass CosClass);

}
