package homework.test;

import homework.annotations.After;
import homework.annotations.Before;
import homework.annotations.Test;

import java.util.logging.Logger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AnnotationsTest {
    Logger logger = Logger.getLogger(AnnotationsTest.class.getName());

    @Before
    public void before1() {
        logger.info("Before 1");
    }

    @Before
    public void before2() {
        logger.info("Before 2");
    }

    @Test
    public void test1() {
        logger.info("test1 start. Should fail.");
        assertThat("2").isEqualTo("1");
    }

    @Test
    public void test2() {
        logger.info("test2 start. Should be successful.");
        assertThat("1").isEqualTo("1");
    }

    @After
    public void after() {
        logger.info("After");
    }
}
