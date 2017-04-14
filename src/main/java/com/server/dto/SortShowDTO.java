package com.server.dto;

import java.io.Serializable;

/**
 * 类说明
 * 
 * @author zkj
 * @date 2017年4月12日 新建
 */
public class SortShowDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3951923689215176316L;

	private Long id;

	private String sortId;

	private String sortName;

	private String imgUrl;

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSortId() {
		return sortId;
	}

	public void setSortId(String sortId) {
		this.sortId = sortId;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
}
