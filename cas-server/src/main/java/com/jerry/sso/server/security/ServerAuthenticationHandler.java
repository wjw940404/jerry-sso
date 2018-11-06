//package com.jerry.sso.server.security;
//
//import org.apache.commons.codec.digest.DigestUtils;
//import org.apereo.cas.authentication.AuthenticationHandlerExecutionResult;
//import org.apereo.cas.authentication.PreventedException;
//import org.apereo.cas.authentication.UsernamePasswordCredential;
//import org.apereo.cas.authentication.handler.support.AbstractUsernamePasswordAuthenticationHandler;
//import org.apereo.cas.authentication.principal.PrincipalFactory;
//import org.apereo.cas.services.ServicesManager;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.security.auth.login.FailedLoginException;
//import java.security.GeneralSecurityException;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Jerry.Wu
// * @description:
// * @date 2018/11/5 15:46
// */
//public class ServerAuthenticationHandler extends AbstractUsernamePasswordAuthenticationHandler {
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    public ServerAuthenticationHandler(String name, ServicesManager servicesManager, PrincipalFactory principalFactory, Integer order) {
//        super(name, servicesManager, principalFactory, order);
//    }
//
//    @Override
//    protected AuthenticationHandlerExecutionResult authenticateUsernamePasswordInternal(UsernamePasswordCredential credential, String originalPassword) throws GeneralSecurityException, PreventedException {
//        DriverManagerDataSource d = new DriverManagerDataSource();
//        d.setDriverClassName("com.mysql.jdbc.Driver");
//        d.setUrl("jdbc:mysql://127.0.0.1:3306/cas");
//        d.setUsername("root");
//        d.setPassword("root");
//        JdbcTemplate template = new JdbcTemplate();
//        template.setDataSource(d);
//
//        String username = credential.getUsername();
//        String password = credential.getPassword();
//        //查询数据库加密的的密码
//        Map<String, Object> user = template.queryForMap("SELECT * FROM sys_user WHERE username = ? and password = ?", username, password);
//        if(user == null || !(user.get("password").toString().equals(DigestUtils.md5Hex(password)))){
//            throw new FailedLoginException("用户名或密码错误.");
//        }
//        Map<String, Object> map = new HashMap<>();
//        map.putAll(user);
//        map.remove("password");
//        return createHandlerResult(credential, principalFactory.createPrincipal(username, map), null);
//    }
//}
