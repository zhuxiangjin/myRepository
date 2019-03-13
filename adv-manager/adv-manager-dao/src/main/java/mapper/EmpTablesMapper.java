package com.adv.mapper;

import com.adv.pojo.EmpTables;
import com.adv.pojo.EmpTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpTablesMapper {
    int countByExample(EmpTablesExample example);

    int deleteByExample(EmpTablesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpTables record);

    int insertSelective(EmpTables record);

    List<EmpTables> selectByExample(EmpTablesExample example);

    EmpTables selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpTables record, @Param("example") EmpTablesExample example);

    int updateByExample(@Param("record") EmpTables record, @Param("example") EmpTablesExample example);

    int updateByPrimaryKeySelective(EmpTables record);

    int updateByPrimaryKey(EmpTables record);
}