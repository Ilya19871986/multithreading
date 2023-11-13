import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ikiselev 10.11.2023
 *
 * Использование ExecutorService
 */
public class ExecutorServiceExample {
    /**
     * Задача выполняемая в отдельном потоке
     */
    private void action(String name) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет от " + name);
                TimeUnit.MILLISECONDS.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 1. newFixedThreadPool
     * Запуск задач Runnable
     */
    public void runFixedThreadPollRunnable() throws InterruptedException {
        // фабричный метод создания
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(() -> action("runnableTask1"));
        service.submit(() -> action("runnableTask2"));
        service.submit(() -> action("runnableTask3"));
        // эта задача будет выполняться, когда освободится хотя бы один поток в ThreadPoll
        service.submit(() -> action("runnableTask4"));
        service.shutdown(); // уничтожение ExecutorService (после завершения всех потоков)
        Thread.sleep(5000);
    }

}
