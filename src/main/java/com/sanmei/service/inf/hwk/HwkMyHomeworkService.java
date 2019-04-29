package com.sanmei.service.inf.hwk;

import com.sanmei.model.cos.CosCourseSchedule;
import com.sanmei.model.hwk.HwkMyHomework;
import com.sanmei.model.sysUser.SysUser;

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

    List<HwkMyHomework> selectHwkRemarkHomework(HwkMyHomework hwkMyHomework);

    List<SysUser> getClassUsers(HwkMyHomework hwkMyHomework);

    List<CosCourseSchedule> getCourseSchedule(HwkMyHomework hwkMyHomework);

    Integer uploadHwkMyHomework(HwkMyHomework hwkMyHomework);

    Integer remarkHwkMyHomework(HwkMyHomework hwkMyHomework);

}
