package com.server.rpc;

import java.util.List;

import com.server.dto.SProductLevelDTO;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月6日  新建  
*/
public interface SProductMsService {

	SProductLevelDTO getProductDetail(String prodId);
	
	List<SProductLevelDTO> getProductHot();
	
	List<SProductLevelDTO> getProductNew();
	
}
