package com.ws.pj.sys.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int state = 1;
	private String messge = "ok";
	
	private Object data;
	public JsonResult(Object data) {
		this.data = data;
	}
	
	public JsonResult(String messge) {
		this.messge = messge;
	}
	
	public JsonResult(Throwable t) {
		this.state = 0;
		this.messge = t.getMessage();
	}
}
