package com.adv.mapper;

import com.adv.pojo.ProTables;
import com.adv.pojo.ProTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProTablesMapper {
    int countByExample(ProTablesExample example);

    int deleteByExample(ProTablesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProTables record);

    int insertSelective(ProTables record);

    List<ProTables> selectByExample(ProTablesExample example);

    ProTables selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProTables record, @Param("example") ProTablesExample example);

    int updateByExample(@Param("record") ProTables record, @Param("example") ProTablesExample example);

    int updateByPrimaryKeySelective(ProTables record);

    int updateByPrimaryKey(ProTables record);
}