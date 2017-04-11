package com.server.dto;

import java.io.Serializable;
import java.util.Date;

/**  
* 产品评论类   
*  
* @author zkj  
* @date 2017年4月8日  新建  
*/
public class SProductTalkDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -671475683037274947L;

	private Long id;
	
	private String orderId;
	
	private String prodId;
	
	private String talkMessage;
	
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
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
	
	

}
