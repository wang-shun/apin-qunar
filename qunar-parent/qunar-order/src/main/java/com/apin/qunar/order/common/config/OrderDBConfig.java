package com.apin.qunar.order.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Lists;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @outhor lujian
 * @create 2018-06-25 7:27
 */
@Configuration
public class OrderDBConfig implements EnvironmentAware {

    private Environment environment;

    @Bean
    public SqlSessionFactory orderSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:com/apin/qunar/order/dao/xml/*Mapper.xml"));
        sqlSessionFactoryBean.setDataSource(orderDataSource());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public MapperScannerConfigurer orderMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.apin.qunar.order.dao.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("orderSqlSessionFactory");
        return mapperScannerConfigurer;
    }

    private DataSource orderDataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(environment.getProperty("mysql.orderDB.username"));
        druidDataSource.setPassword(environment.getProperty("mysql.orderDB.password"));
        druidDataSource.setUrl(environment.getProperty("mysql.orderDB.url"));
        druidDataSource.setConnectionInitSqls(Lists.newArrayList("set names utf8"));
        return druidDataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws SQLException {
        return new DataSourceTransactionManager(orderDataSource());
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}