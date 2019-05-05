package com.sanmei.dao.hwk;

import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.hwk.HwkMyHomework;
import com.sanmei.model.sysUser.SysUser;
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

    List<HwkMyHomework> selectHwkRemarkHomework(HwkMyHomework hwkMyHomework);

    //返回人员
    List<SysUser> getClassUsers(HwkMyHomework hwkMyHomework);

    //返回课时
    List<CosCourseSchedule> getCourseSchedule(HwkMyHomework hwkMyHomework);

    Integer addHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer uploadHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer remarkHwkMyHomework(HwkMyHomework hwkMyHomework);

}
