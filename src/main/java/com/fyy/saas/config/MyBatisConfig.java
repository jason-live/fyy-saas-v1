package com.fyy.saas.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.fyy.saas.mbg.mapper")
public class MyBatisConfig {
}
