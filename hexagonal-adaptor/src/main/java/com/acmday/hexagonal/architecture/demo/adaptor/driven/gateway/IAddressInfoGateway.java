package com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.acl.AddressInfoAcl;
import com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.query.AddressQuery;

/**
 * @author acmday
 * @date 2023/4/5 上午12:27
 */
public interface IAddressInfoGateway {

    AddressInfoAcl getUserAddressInfoByQuery(AddressQuery query);
}
