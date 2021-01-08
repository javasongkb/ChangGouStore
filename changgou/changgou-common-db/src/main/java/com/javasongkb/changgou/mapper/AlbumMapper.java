package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Album;

public interface AlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Album record);

    int insertSelective(Album record);

    Album selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKeyWithBLOBs(Album record);

    int updateByPrimaryKey(Album record);
}