package com.ws.pj.sys.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageObject<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer pageCurrent = 1;
	private Integer pageSize = 0;
	private Integer rowCount = 0;
	private Integer pageCount = 0;
	private List<T> records;
	@Override
	public String toString() {
		return "PageObject [pageCurrent=" + pageCurrent + ", pageSize=" + pageSize + ", rowCount=" + rowCount
				+ ", pageCount=" + pageCount + ", records=" + records + "]";
	}
	
}
