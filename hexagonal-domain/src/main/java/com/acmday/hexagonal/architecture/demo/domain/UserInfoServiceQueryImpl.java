package com.acmday.hexagonal.architecture.demo.domain;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.dto.UserInfoDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.IUserInfoServiceQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.command.UserInfoCommand;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.query.UserEntityQuery;
import com.acmday.hexagonal.architecture.demo.domain.doamin.service.UserInfoDomainService;
import com.acmday.hexagonal.architecture.demo.domain.entity.UserInfoEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author acmday
 * @date 2023/4/5 下午7:58
 */
@Service
public class UserInfoServiceQueryImpl implements IUserInfoServiceQuery {

    @Resource
    private UserInfoDomainService userInfoDomainService;

    @Override
    public UserInfoDTO getUserInfoEntity(UserEntityQuery query) {
        UserInfoEntity userInfoEntity = userInfoDomainService.getUserInfoEntity(query);
        return UserInfoDTO.builder()
                .uid(userInfoEntity.getUid())
                .address(userInfoEntity.getAddress())
                .build();
    }

    @Override
    public Boolean insertUserInfo(UserInfoCommand command) {
        return null;
    }
}
