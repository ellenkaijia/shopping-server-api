package com.server.dto;

import java.io.Serializable;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月14日  新建  
*/
public class SUserDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1400603902818028965L;

	private Long id;
	
	private String userId;
	
	private String userName;
	
	private String userPhone;
	
	private String userPassword;
	
	private String checkCode;
	

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	

}
