package com.server.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月17日  新建  
*/
public class SUserOrderShowDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1958091839609319620L;

	private String orderId;
	
	private String prodId;
	
	private String prodName;
	
	private String imgUrl;
	
	private BigDecimal prodPrize;
	
	private BigDecimal prodPrizeSum;
	
	private String dateStr;
	
	private Date createTime;
	
	private Integer status;
	
	private Integer talkStatus;
	
	public Integer getTalkStatus() {
		return talkStatus;
	}

	public void setTalkStatus(Integer talkStatus) {
		this.talkStatus = talkStatus;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public BigDecimal getProdPrize() {
		return prodPrize;
	}

	public void setProdPrize(BigDecimal prodPrize) {
		this.prodPrize = prodPrize;
	}

	public BigDecimal getProdPrizeSum() {
		return prodPrizeSum;
	}

	public void setProdPrizeSum(BigDecimal prodPrizeSum) {
		this.prodPrizeSum = prodPrizeSum;
	}

	public String getDateStr() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.dateStr = simpleDateFormat.format(createTime);
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	

}
