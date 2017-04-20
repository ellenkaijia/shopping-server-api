package com.server.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月17日  新建  
*/
public class UserBuyDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2785139354044251628L;

	private String prodId;
	
	private Integer buyCount;
	
	private BigDecimal moneySum;
	
	private String prodName;
	
	private Long addressId;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public Integer getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}

	public BigDecimal getMoneySum() {
		return moneySum;
	}

	public void setMoneySum(BigDecimal moneySum) {
		this.moneySum = moneySum;
	}
	
	

}
