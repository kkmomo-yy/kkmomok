package com.ws.pj.sys.pojo;

import java.io.Serializable;


import lombok.Data;

@Data
public class SysHotel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 酒店名称
	private String hotelName;
	// 酒店介绍
	private String hotelIntroduce;
	// 酒店电话号码
	private Integer hotelNumber;
	// 酒店图片url
	private String hotelPictureUrl;
	// 酒店地址
	private String hotelSite;
	// 三人房价格
	private Integer tripleRoomPrice;
	// 双人房价格
	private Integer doubleRoomPrice;
	// 单人房价格
	private Integer singleRoomPrice;
}
