package com.yimayhd.palace.service.impl;

import com.yimayhd.live.client.domain.record.CloseLiveRoomDTO;
import com.yimayhd.live.client.domain.record.LiveRoomDO;
import com.yimayhd.live.client.domain.record.UpdateLiveOrderDTO;
import com.yimayhd.live.client.domain.record.UpdateLiveRecordStatusDTO;
import com.yimayhd.live.client.query.LiveAdminPageQuery;
import com.yimayhd.live.client.query.LiveRoomPageQuery;
import com.yimayhd.live.client.result.record.*;
import com.yimayhd.palace.repo.LiveAdminRepo;
import com.yimayhd.palace.result.BizResult;
import com.yimayhd.palace.service.LiveAdminService;

import javax.annotation.Resource;

/**
 * Created by haozhu on 16/9/21.
 */
public class LiveAdminServiceImpl implements LiveAdminService {

    @Resource
    private LiveAdminRepo liveAdminRepo;

    /**
     * 获取直播列表
     * @param pageQuery
     * @return
     */
    @Override
    public LiveRecordPageResult getPageLiveRecord(LiveAdminPageQuery pageQuery){
        return liveAdminRepo.getPageLiveRecord(pageQuery);
    }

    /**
     * 更新直播排序
     * @param updateLiveOrderDTO
     * @return
     */
    public BizResult<String> updateLiveOrderById(UpdateLiveOrderDTO updateLiveOrderDTO){
        BizResult<String> bizResult = new BizResult<String>();
        UpdateLiveOrderResult updateLiveOrderResult = liveAdminRepo.updateLiveOrderById(updateLiveOrderDTO);
        bizResult.buildSuccessResult(updateLiveOrderDTO);
        return bizResult;
    }

    /**
     * 修改直播记录状态
     * @param updateLiveRecordStatusDTO
     * @return
     */
    public BizResult<String> updateLiveRecordStatus(UpdateLiveRecordStatusDTO updateLiveRecordStatusDTO){
        BizResult<String> bizResult = new BizResult<String>();
        UpdateLiveRecordStatusResult updateLiveRecordStatusResult = liveAdminRepo.updateLiveRecordStatus(updateLiveRecordStatusDTO);
        bizResult.buildSuccessResult(updateLiveRecordStatusResult);
        return bizResult;
    }

    /**
     * 关闭直播
     * @param liveRecordId
     * @return
     */
    public CloseLiveResult closeLive(long liveRecordId){
        return liveAdminRepo.closeLive(liveRecordId);
    }

    /**
     * 创建直播间
     * @param liveRoomDO
     * @return
     */
    public CreateLiveRoomResult createLiveRoom(LiveRoomDO liveRoomDO){
        return liveAdminRepo.createLiveRoom(liveRoomDO);
    }

    /**
     * 查询直播间列表
     * @param liveRoomPageQuery
     * @return
     */
    public LiveRoomPageResult getPageLiveRoom(LiveRoomPageQuery liveRoomPageQuery){
        return liveAdminRepo.getPageLiveRoom(liveRoomPageQuery);
    }

    /**
     * 关闭直播间
     * @param closeLiveRoomDTO
     * @return
     */
    public BizResult<String> closeLiveRoom(CloseLiveRoomDTO closeLiveRoomDTO){
        BizResult<String> bizResult = new BizResult<String>();
        CloseLiveRoomResult closeLiveRoomResult = liveAdminRepo.closeLiveRoom(closeLiveRoomDTO);
        bizResult.buildSuccessResult(closeLiveRoomResult);
        return bizResult;
    }

    /**
     * 恢复直播间
     * @param liveRoomId
     * @return
     */
    public BizResult<String> recoverLiveRoom(long liveRoomId){
        BizResult<String> bizResult = new BizResult<String>();
        RecoverLiveRoomResult recoverLiveRoomResult = liveAdminRepo.recoverLiveRoom(liveRoomId);
        bizResult.buildSuccessResult(recoverLiveRoomResult);
        return bizResult;
    }
}
