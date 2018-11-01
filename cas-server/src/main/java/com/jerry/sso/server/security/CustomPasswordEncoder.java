package com.jerry.sso.server.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Jerry.Wu
 * @description:
 * @date 2018/11/1 16:15
 */
public class CustomPasswordEncoder extends BCryptPasswordEncoder {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String encode(CharSequence rawPassword) {
        return super.encode(rawPassword);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        logger.info("matches方法：请求密码为：{} ，数据库密码为：{}", rawPassword, encodedPassword);
        return super.matches(rawPassword, encodedPassword);
    }
}
