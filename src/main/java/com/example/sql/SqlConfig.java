package com.example.sql;

import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.sql.SQLUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author pricess.wang
 * @date 2019/12/11 17:05
 */
@Configuration
public class SqlConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.filter.slf4j")
    @Primary
    public Slf4jLogFilter slf4jLogFilter() {
        Slf4jLogFilter slf4jLogFilter = new ExecuteSqlFilter();
        slf4jLogFilter.setConnectionLogEnabled(false);
        slf4jLogFilter.setResultSetLogEnabled(false);
        slf4jLogFilter.setStatementExecutableSqlLogEnable(true);
        slf4jLogFilter.setStatementSqlFormatOption(new SQLUtils.FormatOption(true, true));
        return slf4jLogFilter;
    }
}
