package com.yimayhd.harem.service;

import com.yimayhd.harem.base.PageVO;
import com.yimayhd.harem.model.BizOrderVO;
import com.yimayhd.harem.model.query.PayListQuery;
import com.yimayhd.harem.model.query.TradeListQuery;
import com.yimayhd.pay.client.model.domain.order.PayOrderDO;
import com.yimayhd.tradecenter.client.model.domain.order.BizOrderDO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2015/10/27.
 */
public interface TradeService {
    /**
     * 获取交易列表(可带查询条件)
     * @return 交易列表
     */
    PageVO<BizOrderVO> getOrderList(TradeListQuery tradeListQuery)throws Exception;
    /**
     * 导出交易列表
     * @param tradeListQuery
     * @return
     */
    void exportOrderList(HttpServletResponse response,TradeListQuery tradeListQuery)throws Exception;

    /**
     * 支付列表
     * @param payListQuery
     * @return
     */
    PageVO<PayOrderDO> getPayOrderList(PayListQuery payListQuery)throws Exception;

    /**
     * 导出支付列表
     * @param payListQuery
     * @return
     */
    List<PayOrderDO> exportPayOrderList(PayListQuery payListQuery)throws Exception;

    /**
     * 根据交易id获取详情
     * @return
     * @throws Exception
     */
    List<BizOrderDO> getOrderByOrderId(long orderId)throws Exception;

}
