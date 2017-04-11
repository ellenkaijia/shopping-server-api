package com.server.rpc;

import java.util.List;

import com.server.dto.SCurentPageDTO;
import com.server.dto.SProductLevelDTO;
import com.server.dto.SProductTalkDTO;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月6日  新建  
*/
public interface SProductMsService {

	SProductLevelDTO getProductDetail(String prodId);
	
	List<SProductLevelDTO> getProductHot(SCurentPageDTO sCurentPageDTO);
	
	List<SProductLevelDTO> getProductNew(SCurentPageDTO sCurentPageDTO);
	
	List<SProductTalkDTO> getProductTalk(String prodId);
	
}
