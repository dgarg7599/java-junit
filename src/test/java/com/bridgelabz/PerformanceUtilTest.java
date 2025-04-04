package com.bridgelabz;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class PerformanceUtilTest {

    private PerformanceUtil util;

    @BeforeEach
    public void setup(){
        util = new PerformanceUtil();
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void shouldFailIfTaskTakesTooLong(){
        String result = util.longRunningTask();
        Assertions.assertEquals("Task Completed", result);
    }
}
