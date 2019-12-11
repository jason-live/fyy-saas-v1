package com.fyy.saas.mbg.mapper;

import com.fyy.saas.mbg.model.CmsCategory;
import com.fyy.saas.mbg.model.CmsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCategoryMapper {
    int countByExample(CmsCategoryExample example);

    int deleteByExample(CmsCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);

    List<CmsCategory> selectByExampleWithBLOBs(CmsCategoryExample example);

    List<CmsCategory> selectByExample(CmsCategoryExample example);

    CmsCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByExample(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKeyWithBLOBs(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);
}