package com.yimayhd.palace.model.vo;

import com.yimayhd.palace.model.query.ScenicSpotListQuery;
import com.yimayhd.ic.client.model.domain.ScenicDO;

/**
 * Created by Administrator on 2015/11/18.
 */
public class ScenicSpotVO {
    private ScenicDO scenicDO;
    private ScenicSpotListQuery scenicSpotListQuery;
	public ScenicDO getScenicDO() {
		return scenicDO;
	}
	public void setScenicDO(ScenicDO scenicDO) {
		this.scenicDO = scenicDO;
	}
	public ScenicSpotListQuery getScenicSpotListQuery() {
		return scenicSpotListQuery;
	}
	public void setScenicSpotListQuery(ScenicSpotListQuery scenicSpotListQuery) {
		this.scenicSpotListQuery = scenicSpotListQuery;
	}
    
    

   
}
