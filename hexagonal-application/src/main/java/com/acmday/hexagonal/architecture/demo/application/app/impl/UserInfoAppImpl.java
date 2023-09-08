package com.acmday.hexagonal.architecture.demo.application.app.impl;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.IUserInfoApp;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.IUserInfoServiceCommand;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.IUserInfoServiceQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.command.UserInfoCommand;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.IAddressInfoGateway;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.producer.IUserInfoProducer;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.IUserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author acmday
 * @date 2023/4/5 上午10:15
 *
 * 这里负责相关业务逻辑的编排
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
    @Resource
    private IUserInfoServiceCommand userInfoServiceCommand;


    @Override
    public Boolean insertUserInfo(UserInfoCommand command) {

        return null;
    }
}
