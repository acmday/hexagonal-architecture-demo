package com.acmday.hexagonal.architecture.demo.adaptor.driven.application.dto;

import lombok.*;

/**
 * @author acmday
 * @date 2023/4/5 上午11:06
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class UserInfoDTO {

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 住址
     */
    private String address;
}
