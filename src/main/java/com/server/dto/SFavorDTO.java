package com.server.dto;

import java.io.Serializable;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月15日  新建  
*/
public class SFavorDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3788697999578176225L;

	private Long id;
	
	private String userId;
	
	private String prodId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
	

}
