package com.acmday.hexagonal.architecture.demo.adaptor.driven.application.query;

import lombok.*;

/**
 * @author acmday
 * @date 2023/4/5 上午11:05
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class UserInfoQuery {

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private Integer gender;
}
