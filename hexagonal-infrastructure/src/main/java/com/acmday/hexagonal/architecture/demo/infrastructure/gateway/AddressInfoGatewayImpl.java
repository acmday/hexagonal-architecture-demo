package com.acmday.hexagonal.architecture.demo.infrastructure.gateway;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.IAddressInfoGateway;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.acl.AddressInfoAcl;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.query.AddressQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author acmday
 * @date 2023/4/5 下午8:10
 */
@Component
public class AddressInfoGatewayImpl implements IAddressInfoGateway {
    @Override
    public AddressInfoAcl getUserAddressInfoByQuery(AddressQuery query) {
        return null;
    }
}
