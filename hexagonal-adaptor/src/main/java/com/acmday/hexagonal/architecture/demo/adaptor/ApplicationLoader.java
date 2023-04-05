package com.acmday.hexagonal.architecture.demo.adaptor;

import com.acmday.hexagonal.architecture.demo.common.constants.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author acmday
 * @date 2023/4/5 上午10:03
 */
@EnableAsync
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement(proxyTargetClass = true)
@ComponentScan(basePackages = {Constants.BASE_PACKAGE})
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@Slf4j
public class ApplicationLoader {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationLoader.class);
        application.run(args);
        log.info("———————————————— SUCCESS ————————————————");
    }
}