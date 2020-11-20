package com.ws.pj.sys.service;

import com.ws.pj.sys.pojo.PageObject;
import com.ws.pj.sys.pojo.SysHotel;

public interface SysHotelService {
	PageObject<SysHotel> findPageObjects(String hotelName, Integer pageCurrent);
	SysHotel findHotelObject(Integer id);
}
