package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.OauthCode;

public interface OauthCodeMapper {
    int insert(OauthCode record);

    int insertSelective(OauthCode record);
}