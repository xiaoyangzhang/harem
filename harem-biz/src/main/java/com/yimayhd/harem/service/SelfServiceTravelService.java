package com.yimayhd.harem.service;

import com.yimayhd.harem.model.travel.selfServiceTravel.SelfServiceTravel;

/**
 * 自由行服务
 * 
 * @author yebin
 *
 */
public interface SelfServiceTravelService {
	/**
	 * 发布自由行
	 * 
	 * @param selfServiceTravel
	 * @return
	 * @throws Exception
	 */
	public long publish(SelfServiceTravel selfServiceTravel) throws Exception;

	/**
	 * 查询自由行产品
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public SelfServiceTravel getById(long id) throws Exception;
}
