import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorService1 implements  AutoCloseable{
    private ScheduledExecutorService scheduledExecutorService;
    ScheduledExecutorService1(){
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    }
    public void start(){
        Runnable task = ()->{
            System.out.println("Checking cache expiration "+System.currentTimeMillis());
        };

        scheduledExecutorService.scheduleWithFixedDelay(task,0,2, TimeUnit.SECONDS);
    }

    @Override
    public void close() throws Exception {
//     scheduledExecutorService.
    }
    public void stop(){
        scheduledExecutorService.shutdown();
    }
    public static void main(String[] args) throws InterruptedException {
          ScheduledExecutorService1 scheduledExecutorService1 = new ScheduledExecutorService1();
          scheduledExecutorService1.start();
          Thread.sleep(8000);
          scheduledExecutorService1.stop();

    }


}
