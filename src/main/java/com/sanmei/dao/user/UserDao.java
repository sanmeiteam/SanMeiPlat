package com.sanmei.dao.user;

import com.alibaba.fastjson.JSONObject;
import com.sanmei.model.sysUser.SysUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author: hxy
 * @description: 用户/角色/权限
 * @date: 2017-11-14 15:08:45
 */
public interface UserDao {
	/**
	 * 查询用户数量
	 */
	int countUser(JSONObject jsonObject);

	/**
	 * 查询用户列表
	 */
	List<JSONObject> listUser(JSONObject jsonObject);


	/**
	 * 查询我的信息
	 */
	List<SysUser> getMyInfo(SysUser SysUser);

	/**
	 * 修改密码
	 */
	Integer changePsd(SysUser SysUser);

	/**
	 * 修改我的信息
	 */
	Integer updateMyInfo(SysUser SysUser);


	/**
	 * 查询所有的角色
	 * 在添加/修改用户的时候要使用此方法
	 */
	List<JSONObject> getAllRoles();

	/**
	 * 校验用户名是否已存在
	 */
	int queryExistUsername(JSONObject jsonObject);

	/**
	 * 新增用户
	 */
	int addUser(JSONObject jsonObject);

	/**
	 * 修改用户
	 */
	int updateUser(JSONObject jsonObject);

	/**
	 * 角色列表
	 */
	List<JSONObject> listRole();

	/**
	 * 查询所有权限, 给角色分配权限时调用
	 */
	List<JSONObject> listAllPermission();

	/**
	 * 新增角色
	 */
	int insertRole(JSONObject jsonObject);

	/**
	 * 批量插入角色的权限
	 *
	 * @param roleId      角色ID
	 * @param permissions 权限
	 */
	int insertRolePermission(@Param("roleId") String roleId, @Param("permissions") List<Integer> permissions);

	/**
	 * 将角色曾经拥有而修改为不再拥有的权限 delete_status改为'2'
	 */
	int removeOldPermission(@Param("roleId") String roleId, @Param("permissions") List<Integer> permissions);

	/**
	 * 修改角色名称
	 */
	int updateRoleName(JSONObject jsonObject);

	/**
	 * 查询某角色的全部数据
	 * 在删除和修改角色时调用
	 */
	JSONObject getRoleAllInfo(JSONObject jsonObject);

	/**
	 * 删除角色
	 */
	int removeRole(JSONObject jsonObject);

	/**
	 * 删除本角色全部权限
	 */
	int removeRoleAllPermission(JSONObject jsonObject);

	/**
	 * 新增
	 * @param sysUser
	 * @return
	 */
	int saveSysUser(SysUser sysUser);
}
