package com.acmday.hexagonal.architecture.demo.adaptor.driven.application;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.query.UserInfoQuery;

/**
 * @author acmday
 * @date 2023/4/5 上午12:25
 */
public interface IUserInfoApp {

    /**
     * 统计数量
     *
     * @param query
     * @return
     */
    Integer countUserByCondition(UserInfoQuery query);
}
