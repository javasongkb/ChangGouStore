package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.OauthAccessToken;
import com.javasongkb.changgou.model.OauthAccessTokenWithBLOBs;

public interface OauthAccessTokenMapper {
    int deleteByPrimaryKey(String authenticationId);

    int insert(OauthAccessTokenWithBLOBs record);

    int insertSelective(OauthAccessTokenWithBLOBs record);

    OauthAccessTokenWithBLOBs selectByPrimaryKey(String authenticationId);

    int updateByPrimaryKeySelective(OauthAccessTokenWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OauthAccessTokenWithBLOBs record);

    int updateByPrimaryKey(OauthAccessToken record);
}