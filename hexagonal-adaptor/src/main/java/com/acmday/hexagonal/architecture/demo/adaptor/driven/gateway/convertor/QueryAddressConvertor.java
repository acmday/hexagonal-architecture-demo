package com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.convertor;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.query.UserInfoQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.query.AddressQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.query.UserNameQuery;

/**
 * @author acmday
 * @date 2023/4/5 上午11:26
 */
public class QueryAddressConvertor {

    public static AddressQuery userInfoQuery2AddressQuery(UserInfoQuery query) {
        return AddressQuery.builder()
                .uid(query.getUid())
                .build();
    }
}
