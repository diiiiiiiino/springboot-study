package com.nos.study.springbootstudy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Configuration
@ComponentScan // todo: 패키지가 다르면 검색 못하는지 확인 필요
@EnableMyAutoConfiguration
public @interface MySpringBootApplication {
}
