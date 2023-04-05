package com.acmday.hexagonal.architecture.demo.client;

/**
 * @author acmday
 * @date 2023/4/4 上午9:28
 */
public interface IUserInfoFacade {

    /**
     * 根据uid获取用户姓名
     *
     * @param uid
     * @return
     */
    String getNameByUserId(Long uid);
}
