package com.master.oslyOnlineShoping.config;

import com.master.oslyOnlineShoping.entity.security.Role;
import com.master.oslyOnlineShoping.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    private final RoleRepository roleRepository;

    public DataInitializer(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Bean
    CommandLineRunner initRoles() {
        return args -> {
            // Insert "user" role if it does not exist
            if (roleRepository.findByName("user").isEmpty()) {
                Role userRole = new Role();
                userRole.setName("user");
                roleRepository.save(userRole);
            }

            /*
            if (roleRepository.findByName("admin").isEmpty()) {
                Role adminRole = new Role();
                adminRole.setName("admin");
                roleRepository.save(adminRole);
            }
            */

        };
    }
}
