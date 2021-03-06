package com.server.rpc;

import java.util.List;

import com.server.dto.SCurentPageDTO;
import com.server.dto.SProductLevelDTO;
import com.server.dto.SProductTalkDTO;
import com.server.dto.STalkShowDTO;

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
	
	List<SProductLevelDTO> getBandList(String bandId, SCurentPageDTO sCurentPageDTO);
	
	List<SProductLevelDTO> getSortList(String sortId, SCurentPageDTO sCurentPageDTO);
	
	List<SProductLevelDTO> getMoreList(Integer more, SCurentPageDTO sCurentPageDTO);
	
	List<STalkShowDTO> getProductTalkList(String prodId);
	
}
