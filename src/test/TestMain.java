package test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {

    public static void main(String[] args) {
//        Demo demo = new Demo();
//        Thread thread = new Thread(demo);
//        thread.start();
        ExecutorService excutor = Executors.newCachedThreadPool();
        excutor.execute(new Demo());
        for(int i=0;i<10;i++){
            System.out.print(i+"(main)");
        }

    }
}
