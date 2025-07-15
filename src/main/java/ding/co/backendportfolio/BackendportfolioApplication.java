package ding.co.backendportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@SpringBootApplication
@EnableScheduling
public class BackendportfolioApplication {
    public static void main(String[] args) {
        // 아아아아아아
        System.out.println("호성이 화이팅");
        SpringApplication.run(BackendportfolioApplication.class, args);
    }

}
