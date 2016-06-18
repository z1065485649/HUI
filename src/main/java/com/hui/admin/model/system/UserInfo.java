package com.hui.admin.model.system;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户登录实体类
 * @author hzw 时间:2016年6月18日
 *
 */
public class UserInfo implements Serializable {
	private static final long serialVersionUID = -6726164321917100729L;
	private String id;
	private String name;
	private String account;//帐号
	private String password;//密码
	private String email;
	private String phone;
	private int status;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String parentId;//主管编号
	
	private RoleInfo roleId;//角色编号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public RoleInfo getRoleId() {
		return roleId;
	}

	public void setRoleId(RoleInfo roleId) {
		this.roleId = roleId;
	}
	
	public UserInfo() {
	}

	public UserInfo(String id, String name, String account, String password, String email, String phone, int status,
			Timestamp createTime, Timestamp updateTime, String parentId, RoleInfo roleId) {
		this.id = id;
		this.name = name;
		this.account = account;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.parentId = parentId;
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", email="
				+ email + ", phone=" + phone + ", status=" + status + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", parentId=" + parentId + ", roleId=" + roleId + "]";
	}
	
}
