package com.yimayhd.harem.service;

import java.util.List;

import com.yimayhd.harem.base.PageVO;
import com.yimayhd.harem.model.User;
import com.yimayhd.harem.model.query.TradeMemberQuery;
import com.yimayhd.harem.model.query.UserListQuery;
import com.yimayhd.membercenter.client.domain.TravelKaVO;
import com.yimayhd.membercenter.client.query.TravelkaPageQuery;
import com.yimayhd.user.client.domain.UserDO;

/**
 * @author
 */
public interface UserService {

	/**
	 * 根据俱乐部ID获取俱乐部成员列表
	 * 
	 * @param clubId
	 *            俱乐部ID
	 * @return
	 * @throws Exception
	 */
	List<User> getClubMemberListByClubId(long clubId);

	/**
	 * 获取用户列表
	 * 
	 * @param query
	 * @return
	 * @throws Exception
	 */
	PageVO<User> getUserListByPage(UserListQuery query);

	/**
	 * 用过用户id查找用户
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	User getUserById(long id);
	// 商贸部分

	/**
	 * 根据商贸用户id获取会员列表
	 *
	 * @param sellerId
	 *            商家ID
	 * @return 会员列表
	 * @throws Exception
	 */
	PageVO<UserDO> getMemberByUserId(long sellerId, TradeMemberQuery tradeMemberQuery) throws Exception;

	/**
	 * 获取旅游咖列表
	 * 
	 * @param query
	 * @return
	 * @throws Exception
	 */
	PageVO<TravelKaVO> getTravelKaListByPage(TravelkaPageQuery query);

	/**
	 * 获取旅游咖详细信息
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TravelKaVO getTravelKaById(long id);
}
