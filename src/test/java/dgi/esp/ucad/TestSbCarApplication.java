package dgi.esp.ucad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSbCarApplication {

    public static void main(String[] args) {
        SpringApplication.from(SbCarApplication::main).with(TestSbCarApplication.class).run(args);
    }

}
