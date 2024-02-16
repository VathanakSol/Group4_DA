package Thread;

// 1. Create thread extend from thread class
class thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello thread!!");
    }
}

// 2. Create thread implement from thread interface
class thread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello Thread from interface");
    }
}
public class Main {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException{
        // create and define the task for thread
        Runnable task = new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<1000000; i++){
                    synchronized (this){
                        counter++;
                    }
                }
            }
        };
        Thread obj = new Thread(task);
        Thread obj2 = new Thread(task);
        obj.start();
        obj2.start();
        obj.join(); // wait for obj1 to finish the task
        obj2.join();
        System.out.println("Expect Value: 2000000");
        System.out.println("Actual Value: " + counter);
    }
}
