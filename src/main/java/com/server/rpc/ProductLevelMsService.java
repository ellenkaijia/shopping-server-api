package com.server.rpc;

import java.util.List;

import com.server.dto.SProductLevelDTO;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月5日  新建  
*/
public interface ProductLevelMsService {

	List<SProductLevelDTO> getProductLevelByCode(int prodTypeCode);
	
}
