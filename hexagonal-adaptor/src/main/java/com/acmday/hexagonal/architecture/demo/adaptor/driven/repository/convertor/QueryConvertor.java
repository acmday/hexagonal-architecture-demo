package com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.convertor;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.query.UserInfoQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.query.UserNameQuery;

/**
 * @author acmday
 * @date 2023/4/5 上午11:26
 */
public class QueryConvertor {

    public static UserNameQuery userInfoQuery2NameQuery(UserInfoQuery query) {
        // 具体转换逻辑略。
        return new UserNameQuery();
    }
}
