package com.server.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月23日  新建  
*/
public class STalkShowDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2163801204138474701L;

	private Long id;
	
	private String talkMessage;
	
	private Date createTime;
	
	private String userName;
	
	private String dateStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTalkMessage() {
		return talkMessage;
	}

	public void setTalkMessage(String talkMessage) {
		this.talkMessage = talkMessage;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateStr() {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		this.dateStr = simpleDateFormat.format(this.createTime);
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	
	
	
}
