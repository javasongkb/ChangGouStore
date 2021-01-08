package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.OauthApprovals;

public interface OauthApprovalsMapper {
    int insert(OauthApprovals record);

    int insertSelective(OauthApprovals record);
}