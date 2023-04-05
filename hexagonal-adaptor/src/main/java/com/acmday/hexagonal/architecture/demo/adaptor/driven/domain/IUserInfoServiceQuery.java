package com.acmday.hexagonal.architecture.demo.adaptor.driven.domain;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.dto.UserInfoDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.command.UserInfoCommand;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.query.UserEntityQuery;

/**
 * @author acmday
 * @date 2023/4/5 上午12:29
 */
public interface IUserInfoServiceQuery {

    /**
     * 获取用户信息
     *
     * @return
     */
    UserInfoDTO getUserInfoEntity(UserEntityQuery query);

    /**
     * 添加用户信息
     *
     * @param command
     * @return
     */
    Boolean insertUserInfo(UserInfoCommand command);
}
