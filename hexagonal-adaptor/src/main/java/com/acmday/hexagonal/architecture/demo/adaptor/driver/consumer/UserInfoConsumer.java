package com.acmday.hexagonal.architecture.demo.adaptor.driver.consumer;

import com.acmday.hexagonal.architecture.demo.common.enums.ConsumeStatus;

/**
 * @author acmday
 * @date 2023/4/5 上午12:13
 */
public class UserInfoConsumer {

    public ConsumeStatus receive(String msgBody) {

        // 消费实现逻辑.....
        return ConsumeStatus.CONSUME_SUCCESS;
    }
}
