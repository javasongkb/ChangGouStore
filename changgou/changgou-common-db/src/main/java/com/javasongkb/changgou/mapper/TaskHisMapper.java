package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.TaskHis;

public interface TaskHisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskHis record);

    int insertSelective(TaskHis record);

    TaskHis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskHis record);

    int updateByPrimaryKey(TaskHis record);
}