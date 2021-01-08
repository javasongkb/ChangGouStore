package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.UndoLog;

public interface UndoLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UndoLog record);

    int insertSelective(UndoLog record);

    UndoLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UndoLog record);

    int updateByPrimaryKeyWithBLOBs(UndoLog record);

    int updateByPrimaryKey(UndoLog record);
}