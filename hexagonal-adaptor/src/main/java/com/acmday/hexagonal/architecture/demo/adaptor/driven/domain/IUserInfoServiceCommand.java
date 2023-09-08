package com.acmday.hexagonal.architecture.demo.adaptor.driven.domain;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.command.UserInfoCommand;

/**
 * @author acmday
 * @date 2023/4/5 下午8:09
 */
public interface IUserInfoServiceCommand {


    /**
     * 添加用户信息
     *
     * @param command
     * @return
     */
    Boolean insertUserInfo(UserInfoCommand command);
}
