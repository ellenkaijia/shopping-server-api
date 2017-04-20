package com.server.rpc;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.server.dto.SAddressDTO;
import com.server.dto.SProductLevelDTO;
import com.server.dto.SUserDTO;
import com.server.dto.SUserOrderShowDTO;
import com.server.dto.ShopCartDTO;

/**
 * 类说明
 * 
 * @author zkj
 * @date 2017年4月14日 新建
 */
public interface UserMsService {

	/**
	 * 登录验证，包括验证码的验证
	 * 
	 * @param sUserDTO
	 * @return
	 */
	Integer checkPassword(SUserDTO sUserDTO);

	/**
	 * 判断手机号码是否被注册
	 * 
	 * @param phone
	 * @return
	 */
	boolean checkPhone(String phone);

	/**
	 * 发送sms短信消息
	 * 
	 * @param phone
	 * @return
	 */
	boolean sendSms(String phone);

	/**
	 * 注册
	 * 
	 * @param sUserDTO
	 * @return
	 */
	Integer registerGo(SUserDTO sUserDTO);

	/**
	 * 查询用户的Id
	 * 
	 * @param sUserDTO
	 * @return
	 */
	String queryUserId(SUserDTO sUserDTO);

	/**
	 * 增加到用户购物车中
	 * 
	 * @param shopCartDTO
	 * @return
	 */
	Integer addShopCart(ShopCartDTO shopCartDTO);

	/**
	 * 获取收藏的数量
	 * 
	 * @param userId
	 * @return
	 */
	Integer getMyFavorCount(String userId);

	/**
	 * 
	 * @param userId
	 * @return
	 */
	SUserDTO getUserAllByUid(String userId);

	/**
	 * 获取购物车中的数量
	 * @param userId
	 * @return
	 */
	Integer getMyShopCartCount(String userId);

	/**
	 * 获取产品详情中是不是被收藏过
	 * @param userId
	 * @param prodId
	 * @return
	 */
	Integer isFavorByUIdProdId(String userId, String prodId);
	
	/**
	 * 加入到用户的收藏列表中
	 * @param userId
	 * @param prodId
	 * @return
	 */
	boolean addInterest(String userId, String prodId);
	
	/**
	 * 取消收藏
	 * @param userId
	 * @param prodId
	 * @return
	 */
	boolean removeInterest(String userId, String prodId);
	
	/**
	 * 获取我的收藏列表
	 * @param userId
	 * @return
	 */
	List<SProductLevelDTO> getMyCollectionList(String userId);
	
	/**
	 * 删除收藏
	 * @param userId
	 * @param prodId
	 * @return
	 */
	boolean removeCollection(String userId, String prodId);
	
	/**
	 * 生成订单
	 * @param userId
	 * @param prodId
	 * @param buyCount
	 * @param moneySum
	 * @return
	 */
	 Map<String, String> tradeIntoOrder(String userId, String prodId, Integer buyCount, BigDecimal moneySum, Long addressId);
	 
	 /**
	  * 购物车交易
	  * @param userId
	  * @param prodIds
	  * @return
	  */
	 Map<String, String> shopCartradeOrder(String userId, String prodIds, Long addressId);
	 
	 /**
	  * 获得订单列表
	  * @param userId
	  * @param status
	  * @return
	  */
	 List<SUserOrderShowDTO> getUserOrder(String userId, Integer status);
	 
	 /**
	  * 获得订单详情的页面数据
	  * @param userId
	  * @param prodId
	  * @return
	  */
	 List<SProductLevelDTO> getOrderByUidPid(String userId, String prodId, Integer prodCount);
	 
	 /**
	  * 获得用户的默认地址
	  * @param userId
	  * @return
	  */
	 SAddressDTO getAddressStatusOne(String userId);
	 
	 /**
	  * 查看是否有地址了
	  * @param userId
	  * @return
	  */
	 boolean isHaveAddress(String userId);
	 
	 /**
	  * 增加用户地址
	  * @param userId
	  * @param sAddressDTO
	  * @return
	  */
	 Integer addAddress(String userId, SAddressDTO sAddressDTO);
	 
	 /**
	  * 获得用户的所有地址
	  * @param userId
	  * @return
	  */
	 List<SAddressDTO> getAddressList(String userId);
	 
	 /**
	  * 删除地址通过ID
	  * @param id
	  * @return
	  */
	 Integer deleteAddress(Integer id);
	 
	 /**
	  * 更新地址的状态
	  * @param userId
	  * @param id
	  * @return
	  */
	 Integer updateAddressStatus(String userId, Integer id);
}
