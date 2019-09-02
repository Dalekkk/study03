package com.wzx.mapper;

import com.wzx.dao.staff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface staffMapper {
    int deleteByPrimaryKey(String usercode);

    int insert(staff record);

    int insertSelective(staff record);

    staff selectByPrimaryKey(String usercode);

    int updateByPrimaryKeySelective(staff record);

    int updateByPrimaryKey(staff record);
}