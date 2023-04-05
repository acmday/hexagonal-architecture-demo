package com.acmday.hexagonal.architecture.demo.domain.entity;

import lombok.*;

/**
 * @author acmday
 * @date 2023/4/5 下午2:26
 *
 * 领域对象
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class UserInfoEntity {

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 网名
     */
    private String screenName;

    /**
     * 住址
     */
    private String address;

    /**
     * 年龄
     */
    private String age;

    /**
     * 性别
     */
    private Integer gender;
}
