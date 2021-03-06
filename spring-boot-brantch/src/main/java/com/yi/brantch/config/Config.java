package com.yi.brantch.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置扫描接口路径
 * @author YI
 * @date 2018-8-22 18:19:45
 */
@Configuration
@MapperScan(basePackages = {"com.yi.hikari.dao"})
public class Config {

}
