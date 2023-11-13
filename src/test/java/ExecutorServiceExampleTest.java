import org.junit.jupiter.api.Test;

/**
 * @author ikiselev 10.11.2023
 */
public class ExecutorServiceExampleTest {

    ExecutorServiceExample serviceExample = new ExecutorServiceExample();

    @Test
    void runFixedThreadPollRunnableTest() throws InterruptedException {
        serviceExample.runFixedThreadPollRunnable();
    }
}
