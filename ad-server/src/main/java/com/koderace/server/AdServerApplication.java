package com.koderace.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ivan Siemiernikov
 */
@EnableAdminServer
@SpringBootApplication
public class AdServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdServerApplication.class, args);
    }

}
