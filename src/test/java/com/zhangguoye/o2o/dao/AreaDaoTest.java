package com.zhangguoye.o2o.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhangguoye.o2o.BaseTest;
import com.zhangguoye.o2o.entity.Area;

public class AreaDaoTest extends BaseTest {

	@Autowired
	private AreaDao areaDao;

	public AreaDaoTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	@Ignore
	public void testQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		assertEquals(4, areaList.size());
	}

	@Test
	@Ignore
	public void testInsertArea() {
		Area area = new Area();
		area.setAreaName("测试名称" + System.currentTimeMillis());
		area.setAreaDesc("测试描述");
		area.setCreateTime(new Date());
		area.setLastEditTime(new Date());
		area.setPriority(111);
		int effectNum = areaDao.insertArea(area);
		assertEquals(1, effectNum);
	}

	@Test
	@Ignore
	public void testUpdateArea() {
		Area area = new Area();
		area.setAreaId(5L);
		area.setAreaName("测试名称123");
		area.setAreaDesc("测试描述123");
//		area.setCreateTime(new Date());
		area.setLastEditTime(new Date());
//		area.setPriority(222);
		int effectNum = areaDao.updateArea(area);
		assertEquals(1, effectNum);
	}

	@Test
//	@Ignore
	public void testDeleteArea() {
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(9);
		ids.add(10);
		ids.add(11);
		int effectNum = areaDao.deleteArea("10");
		assertEquals(1, effectNum);
	}

}
