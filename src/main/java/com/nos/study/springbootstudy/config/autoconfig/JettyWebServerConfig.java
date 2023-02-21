package com.nos.study.springbootstudy.config.autoconfig;

import com.nos.study.springbootstudy.config.MyAutoConfiguration;
import com.nos.study.springbootstudy.config.condition.ConditionalMyOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@MyAutoConfiguration
@ConditionalMyOnClass("org.eclipse.jetty.server.Server")
public class JettyWebServerConfig {
    @Bean
    @ConditionalOnMissingBean
    public ServletWebServerFactory servletWebServerFactory(){
        return new JettyServletWebServerFactory();
    }
}
