package com.yimayhd.palace.model.export;

import java.io.Serializable;

/**
 * @author create by yushengwei on 2016/7/18
 * @Description
 */
public class ExportGfOrder implements Serializable{
    public String consigneeName="";//lgOrder.fullName //收货人姓名
    public long buyerId;//order.buyerId//买家ID
    public String buyerName="";//order.buyerName //买家
    public String buyerPhoneNum="";//$!order.buyerPhoneNum//电话
    public String contactAddress="";//$!lgOrder.prov， $!lgOrder.city，  $!lgOrder.area，$!lgOrder.address，//详细地址
    public long bizOrderId;//$!order.mainOrder.bizOrderDO.bizOrderId//订单号
    public String itemTitle;//$!subOrder.bizOrderDO.itemTitle//商品名称
    public long itemId;//$!subOrder.bizOrderDO.itemId//商品ID

    public long buyAmount;//$!subOrder.bizOrderDO.buyAmount//商品数量
    public String createDate="";//$!order.mainOrder.bizOrderDO.gmtCreated//下单时间
    public String paymentMode="";// //支付方式
    public String orderShowState="";//$order.mainOrder.orderShowState//订单状态
    public String itemNumber;//商品编码

    public String sumFee;//$!subOrder.sumFee//订单总额
    public String freightFee;//运费
    public String itemPrice;//$!subOrder.bizOrderDO.itemPrice //商品价格
    public String actualFee;//$!subOrder.sumFee//实际支付金额

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(long buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhoneNum() {
        return buyerPhoneNum;
    }

    public void setBuyerPhoneNum(String buyerPhoneNum) {
        this.buyerPhoneNum = buyerPhoneNum;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public long getBizOrderId() {
        return bizOrderId;
    }

    public void setBizOrderId(long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    public long getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(long buyAmount) {
        this.buyAmount = buyAmount;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getOrderShowState() {
        return orderShowState;
    }

    public void setOrderShowState(String orderShowState) {
        this.orderShowState = orderShowState;
    }

    public String getSumFee() {
        return sumFee;
    }

    public void setSumFee(String sumFee) {
        this.sumFee = sumFee;
    }

    public String getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(String freightFee) {
        this.freightFee = freightFee;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getActualFee() {
        return actualFee;
    }

    public void setActualFee(String actualFee) {
        this.actualFee = actualFee;
    }
}
