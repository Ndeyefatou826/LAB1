package dgi.esp.ucad;

import org.springframework.beans.factory.annotation.Value;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SbCarApplication {

    private static final Logger logger = LoggerFactory.getLogger(SbCarApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(SbCarApplication.class, args);
        logger.info("Car App started ! Goto https://localhost:8081/dic_student_name");
    }

}
@RestController
@RequestMapping("/dic_student_name")

class SbCarController {
    @Value("${fullname:Bass}")
    private String fullname;

    @GetMapping
    String getFullname() {
        return "Work done by "+this.fullname+" !";
    }
}

