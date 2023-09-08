package com.acmday.hexagonal.architecture.demo.infrastructure.mq.producer;

import com.acmday.hexagonal.architecture.demo.adaptor.driven.producer.IUserInfoProducer;
import org.springframework.stereotype.Component;

/**
 * @author acmday
 * @date 2023/4/5 下午8:13
 */
@Component
public class UserInfoProducerImpl implements IUserInfoProducer {
    @Override
    public String sendAsyMessage(String msgBody) {
        return null;
    }
}
