package com.server.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月15日  新建  
*/
public class ShopCarShowDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6194402144881093448L;

	private String prodId;
	
	private String prodName;
	
	private String bandName;
	
	private String prodDetail;
	
	private Integer prodCount;
	
	private Integer prodSum;
	
	private Integer prodSellSum;
	
	private BigDecimal prodPrize;
	
	private String imgUrl;
	
	
	public Integer getProdSum() {
		return prodSum;
	}

	public void setProdSum(Integer prodSum) {
		this.prodSum = prodSum;
	}

	public Integer getProdSellSum() {
		return prodSellSum;
	}

	public void setProdSellSum(Integer prodSellSum) {
		this.prodSellSum = prodSellSum;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDetail() {
		return prodDetail;
	}

	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}

	public Integer getProdCount() {
		return prodCount;
	}

	public void setProdCount(Integer prodCount) {
		this.prodCount = prodCount;
	}

	public BigDecimal getProdPrize() {
		return prodPrize;
	}

	public void setProdPrize(BigDecimal prodPrize) {
		this.prodPrize = prodPrize;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
