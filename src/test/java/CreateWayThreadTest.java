import org.junit.jupiter.api.Test;

/**
 * @author ikiselev 26.10.2023
 */
public class CreateWayThreadTest {

    CreateWayThread thread = new CreateWayThread();

    @Test
    void way1Test() {
        thread.way1();
    }

    @Test
    void way2Test() {
        thread.way2();
    }

    @Test
    void way3Test() {
        thread.way3();
    }
}
