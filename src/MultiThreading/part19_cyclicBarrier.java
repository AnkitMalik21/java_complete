package MultiThreading;

import java.util.concurrent.CyclicBarrier;

public class part19_cyclicBarrier {
    public static void main(String[] args) {
        final int numberOfSubSystems = 4;

        CyclicBarrier barrier = new CyclicBarrier(numberOfSubSystems, new Runnable() {
            @Override
            public void run() {
                System.out.println("All subsystems are up and running. System startup complete.");
            }
        });

        Thread webServerThread = new Thread(new Subsystem("Web server", 2000, barrier));
        Thread databaseThread = new Thread(new Subsystem("Database", 4000, barrier));
        Thread cacheThread = new Thread(new Subsystem("Cache", 3000, barrier));
        Thread messagingServiceThread = new Thread(new Subsystem("Messaging Service", 3500, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();
    }
}

class Subsystem implements Runnable {
    private String name;
    private int initializationTime;
    private CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " initialization started.");
            Thread.sleep(initializationTime);
            System.out.println(name + " initialization complete.");
            barrier.await(); // waits at the barrier
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
