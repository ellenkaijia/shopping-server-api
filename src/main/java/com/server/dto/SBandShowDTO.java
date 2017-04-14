package com.server.dto;

import java.io.Serializable;

/**
 * 类说明
 * 
 * @author zkj
 * @date 2017年4月11日 新建
 */
public class SBandShowDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9011733132842815619L;

	private Long id;

	private String bandName;

	private String bandId;
	
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

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String getBandId() {
		return bandId;
	}

	public void setBandId(String bandId) {
		this.bandId = bandId;
	}
	
}
