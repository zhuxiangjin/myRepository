package com.adv.mapper;

import com.adv.pojo.BuyTables;
import com.adv.pojo.BuyTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyTablesMapper {
    int countByExample(BuyTablesExample example);

    int deleteByExample(BuyTablesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BuyTables record);

    int insertSelective(BuyTables record);

    List<BuyTables> selectByExample(BuyTablesExample example);

    BuyTables selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BuyTables record, @Param("example") BuyTablesExample example);

    int updateByExample(@Param("record") BuyTables record, @Param("example") BuyTablesExample example);

    int updateByPrimaryKeySelective(BuyTables record);

    int updateByPrimaryKey(BuyTables record);
}