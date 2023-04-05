package com.acmday.hexagonal.architecture.demo.infrastructure.repository;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.IUserInfoRepository;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.dto.UserNameDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.query.UserNameQuery;
import org.springframework.stereotype.Service;

/**
 * @author acmday
 * @date 2023/4/5 下午8:19
 */
@Service
public class UserInfoRepositoryImpl implements IUserInfoRepository {

    @Override
    public UserNameDTO getUserNameByQuery(UserNameQuery query) {
        return null;
    }
}
