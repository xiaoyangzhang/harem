package com.yimayhd.palace.model.orderLog;

import com.yimayhd.palace.util.DateUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangdi on 16/10/10.
 */
public class OrderStatusChangeLogDTO implements Serializable {
    private static final long serialVersionUID = 2333686619394070105L;

    private long id;
    private String bizNo;//'订单号'
    private long operationId;//操作人id
    private int status;//'状态'
    private String content;//'修改内容'
    private String desc;//'备注'
    private Date gmtCreated;
    private Date gmtModified;
    private String gmtCreatedStr;// 创建日期

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public long getOperationId() {
        return operationId;
    }

    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
        if(gmtCreated!=null){
            setGmtCreatedStr(DateUtil.date2String(gmtCreated));
        }
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getGmtCreatedStr() {
        return gmtCreatedStr;
    }

    public void setGmtCreatedStr(String gmtCreatedStr) {
        this.gmtCreatedStr = gmtCreatedStr;
    }
}
