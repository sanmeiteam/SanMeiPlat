package com.sanmei.service.inf.hwk;

import com.sanmei.model.hwk.HwkMyHomework;

import java.util.List;

/**
 * @description: 班级接口
 * @author: goholee
 * @date: 2019-04-10 20:58
 */
public interface HwkMyHomeworkService {

    /**
     * 查询方法
     * @param hwkMyHomework
     * @return
     */
    List<HwkMyHomework> selectHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer addHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer updateHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer deleteHwkMyHomework(HwkMyHomework hwkMyHomework);

}
