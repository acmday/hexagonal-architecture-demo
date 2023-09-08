package com.acmday.hexagonal.architecture.demo.adaptor.driven.application;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.command.UserInfoCommand;

/**
 * @author acmday
 * @date 2023/4/5 上午12:25
 */
public interface IUserInfoApp {

    Boolean insertUserInfo(UserInfoCommand command);
}
