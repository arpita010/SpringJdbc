package com.withoutxml;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.withoutxml"})
public class JavaConfig {
	@Bean(name= {"ds"})
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3308/springJdbcCompany");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}
	@Bean(name= {"jt"})
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
	}
//	@Bean(name= {"studentDao"})
//	public StudentDaoImpl getStudentDao()
//	{
//		StudentDaoImpl dao=new StudentDaoImpl();
//		dao.setTemp(getJdbcTemplate());
//		return dao;
//	}
}
