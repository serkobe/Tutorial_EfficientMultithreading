package tutorial.api.threads.running.ExecutersAPIUsage;

import tutorial.api.threads.running.ExecutersAPIUsage.common.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Using_CachedThreadPool {

    public static void main(String[] args) {

        System.out.println("--- Main thread starts ---");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());

        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        
        executorService.shutdown();

        System.out.println("--- Main thread ends ---");

    }

}