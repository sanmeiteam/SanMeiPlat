package com.sanmei.dao.hwk;

import com.sanmei.model.hwk.HwkMyHomework;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: goholee
 * @date: 2019-04-10 20:56
 */

public interface HwkMyHomeworkDao {

    /**
     * 查询
     * @param hwkMyHomework
     * @return
     */
    @Transactional
    List<HwkMyHomework> selectHwkMyHomework(HwkMyHomework hwkMyHomework);

    List<HwkMyHomework> selectHwkMyHomeworkByUserId(HwkMyHomework hwkMyHomework);

    Integer addHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer updateHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer deleteHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer queryExistMyHomework(HwkMyHomework hwkMyHomework);

    List<HwkMyHomework> getDataControl(HwkMyHomework hwkMyHomework);
}
