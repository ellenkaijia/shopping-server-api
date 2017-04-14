package com.server.rpc;

import com.server.dto.SUserDTO;

/**  
* 类说明   
*  
* @author zkj  
* @date 2017年4月14日  新建  
*/
public interface UserMsService {

	Integer checkPassword(SUserDTO sUserDTO);
	
	boolean checkPhone(String phone);
	
	boolean sendSms(String phone);
	
	Integer registerGo(SUserDTO sUserDTO);
}
