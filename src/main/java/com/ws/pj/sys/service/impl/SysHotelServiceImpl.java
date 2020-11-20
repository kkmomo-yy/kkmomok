package com.ws.pj.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.pj.common.exception.ServiceException;
import com.ws.pj.sys.dao.SysHotelDao;
import com.ws.pj.sys.pojo.PageObject;
import com.ws.pj.sys.pojo.SysHotel;
import com.ws.pj.sys.service.SysHotelService;
@Service
public class SysHotelServiceImpl implements SysHotelService{
	@Autowired
	private SysHotelDao sysHotelDao;
	@Override
	public PageObject<SysHotel> findPageObjects(String hotelName, Integer pageCurrent) {
		//参数校验
				if (pageCurrent == null || pageCurrent < 1)
					throw new IllegalArgumentException("当前页不存在");
				//查询参数校验
				int rowCount = sysHotelDao.getRowCount(hotelName);
				if (rowCount == 0)
					throw new ServiceException("系统没有查到对应记录");
				//计算业务数据
				int pageSize = 10;
				int startIndex = (pageCurrent - 1) * pageSize;
				List<SysHotel> records = sysHotelDao.findPageObjects(hotelName, startIndex, pageSize);
				//数据封装
				PageObject<SysHotel> pageObject = new PageObject<>
				(pageCurrent,pageSize,rowCount,(rowCount - 1) / pageSize + 1,records);
		return pageObject;
	}
	
	@Override
	public SysHotel findHotelObject(Integer id) {
		SysHotel sysHotel = sysHotelDao.findHotelObject(id); 
		return sysHotel;
	}
}
