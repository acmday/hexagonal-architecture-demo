package com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.query;

import lombok.*;

/**
 * @author acmday
 * @date 2023/4/5 上午11:19
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class UserNameQuery {

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 网名
     */
    private String screenName;
}
