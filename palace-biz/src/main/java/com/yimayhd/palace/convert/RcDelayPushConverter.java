package com.yimayhd.palace.convert;

import com.google.common.base.Strings;
import com.yimayhd.palace.model.vo.PushVO;
import com.yimayhd.palace.util.HandleFilesUtils;
import com.yimayhd.resourcecenter.domain.RcDelayPush;
import com.yimayhd.resourcecenter.model.enums.DelayPushFeatureKey;
import com.yimayhd.resourcecenter.model.enums.RcDelayType;
import com.yimayhd.resourcecenter.model.enums.ShowcaseFeatureKey;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by liuxp on 2016/10/13.
 */
public class RcDelayPushConverter {

    public static List<PushVO> convertToList(List<RcDelayPush> rcDelayPushList) {
        List<PushVO> pushVOList = new ArrayList<PushVO>();
        if(rcDelayPushList==null){
            return pushVOList;
        }
        for (RcDelayPush rcDelayPush : rcDelayPushList) {
            PushVO pushVO = convertRcDelayPushToPushVo(rcDelayPush);
            pushVOList.add(pushVO);
        }
        return pushVOList;
    }

    public static PushVO convertRcDelayPushToPushVo(RcDelayPush rcDelayPush) {
        PushVO pushVO = new PushVO();
        pushVO.setId(rcDelayPush.getId());
        pushVO.setSubject(rcDelayPush.getTitle());
        pushVO.setPushContent(rcDelayPush.getContent());
        pushVO.setStatus(rcDelayPush.getStatus());
        pushVO.setCreateDate(rcDelayPush.getGmtCreate());
        pushVO.setOperationUserId(rcDelayPush.getCreateUserId());
        pushVO.setDomain(Integer.parseInt(rcDelayPush.getDomainId()+""));
        pushVO.setMsgTitle(rcDelayPush.getMessageTitle());
        pushVO.setMsgContent(rcDelayPush.getMessageContent());
        pushVO.setOperation(rcDelayPush.getOpreationCode());
        pushVO.setOperationContent(rcDelayPush.getOpreationValue());
        pushVO.setOutId(rcDelayPush.getOutId());
        pushVO.setUpdateDate(rcDelayPush.getGmtModify());
        pushVO.setPushType(rcDelayPush.getSendType());
        pushVO.setPushModelType(rcDelayPush.getSendTargetType());
        pushVO.setPushModelFilePath(rcDelayPush.getLocalFileUrl());
        pushVO.setPushDate(rcDelayPush.getSendTime());
        pushVO.setSeePeople(rcDelayPush.getSeePeople());
        pushVO.setSendPeople(rcDelayPush.getSendPeople());
        pushVO.setSendDomainId(rcDelayPush.getSendDomainId());
        pushVO.setFeature(rcDelayPush.getFeature());
        pushVO.setOperationDetailId(pushVO.getRcFeature(DelayPushFeatureKey.DEFAULT_SHOW_DOCUMENT));
        pushVO.setSelectOpContent(pushVO.getRcFeature(DelayPushFeatureKey.SHOW_DOCUMENT));
        pushVO.setFileName(pushVO.getRcFeature(DelayPushFeatureKey.FILE_NAME));
        return pushVO;
    }

    public static RcDelayPush convertPushVOToRcDelayPush(PushVO pushVO) {
        RcDelayPush rcDelayPush = new RcDelayPush();
        if(0!=pushVO.getId()) {
            rcDelayPush.setId(pushVO.getId());
        }
        rcDelayPush.setOpreationValue(pushVO.getOperation());
        rcDelayPush.setOpreationValue(pushVO.getOperationContent());
        rcDelayPush.setType(RcDelayType.PUSH.getCode());
        rcDelayPush.setSendType(pushVO.getPushType());
        Date d ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            d = sdf.parse(pushVO.getPushDateStr());
        } catch (ParseException e) {
            d = new Date();
        }
        rcDelayPush.setSendTime(d);
        rcDelayPush.setContent(pushVO.getPushContent());
        rcDelayPush.setCreateUserId(pushVO.getOperationUserId());
        rcDelayPush.setDomainId(pushVO.getDomain());
        rcDelayPush.setLocalFileUrl(pushVO.getPushModelFilePath());
        rcDelayPush.setMessageContent(pushVO.getMsgContent());
        rcDelayPush.setMessageTitle(pushVO.getMsgTitle());
        rcDelayPush.setOpreationCode(pushVO.getOperation());
        rcDelayPush.setOpreationValue(pushVO.getOperationContent());
        rcDelayPush.setTransformFileUrl(pushVO.getTransformFileUrl());
        rcDelayPush.setSendDomainId(pushVO.getSendDomainId());
        rcDelayPush.setTitle(pushVO.getSubject());
        rcDelayPush.setSendTargetType(pushVO.getPushModelType());
        pushVO.addFeature(DelayPushFeatureKey.DEFAULT_SHOW_DOCUMENT,pushVO.getOperationDetailId());
        pushVO.addFeature(DelayPushFeatureKey.SHOW_DOCUMENT,pushVO.getSelectOpContent());
        pushVO.addFeature(DelayPushFeatureKey.FILE_NAME,pushVO.getFileName());
        rcDelayPush.setFeature(pushVO.getFeature());
        return rcDelayPush;
    }

    public static String getDateShow(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(date);
    }

    public static Date getDateByString(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }
}
