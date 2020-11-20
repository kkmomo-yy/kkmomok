package com.ws.hoteltest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ws.pj.sys.dao.SysHotelDao;
import com.ws.pj.sys.pojo.PageObject;
import com.ws.pj.sys.pojo.SysHotel;
import com.ws.pj.sys.service.SysHotelService;
@SpringBootTest
public class findhoteltests {
	@Autowired
	SysHotelService sysHotelService;
	@Autowired
	SysHotelDao sysHotelDao;
	@Test
	void test() {
		PageObject<SysHotel> pageObject = 
				sysHotelService.findPageObjects("哈哈哈", 1);
		System.out.println(pageObject);
	}
	@Test
	void daotest() {
		SysHotel sysHotel = sysHotelDao.findHotelObject(1);
		System.out.println(sysHotel.getHotelName());
	}
}
