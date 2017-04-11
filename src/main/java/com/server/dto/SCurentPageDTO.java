package com.server.dto;

import java.io.Serializable;

/**  
* 分页的DTO 
*  
* @author zkj  
* @date 2017年4月9日  新建  
*/
public class SCurentPageDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2003110943622485585L;

	private Integer curPageNO;
	
	private Integer curPageNum;
	
	private String orders;

	public Integer getCurPageNO() {
		return curPageNO;
	}

	public void setCurPageNO(Integer curPageNO) {
		this.curPageNO = curPageNO;
	}

	public Integer getCurPageNum() {
		return curPageNum;
	}

	public void setCurPageNum(Integer curPageNum) {
		this.curPageNum = curPageNum;
	}

	public String getOrders() {
		return orders;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}
	
	

}
