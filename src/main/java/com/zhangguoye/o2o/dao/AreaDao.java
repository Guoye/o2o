package com.zhangguoye.o2o.dao;

import java.util.List;

import com.zhangguoye.o2o.entity.Area;

public interface AreaDao {

	/**
	 * 查询Area表
	 * @return Area的集合
	 */
	List<Area> queryArea();
	
	/**
	 * 以area_id查询数据
	 * @param id area_id
	 * @return Area实体
	 */
	Area queryAreaById(int id);
	
	/**
	 * 插入一条Area的记录
	 * @param area Area实体
	 * @return 操作成功的记录数
	 */
	int insertArea(Area area);
	
	/**
	 * 更新一条Area的记录
	 * @param area Area实体
	 * @return 操作成功的记录数
	 */
	int updateArea(Area area);
	
	/**
	 * 删除一条记录
	 * @param id area_id
	 * @return 操作成功的记录数
	 */
	int deleteArea(int id);
}
