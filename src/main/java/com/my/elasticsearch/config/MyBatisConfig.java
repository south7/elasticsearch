package com.my.elasticsearch.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.my.elasticsearch.dao"})
public class MyBatisConfig {
}
