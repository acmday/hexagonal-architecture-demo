package com.acmday.hexagonal.architecture.demo.application;

import com.acmday.hexagonal.architecture.demo.adaptor.ApplicationLoader;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author acmday
 * @date 2023/4/5 下午7:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationLoader.class})
public class BaseTest {
}
