package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.OauthRefreshToken;

public interface OauthRefreshTokenMapper {
    int insert(OauthRefreshToken record);

    int insertSelective(OauthRefreshToken record);
}