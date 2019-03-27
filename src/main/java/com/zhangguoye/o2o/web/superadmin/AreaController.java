package com.zhangguoye.o2o.web.superadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhangguoye.o2o.entity.Area;
import com.zhangguoye.o2o.service.AreaService;

@RestController
@RequestMapping("/superadmin/area")
public class AreaController {

	@Autowired
	private AreaService areaService;

	public AreaController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/list")
	public Map<String, Object> listArea() {
		Map<String, Object> modalMap = new HashMap<String, Object>();
		List<Area> list = new ArrayList<Area>();
		try {
			list = areaService.getAreaList();
			modalMap.put("rows", list);
			modalMap.put("total", list.size());
		} catch (Exception e) {
			modalMap.put("success", false);
			modalMap.put("meaasge", e.getMessage());
		}
		
		return modalMap;
	}

}
