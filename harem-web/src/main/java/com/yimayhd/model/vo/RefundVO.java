package com.yimayhd.model.vo;

import com.yimayhd.model.Refund;
import com.yimayhd.model.query.RefundListQuery;

/**
 * Created by Administrator on 2015/10/29.
 */
public class RefundVO extends Refund {
    private RefundListQuery refundListQuery;//查询条件

    public RefundListQuery getRefundListQuery() {
        return refundListQuery;
    }

    public void setRefundListQuery(RefundListQuery refundListQuery) {
        this.refundListQuery = refundListQuery;
    }
}
