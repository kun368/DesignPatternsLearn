package com.zzkun.chain;

import cn.hutool.core.util.RandomUtil;
import com.zzkun.chain.domain.Request;
import com.zzkun.chain.domain.Response;
import com.zzkun.chain.handler.GovHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Resource
    private GovHandler govClient;

    public void run(String... args) {
        for (int i = 0; i < 10; ++i) {
            int level = RandomUtil.randomInt(0, 25);
            String content = RandomUtil.randomString(6);
            Request request = new Request(level, content);
            Response response = govClient.run(request);
            System.out.println("request = " + request + ", response = " + response);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
