package com.server.rpc;

import java.util.List;

import com.server.dto.SBandShowDTO;
import com.server.dto.SProductLevelDTO;
import com.server.dto.ShopCarShowDTO;
import com.server.dto.SortShowDTO;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月5日  新建  
*/
public interface ProductLevelMsService {

	List<SProductLevelDTO> getProductLevelByCode(int prodTypeCode);
	
	List<SBandShowDTO> getProductBandAll();
	
	List<SortShowDTO> getSortAll();
	
	List<ShopCarShowDTO> getShopCartList(String userId);
	
	boolean changeShopCartNum(String prodId, Integer num, String userId);
	
	boolean deleteShopCart(String prodId, String userId);
}
