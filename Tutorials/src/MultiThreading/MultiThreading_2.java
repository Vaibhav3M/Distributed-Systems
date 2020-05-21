package MultiThreading;

// Creating a runnable interface
public class MultiThreading_2 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am thread " + Thread.currentThread().getId());
    }
    
    public static void  main(String args[]){

        //Creating Thread interface instance
        MultiThreading_2 MT = new MultiThreading_2();

        // Creating multiple thread instance and passing it the object
        Thread t1 = new Thread(MT);
        t1.start();

        Thread t2 = new Thread(MT);
        t2.start();

        Thread t3 = new Thread(MT);
        t3.start();

        Thread t4 = new Thread(MT);
        t4.start();

        // as we have not passed our thread class object, it is not a thread to same object
        Thread t5 = new Thread();
        t5.start();

        //When you extend Thread class, you can’t extend any other class which you require.
        // (As you know, Java does not allow inheriting more than one class).
        // When you implement Runnable, you can save a space for your class to extend any other class in future or now.

        //When you extends Thread class, each of your thread creates unique object and associate with it.
        // When you implements Runnable, it shares the same object to multiple threads
        
    }
}
