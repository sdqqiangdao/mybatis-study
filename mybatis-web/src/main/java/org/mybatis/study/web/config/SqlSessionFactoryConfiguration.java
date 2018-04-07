package org.mybatis.study.web.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author shen
 * @create 2018-04-01 16:35
 * @desc
 **/

@Configuration
public class SqlSessionFactoryConfiguration {

    @Value("${mybatis.config.file.path}")
    private String mybatisConfigFilePath;

    @Value("${dao.path}")
    private String mapperPath;

    @Value("${model.package}")
    private String typeAliasesPackage;

    @Autowired
    @Qualifier(value = "dataSource")
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();

        sqlSessionFactory.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        sqlSessionFactory.setMapperLocations(resolver.getResources(packageSearchPath));

        sqlSessionFactory.setDataSource(dataSource);

        sqlSessionFactory.setTypeAliasesPackage(typeAliasesPackage);


        return sqlSessionFactory;
    }
}
