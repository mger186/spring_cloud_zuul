package org.tp.zb.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
    
    @Bean
    public EmbeddedServletContainerFactory servletContainer(){
        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
//        factory.setPort(port);
//        factory.setContextPath("/eureka");
        return factory;
    }
}
