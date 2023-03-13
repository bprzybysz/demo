package com.le.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = HelloSpringApplication.class)
@ActiveProfiles("test")
class HelloSpringApplicationTests {

    @Test
    void contextLoads() {
    }

}
