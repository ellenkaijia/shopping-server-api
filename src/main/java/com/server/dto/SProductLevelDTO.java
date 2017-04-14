package com.server.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月5日  新建  
*/
public class SProductLevelDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -64682315099588524L;
	
	private Long id;
	
	private String prodId;
	
	private String codeId;
	
	private String prodName;
	
	private String prodDetail;
	
	private String prodTypeName;
	
	private String prodPrizeStr;
	
	private BigDecimal prodPrize;
	
	private String prodFreeTime;
	
	private Integer prodSum;
	
	private Integer prodSellSum;
	
	private Integer status;
	
	private String statusStr;
	
	private Date createTime;
	
	private String bandId;
	
	private Integer prodTypeCode;
	
	private Integer isNew;
	
	private Integer isHot;
	
	private String resId;
	
	private String resParentId;
	
	private Integer resSeq;
	
	private List<String> imgUrls = new ArrayList<String>();
	
	private Integer curPageNO;   //
	
	private Integer curPageNum;
	
	private String orders;
	
	private Integer listTotal = new Integer(0);
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
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

	public String getProdTypeName() {
		return prodTypeName;
	}

	public void setProdTypeName(String prodTypeName) {
		this.prodTypeName = prodTypeName;
	}

	public String getProdPrizeStr() {
		return prodPrizeStr;
	}

	public void setProdPrizeStr(String prodPrizeStr) {
		this.prodPrizeStr = prodPrizeStr;
	}

	public BigDecimal getProdPrize() {
		return prodPrize;
	}

	public void setProdPrize(BigDecimal prodPrize) {
		this.prodPrize = prodPrize;
	}

	public String getProdFreeTime() {
		return prodFreeTime;
	}

	public void setProdFreeTime(String prodFreeTime) {
		this.prodFreeTime = prodFreeTime;
	}

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusStr() {
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getBandId() {
		return bandId;
	}

	public void setBandId(String bandId) {
		this.bandId = bandId;
	}

	public Integer getProdTypeCode() {
		return prodTypeCode;
	}

	public void setProdTypeCode(Integer prodTypeCode) {
		this.prodTypeCode = prodTypeCode;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getResParentId() {
		return resParentId;
	}

	public void setResParentId(String resParentId) {
		this.resParentId = resParentId;
	}

	public Integer getResSeq() {
		return resSeq;
	}

	public void setResSeq(Integer resSeq) {
		this.resSeq = resSeq;
	}

	public List<String> getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(List<String> imgUrls) {
		this.imgUrls = imgUrls;
	}

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

	public Integer getListTotal() {
		return listTotal;
	}

	public void setListTotal(Integer listTotal) {
		this.listTotal = listTotal;
	}

}
