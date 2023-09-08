package com.acmday.hexagonal.architecture.demo.adaptor.driver.facade;

import com.acmday.hexagonal.architecture.demo.client.IUserInfoFacade;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author acmday
 * @date 2023/4/4 下午11:52
 *
 * RPC接口实现类, 这个包可以作读写分离
 */
@DubboService(version = "1.0", group = "acmday")
@Slf4j
public class UserInfoFacadeImpl implements IUserInfoFacade {

    @Override
    public String getNameByUserId(Long uid) {
        return null;
    }
}
