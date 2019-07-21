package com.zzkun.visitor;

import cn.hutool.json.JSONUtil;
import com.zzkun.visitor.domain.Cash;
import com.zzkun.visitor.domain.ExtendDigitalCash;
import com.zzkun.visitor.domain.MainDigitalCash;
import com.zzkun.visitor.domain.RealCash;
import com.zzkun.visitor.visitor.CashMarketVisitor;
import com.zzkun.visitor.visitor.ICashMarketVisitor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public void run(String... args) {
        MainDigitalCash cash1 = new MainDigitalCash();
        cash1.setCode("BTC");
        cash1.setCurrentPrice(50000);
        cash1.setPriceChangeWeek(1.25);
        cash1.setStartYear(2008);

        ExtendDigitalCash cash2 = new ExtendDigitalCash();
        cash1.setCode("NAS");
        cash1.setCurrentPrice(15);
        cash1.setPriceChangeWeek(0.87);
        cash1.setStartYear(2016);

        RealCash cash3 = new RealCash();
        cash1.setCode("CNY");
        cash1.setCurrentPrice(6.23);
        cash1.setPriceChangeWeek(0.98);
        cash1.setStartYear(1949);

        List<Cash> cashList = Arrays.asList(cash1, cash2, cash3);
        ICashMarketVisitor visitor = new CashMarketVisitor();
        for (Cash cash : cashList) {
            System.out.println("cash = " + JSONUtil.toJsonStr(cash) + ", marketValue = " + cash.accept(visitor));
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
