package com.master.oslyOnlineShoping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(
        excludeName = "org.springframework.boot.autoconfigure.jdbc.DataSourceJndiAutoConfiguration"
)
@EntityScan(
        basePackages = {
                "com.master.oslyOnlineShoping.entity",
        })
public class OslyOnlineShopingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OslyOnlineShopingApplication.class, args);
        System.out.println("Besm ALAH ALRHMAN ALRAHEEM");
    }
}
