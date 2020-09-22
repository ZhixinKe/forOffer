package offer03;

public class SynchronizeDemo4 {
    static class Runnable1 implements Runnable{

        @Override
        public void run() {
            SynClass.myRun();
        }
    }


    static class Runnable2 implements Runnable{

        @Override
        public void run() {
            SynClass.myRun2();
        }
    }

    public static void main(String[] args){

        Runnable1 runnable1 = new Runnable1();
        Runnable2 runnable2 = new Runnable2();
        Thread thread1 = new Thread(runnable1);
        thread1.setName("thread1");
        Thread thread2 = new Thread(runnable2);
        thread2.setName("thread2");
        thread1.start();
        thread2.start();


    }

    static class SynClass {
        public synchronized static void myRun(){
            System.out.println(Thread.currentThread().getName()+"-myRun");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-myRun");

        }

        public synchronized static void myRun2(){
            System.out.println(Thread.currentThread().getName()+"-myRun2");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-myRun2");

        }

    }
}
