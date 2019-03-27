package com.zhangguoye.o2o.dao;

import java.util.List;

import com.zhangguoye.o2o.entity.Area;

public interface AreaDao {
	/*
	 * 
	 */
	List<Area> queryArea();
	
	Area queryAreaById(int id);
	
	int insertArea(Area area);
	
	int updateArea(Area area);
	
	int deleteArea(int id);
}
