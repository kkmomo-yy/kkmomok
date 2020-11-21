package com.ws.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ws.pj.sys.pojo.JsonResult;
import com.ws.pj.sys.service.SysHotelService;
//网站地址：http://localhost/dist/hotels
//zhu
//这是一个注释
//代码冲突测试
//代码冲突Test2
//Rick CODE TEst
//代码冲突1874
@Controller
@RequestMapping("/dist/")
public class SysHotelController {
	@Autowired
	SysHotelService sysHotelService;
	@RequestMapping("hotels")
	public String findPageObjects(String hotelName, Integer pageCurrent) {
		return "page/hotels";
	}
	@RequestMapping("findHotelObject")
	public JsonResult findHotelObject(Integer id) {
		return new JsonResult(sysHotelService.findHotelObject(id));
	}
}
