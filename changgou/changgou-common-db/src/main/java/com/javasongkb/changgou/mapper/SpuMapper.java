package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Spu;

public interface SpuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Spu record);

    int insertSelective(Spu record);

    Spu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Spu record);

    int updateByPrimaryKeyWithBLOBs(Spu record);

    int updateByPrimaryKey(Spu record);
}