package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Task;

public interface TaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}