/**
 * @author ikiselev 26.10.2023
 *
 * Способы создания потоков
 */
public class CreateWayThread {

    public class ExampleThread1 implements Runnable{
        @Override
        public void run() {
            System.out.println("Привет из побочного потока!");
        }
    }

    /**
     * Способ 1
     *
     * Создать объект класса Thread, передав ему в конструкторе нечто, реализующее интерфейс Runnable.
     * Этот интерфейс содержит метод run(), который будет выполняться в новом потоке.
     * Поток закончит выполнение, когда завершится его метод run().
     */
    public void way1() {
        Thread thread = new Thread(new ExampleThread1());
        thread.start();
        System.out.println("Главный поток завершён...");
    }
    /**
     * Способ 2
     *
     * Передать лямбду. (сокращенный вызов функционального интерфейса Runnable)
     * Равносильно:
     * Thread thread = new Thread(new Runnable() {
     *             @Override
     *             public void run() {
     *
     *             }
     *         })
     */
    public void way2() {
        Thread thread = new Thread(() -> System.out.println("Привет из побочного потока!"));
        thread.start();
        System.out.println("Главный поток завершён...");
    }

    public class ExampleThread2 extends Thread {
        @Override
        public void run()
        {
            System.out.println("Привет из побочного потока!");
        }
    }

    /**
     * Способ 3
     *
     * Создать потомка класса Thread и переопределить его метод run().
     */
    public void way3() {
        ExampleThread2 thread = new ExampleThread2();
        thread.start();
        System.out.println("Главный поток завершён...");
    }

}
