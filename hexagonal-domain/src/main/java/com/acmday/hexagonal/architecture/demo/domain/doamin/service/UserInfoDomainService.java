package com.acmday.hexagonal.architecture.demo.domain.doamin.service;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.application.dto.UserInfoDTO;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.command.UserInfoCommand;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.domain.query.UserEntityQuery;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.IAddressInfoGateway;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.IUserInfoRepository;
import com.acmday.hexagonal.architecture.demo.domain.entity.UserInfoEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author acmday
 * @date 2023/4/5 下午6:57
 *
 * 领域服务
 *
 * 在领域驱动设计的架构中，领域服务是负责处理业务逻辑的关键组成部分之一，其主要职责是接受客户端的请求，
 * 处理业务逻辑，然后返回响应结果给客户端。当领域服务需要返回数据时，建议返回领域对象，因为领域对象代表了业务实体或概念，
 * 其具有丰富的行为和属性，能够完整地表达业务逻辑和领域知识。在返回领域对象时，可以通过领域事件或领域值对象等方式防止
 * 内部状态被意外修改。返回其他对象（比如 DTO 或者 VO）通常是为了提高性能或者满足外部接口的需求，但是这些对象是不具有
 * 业务领域特有概念和行为的，可能无法完整地表达业务逻辑和领域知识。
 */
@Service
public class UserInfoDomainService {

    @Resource
    private IAddressInfoGateway addressInfoGateway;
    @Resource
    private IUserInfoRepository userInfoRepository;

    /**
     * 返回UserInfoDTO
     * 返回Entity
     *
     * @param query
     * @return
     */
    public UserInfoEntity getUserInfoEntity(UserEntityQuery query) {

        // 从某个接口获取UserInfoEntity,然后再转成UserInfoDTO
        return null;
    }

    public Boolean insertUserInfo(UserInfoCommand command) {
        return null;
    }
}
