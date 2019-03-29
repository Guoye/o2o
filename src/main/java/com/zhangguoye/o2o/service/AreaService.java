package com.zhangguoye.o2o.service;

import java.util.List;

import com.zhangguoye.o2o.entity.Area;

public interface AreaService {
	/**
	 * 获取Area列表
	 * @return Area集合
	 */
	List<Area> getAreaList();
	
	/**
	 * 获取Area
	 * @param id area_id
	 * @return Area实体
	 */
	Area getAreaById(Long id);
	
	/**
	 * 增加area
	 * @param area
	 * @return 成功与否
	 */
	Boolean addArea(Area area);
	
	/**
	 * 更新area
	 * @param area
	 * @return 成功与否
	 */
	Boolean updateArea(Area area);
	
	/**
	 * 删除area
	 * @param id
	 * @return 成功与否
	 */
	Boolean deleteArea(Long id);
}
