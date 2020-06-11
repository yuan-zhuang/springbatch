package com.jrx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import java.sql.SQLException;

@SpringBootTest
class SpringbatchApplicationTests {
    public static final Logger log = LogManager.getLogger(SpringbatchApplicationTests.class);
    @Test
    void contextLoads() throws SQLException {
       log.info("==========log4j2 info=======");
        System.out.println("-------log4j2----------");
    }

}
