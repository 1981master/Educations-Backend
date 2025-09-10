package com.master.oslyOnlineShoping.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;

@Configuration
public class H2DatabaseConfig {

    @Value("${app.db.base-folder:${user.home}/OslyOnlineShop/}")
    private String baseFolder;

    @Value("${app.db.base-name:oslydb}")
    private String baseName;

    @Bean
    public DataSource dataSource() {
        // Ensure folder exists
        File folder = new File(baseFolder);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Always use the same DB file
        String jdbcUrl = "jdbc:h2:file:" + baseFolder + baseName + ";DB_CLOSE_DELAY=-1;AUTO_RECONNECT=TRUE";

        System.out.println("H2 Database URL: " + jdbcUrl);

        return DataSourceBuilder.create()
                .driverClassName("org.h2.Driver")
                .url(jdbcUrl)
                .username("sa")
                .password("")
                .build();
    }
}
