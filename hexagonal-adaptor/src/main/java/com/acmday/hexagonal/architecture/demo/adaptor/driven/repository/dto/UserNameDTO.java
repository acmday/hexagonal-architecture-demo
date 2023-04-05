package com.acmday.hexagonal.architecture.demo.adaptor.driven.repository.dto;

import lombok.*;

/**
 * @author acmday
 * @date 2023/4/5 上午11:18
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class UserNameDTO {

    /**
     * 用户id
     */
    private String uid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 网名
     */
    private String screenName;
}
