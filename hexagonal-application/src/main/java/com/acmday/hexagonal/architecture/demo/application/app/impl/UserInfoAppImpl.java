package com.acmday.hexagonal.architecture.demo.application.app.impl;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.IUserInfoApp;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.dto.UserInfoDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.query.UserInfoQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.IUserInfoServiceQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.convertor.EntityQueryConvertor;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.query.UserEntityQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.IAddressInfoGateway;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.producer.IUserInfoProducer;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.IUserInfoRepository;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.convertor.QueryConvertor;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.dto.UserNameDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.query.UserNameQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author acmday
 * @date 2023/4/5 上午10:15
 */
@Service
@Slf4j
public class UserInfoAppImpl implements IUserInfoApp {

    @Resource
    private IAddressInfoGateway addressInfoGateway;
    @Resource
    private IUserInfoRepository userInfoRepository;
    @Resource
    private IUserInfoProducer userInfoProducer;
    @Resource
    private IUserInfoServiceQuery userInfoDomainService;

    @Override
    public UserInfoDTO queryUserInfoByQuery(UserInfoQuery query) {

        UserEntityQuery userEntityQuery = EntityQueryConvertor.userQuery2EntityQuery(query);
        UserInfoDTO userInfo = userInfoDomainService.getUserInfoEntity(userEntityQuery);
        if(Objects.isNull(userInfo)) {
            return null;
        }
        // 根据实际场景，增加其他逻辑，例如：发送消息、请求gateway接口等，这里略过
        return UserInfoDTO.builder()
                .address(userInfo.getAddress())
                .uid(userInfo.getUid())
                .build();
    }

    @Override
    public String queryUserNameByQuery(UserInfoQuery query) {
        // 获取姓名
        UserNameQuery userNameQuery = QueryConvertor.userInfoQuery2NameQuery(query);
        UserNameDTO userName = userInfoRepository.getUserNameByQuery(userNameQuery);
        return userName.getName();
    }
}
