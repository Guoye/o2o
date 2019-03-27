package com.zhangguoye.o2o.dao;

import static org.junit.Assert.*;

import java.util.List;

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
	public void testQueryArea() {
		List<Area> areaList = areaDao.queryArea();
		assertEquals(4, areaList.size());
	}

}
