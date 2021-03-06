package com.yimayhd.palace.model.vo;

import com.yimayhd.palace.base.BaseQuery;

import java.io.Serializable;
import java.util.Date;

/**
 * @author create by yushengwei on 2016/10/14
 * @Description
 */
public class PushQueryVO extends BaseQuery implements Serializable{
    private String subject;//主题
    /*public Date beginPushDate;//推送时间
    public Date endPushDate;//推送时间*/
    public String beginPushDate;//推送时间
    public String endPushDate;//推送时间
    public int pushModelType;//推广对象类型 1全部，2特定
    public int status;//推送状态
    public int pushType;//推送类型 1短信 2push

    public int getPushType() {
        return pushType;
    }

    public void setPushType(int pushType) {
        this.pushType = pushType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBeginPushDate() {
        return beginPushDate;
    }

    public void setBeginPushDate(String beginPushDate) {
        this.beginPushDate = beginPushDate;
    }

    public String getEndPushDate() {
        return endPushDate;
    }

    public void setEndPushDate(String endPushDate) {
        this.endPushDate = endPushDate;
    }

    public int getPushModelType() {
        return pushModelType;
    }

    public void setPushModelType(int pushModelType) {
        this.pushModelType = pushModelType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
