package com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.acl;

import lombok.*;

/**
 * @author acmday
 * @date 2023/4/5 上午9:25
 *
 * 防腐层
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class AddressInfoAcl {

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 地址
     */
    private String address;
}
