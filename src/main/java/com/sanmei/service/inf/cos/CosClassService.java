package com.sanmei.service.inf.cos;

import com.sanmei.model.cos.CosClass;
import java.util.List;

/**
 * @description: 班级接口
 * @author: goholee
 * @date: 2019-04-10 20:58
 */
public interface CosClassService {

    /**
     * 查询方法
     * @param CosClass
     * @return
     */
    List<CosClass> selectCosClass(CosClass CosClass);

}
