package com.acmday.hexagonal.architecture.demo.adaptor.driven.application;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.dto.UserInfoDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.query.UserInfoQuery;

/**
 * @author acmday
 * @date 2023/4/5 上午12:25
 */
public interface IUserInfoApp {

    /**
     * 查询用户信息
     *
     * @param query
     * @return
     */
    UserInfoDTO queryUserInfoByQuery(UserInfoQuery query);

    /**
     * 获取用户姓名
     *
     * @param query
     * @return
     */
    String queryUserNameByQuery(UserInfoQuery query);
}
