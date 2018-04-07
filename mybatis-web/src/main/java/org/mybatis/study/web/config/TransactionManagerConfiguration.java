package org.mybatis.study.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author shen
 * @create 2018-04-07 13:10
 * @desc
 **/
@Configuration
public class TransactionManagerConfiguration {


    @Autowired
    @Qualifier(value = "dataSource")
    private DataSource dataSource;


    @Bean(name = "txManager")
    public DataSourceTransactionManager createDataSourceTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
