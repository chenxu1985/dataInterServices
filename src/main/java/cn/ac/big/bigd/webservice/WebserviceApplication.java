package cn.ac.big.bigd.webservice;

import cn.ac.big.bigd.webservice.utility.SpringContextUtil;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableScheduling
//@MapperScan("cn.ac.big.bigd.webservice.mapper")
@ServletComponentScan
public class WebserviceApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebserviceApplication.class);
	}

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(WebserviceApplication.class, args);
		SpringContextUtil.setApplicationContext(app);
	}
}
