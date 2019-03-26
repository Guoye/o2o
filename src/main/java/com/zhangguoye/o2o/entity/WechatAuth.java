package com.zhangguoye.o2o.entity;

import java.util.Date;

public class WechatAuth {
	// 当前表的唯一 id
	private Long wechatAuthId;
	// 关联person_info表的userId
	private Long userId;
	// 微信用户的openId
	private String openId;
	// 创建时间
	private Date createTime;
	
	public Long getWechatAuthId() {
		return wechatAuthId;
	}
	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
