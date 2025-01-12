package org.example.envvartest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class EnvVarTestApplicationTests {

    @Test
    void contextLoads() {
    }

}
