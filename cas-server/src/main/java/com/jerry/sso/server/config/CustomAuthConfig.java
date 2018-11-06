//package com.jerry.sso.server.config;
//
//import com.jerry.sso.server.security.ServerAuthenticationHandler;
//import org.apereo.cas.authentication.AuthenticationEventExecutionPlan;
//import org.apereo.cas.authentication.AuthenticationEventExecutionPlanConfigurer;
//import org.apereo.cas.authentication.AuthenticationHandler;
//import org.apereo.cas.authentication.principal.DefaultPrincipalFactory;
//import org.apereo.cas.configuration.CasConfigurationProperties;
//import org.apereo.cas.services.ServicesManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author Jerry.Wu
// * @description:
// * @date 2018/11/5 16:39
// */
//@Configuration("CustomAuthConfig")
//@EnableConfigurationProperties(CasConfigurationProperties.class)
//public class CustomAuthConfig implements AuthenticationEventExecutionPlanConfigurer {
//
//    @Autowired
//    private CasConfigurationProperties casProperties;
//
//    @Autowired
//    @Qualifier("servicesManager")
//    private ServicesManager servicesManager;
//
//    @Bean
//    public AuthenticationHandler myAuthenticationHandler() {
//        final ServerAuthenticationHandler handler = new ServerAuthenticationHandler(ServerAuthenticationHandler.class.getSimpleName(),
//                servicesManager, new DefaultPrincipalFactory(), 10);
//        return handler;
//    }
//
//    @Override
//    public void configureAuthenticationExecutionPlan(AuthenticationEventExecutionPlan plan) {
//        plan.registerAuthenticationHandler(myAuthenticationHandler());
//    }
//}
