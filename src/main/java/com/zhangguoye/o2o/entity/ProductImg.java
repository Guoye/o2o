package com.zhangguoye.o2o.entity;

import java.util.Date;

public class ProductImg {
	// 当前表的唯一 id
	private Long productImgId;
	// 图片地址
	private String img_addr;
	// 图片描述
	private String img_desc;
	// 权重
	private Integer priority;
	// 创建时间
	private Date createTime;
	// 关联产品的id
	private Long product_id;
	
	public Long getProductImgId() {
		return productImgId;
	}
	public void setProductImgId(Long productImgId) {
		this.productImgId = productImgId;
	}
	public String getImg_addr() {
		return img_addr;
	}
	public void setImg_addr(String img_addr) {
		this.img_addr = img_addr;
	}
	public String getImg_desc() {
		return img_desc;
	}
	public void setImg_desc(String img_desc) {
		this.img_desc = img_desc;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
}
