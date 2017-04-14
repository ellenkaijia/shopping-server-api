package com.server.dto;

import java.io.Serializable;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月11日  新建  
*/
public class SBandDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3237314309374898484L;

	private Long id;
	
	private String bandName;
	
	private String bandId;
	
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
