package com.acmday.hexagonal.architecture.demo.adaptor.driven.gateway.query;

import lombok.*;

/**
 * @author acmday
 * @date 2023/4/5 上午9:25
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class AddressQuery {

    /**
     * 用户id
     */
    private Long uid;
}
