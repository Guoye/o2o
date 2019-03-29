package com.zhangguoye.o2o.web.superadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.FormSubmitEvent.MethodType;
import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhangguoye.o2o.entity.Area;
import com.zhangguoye.o2o.service.AreaService;

@RestController
@RequestMapping("/superadmin/area")
public class AreaController {

	Logger logger = LoggerFactory.getLogger(AreaController.class);

	@Autowired
	private AreaService areaService;

	public AreaController() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 查询area列表
	 * @return area列表
	 */
	@RequestMapping("/list")
	public Map<String, Object> listArea() {
		logger.info("=========start==========");
		Long startTime = System.currentTimeMillis();
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
		logger.error("ERROR!测试出错日志!");
		Long endTime = System.currentTimeMillis();
		logger.debug("costTime:[{}ms]", endTime - startTime);
		logger.info("=========end==========");
		return modalMap;
	}
	
	/**
	 * 根据id查area
	 * @param id  area_id
	 * @return area
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getAreaById(@PathVariable("id") Long id){
		Map<String, Object> modalMap = new HashMap<String, Object>();
		modalMap.put("data", areaService.getAreaById(id));
		return modalMap;
	}
	
	/**
	 * 添加area
	 * @param area 实体
	 * @return boolean
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Boolean addArea(@RequestBody Area area) {
		Boolean b = areaService.addArea(area);
		if (b) {
			return true;
		}
		return false;
	}
	
	/**
	 * 修改area
	 * @param area 实体
	 * @return boolean
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Boolean updateArea(@RequestBody Area area) {
		Boolean b = areaService.updateArea(area);
		if (b) {
			return true;
		}
		return false;
	}
	
	/**
	 * 删除area
	 * @param id area_id
	 * @return boolean
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public Boolean updateArea(@PathVariable Long id) {
		Boolean b = areaService.deleteArea(id);
		if (b) {
			return true;
		}
		return false;
	}

}
