package com.acmday.hexagonal.architecture.demo.adaptor.driven.repository;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.dto.UserNameDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.query.UserNameQuery;

/**
 * @author acmday
 * @date 2023/4/5 上午12:32
 */
public interface IUserInfoRepository {

    /**
     * 根据uid获取网名获取姓名
     *
     * @param query
     * @return
     */
    UserNameDTO getUserNameByQuery(UserNameQuery query);
}
