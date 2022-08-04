package org.ds.notes.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by xingbm on 2021/1/2 16:22
 */
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    private static final String ORIGINS[] = new String[] { "HEAD", "GET", "POST"};

    /**
     * 跨域配置
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //对那些请求路径进行跨域处理
        registry.addMapping("/**")
                // 允许的请求头，默认允许所有的请求头
                .allowedHeaders("*")
                // 允许的方法，默认允许HEAD、GET、POST
                .allowedMethods(ORIGINS)
                // 探测请求有效时间，单位秒
                .maxAge(1800)
                // 支持的域
                .allowedOrigins("*");
    }

}
