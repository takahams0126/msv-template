package jp.co.example.msvservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Applicationクラスです.
 */

// CHECKSTYLE:OFF HideUtilityClassConstructor
@SpringBootApplication
public class MsvApplication {

    /**
     * @param args 引数
     */
    public static void main(final String[] args) {
        SpringApplication.run(MsvApplication.class, args);
    }

}
