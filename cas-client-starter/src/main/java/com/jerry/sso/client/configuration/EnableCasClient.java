package com.jerry.sso.client.configuration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Jerry.Wu
 * @description: 配置该注解开启cas功能
 * @date 2018/11/7 14:29
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(CasClientConfiguration.class)
public @interface EnableCasClient {

}
