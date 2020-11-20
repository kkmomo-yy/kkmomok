package com.ws.pj.sys.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.ws.pj.sys.pojo.SysHotel;

@Mapper
public interface SysHotelDao {
	/**
	 * 
	 * @param hotelName
	 * @return 查询到的记录总数
	 */
	int getRowCount(String hotelName);

	/**
	 * 
	 * @param hotelName
	 * @param startIndex
	 * @param pageSize
	 * @return 查询到的酒店对象List集合
	 */
	List<SysHotel> findPageObjects(String hotelName, Integer startIndex, Integer pageSize);
	
	SysHotel findHotelObject(Integer id);
}
