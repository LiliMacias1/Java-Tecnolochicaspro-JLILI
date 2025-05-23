package executor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MiTercerHilo implements Callable<Void> {

    @Override
    public Void call() {
        for (int i = 0; i < 10; i++) {
            System.out.println("=> " + i);
        }
        return null;
    }
}

package executor;

import java.util.concurrent..ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[]args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new MiTercerHilo());
        executor.shutdown();


                try {
                    executor.awaitTermination(10, TimeUnit.SECONDS);
                }
                }

    }
}
