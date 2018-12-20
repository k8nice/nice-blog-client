package com.nice;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author nice
 */
@EnableDubboConfig
@CrossOrigin
@SpringBootApplication
@DubboComponentScan
public class NiceBlogClientProviderApplication {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(NiceBlogClientProviderApplication.class, args);
    }

}

