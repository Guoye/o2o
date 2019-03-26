package com.zhangguoye.o2o.entity;

import java.util.Date;

public class LocalAuth {
	// 当前表的唯一 id
	private Long localAuthId;
	// 关联person_info表的userId
	private Long userId;
	// 登录用户名
	private String username;
	// 登录用户密码
	private String password;
	// 创建时间
	private Date createTime;
	// 最后修改时间
	private Date lastEditTime;
	
	public Long getLocalAuthId() {
		return localAuthId;
	}
	public void setLocalAuthId(Long localAuthId) {
		this.localAuthId = localAuthId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
}
