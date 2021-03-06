package com.yeepay.dao.enterprise.mapper;

import com.yeepay.dao.enterprise.domain.Enterprise;
import com.yeepay.dao.enterprise.domain.EnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseMapper {
    long countByExample(EnterpriseExample example);

    int deleteByExample(EnterpriseExample example);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> selectByExample(EnterpriseExample example);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);
}