package com.rk.dsaj;

import java.lang.reflect.Array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    protected static Logger LOGGER = null;

    @BeforeAll
    public static void setLogger() {
        System.setProperty("log4j.configurationFile", "log4j2-test.xml");
        LOGGER = LogManager.getLogger();
    }

    public void printArray(long[] input) {
        String output = "[ ";
        for (int i = 0; i < Array.getLength(input); i++) {
            output = output + input[i] + " ";
        }
        output = output + "]";
        LOGGER.info(output);
    }
}
