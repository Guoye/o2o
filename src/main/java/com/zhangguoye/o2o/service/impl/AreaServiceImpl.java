package com.zhangguoye.o2o.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangguoye.o2o.dao.AreaDao;
import com.zhangguoye.o2o.entity.Area;
import com.zhangguoye.o2o.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

//	注入AreaDao对象
	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {
		return areaDao.queryArea();
	}

	@Override
	public Area getAreaById(Long id) {
		return areaDao.queryAreaById(id);
	}

	@Override
	public Boolean addArea(Area area) {
		area.setCreateTime(new Date());
		area.setLastEditTime(new Date());
		try {
			int effectNum = areaDao.insertArea(area);
			if (effectNum == 1) {
				return true;
			} else {
				throw new RuntimeException();
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public Boolean updateArea(Area area) {
		area.setLastEditTime(new Date());
		try {
			int effectNum = areaDao.updateArea(area);
			if (effectNum == 1) {
				return true;
			} else {
				throw new RuntimeException();
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public Boolean deleteArea(Long id) {
		try {
			int effectNum = areaDao.deleteArea(id);
			if (effectNum == 1) {
				return true;
			} else {
				throw new RuntimeException();
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
