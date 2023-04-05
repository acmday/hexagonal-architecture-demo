package com.acmday.hexagonal.architecture.demo.adaptor.driver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author acmday
 * @date 2023/4/5 上午12:13
 */
@Controller
@Slf4j
public class UserInfoController {

    @RequestMapping( "/test" )
    public ModelAndView test() {
        log.info("act=test, 收到请求！");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "viewName" );
        modelAndView.addObject( " 需要放到 model 中的属性名称 " , " 对应的属性值，它是一个对象 " );
        return modelAndView;
    }
}
