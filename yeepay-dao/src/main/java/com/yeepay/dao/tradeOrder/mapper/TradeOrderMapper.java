package com.yeepay.dao.tradeOrder.mapper;

import com.yeepay.dao.tradeOrder.domain.TradeOrder;
import com.yeepay.dao.tradeOrder.domain.TradeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeOrderMapper {
    long countByExample(TradeOrderExample example);

    int deleteByExample(TradeOrderExample example);

    int insert(TradeOrder record);

    int insertSelective(TradeOrder record);

    List<TradeOrder> selectByExample(TradeOrderExample example);

    int updateByExampleSelective(@Param("record") TradeOrder record, @Param("example") TradeOrderExample example);

    int updateByExample(@Param("record") TradeOrder record, @Param("example") TradeOrderExample example);
}