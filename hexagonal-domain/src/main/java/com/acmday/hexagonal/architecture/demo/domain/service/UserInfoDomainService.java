package com.acmday.hexagonal.architecture.demo.domain.service;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.command.UserInfoCommand;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.IUserInfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author acmday
 * @date 2023/4/5 下午6:57
 *
 * 领域服务
 */
@Service
public class UserInfoDomainService {

    @Resource
    private IUserInfoRepository userInfoRepository;

    public Boolean insertUserInfo(UserInfoCommand command) {
        return null;
    }
}
