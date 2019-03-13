package com.adv.mapper;

import com.adv.pojo.TakesTables;
import com.adv.pojo.TakesTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakesTablesMapper {
    int countByExample(TakesTablesExample example);

    int deleteByExample(TakesTablesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TakesTables record);

    int insertSelective(TakesTables record);

    List<TakesTables> selectByExample(TakesTablesExample example);

    TakesTables selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TakesTables record, @Param("example") TakesTablesExample example);

    int updateByExample(@Param("record") TakesTables record, @Param("example") TakesTablesExample example);

    int updateByPrimaryKeySelective(TakesTables record);

    int updateByPrimaryKey(TakesTables record);
}