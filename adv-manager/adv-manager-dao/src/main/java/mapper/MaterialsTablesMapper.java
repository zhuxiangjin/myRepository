package com.adv.mapper;

import com.adv.pojo.MaterialsTables;
import com.adv.pojo.MaterialsTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialsTablesMapper {
    int countByExample(MaterialsTablesExample example);

    int deleteByExample(MaterialsTablesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialsTables record);

    int insertSelective(MaterialsTables record);

    List<MaterialsTables> selectByExample(MaterialsTablesExample example);

    MaterialsTables selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialsTables record, @Param("example") MaterialsTablesExample example);

    int updateByExample(@Param("record") MaterialsTables record, @Param("example") MaterialsTablesExample example);

    int updateByPrimaryKeySelective(MaterialsTables record);

    int updateByPrimaryKey(MaterialsTables record);
}