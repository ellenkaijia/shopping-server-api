package com.server.dto;

import java.io.Serializable;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月19日  新建  
*/
public class SAddressDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7484954405792371210L;

	private Long id;
	
	private String userId;
	
	private String userAddress;
	
	private String userPhone;
	
	private Integer status;
	
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

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

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	

}
