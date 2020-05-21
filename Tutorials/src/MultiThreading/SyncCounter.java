package MultiThreading;

import java.util.concurrent.locks.Lock;

public class SyncCounter {

    // try removing synchronized keyword
    private int c =0;

    public void increment(){
       //synchronized (this) {
           c++;
       //}
    }

    public void decrement(){
       // synchronized (this) {
            c--;
    //    }
    }

    public int getValue(){
        //synchronized (this){
            return c;
        //}
    }



    public static void main(String args[]){

        SyncCounter counter = new SyncCounter();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Increment  " + counter.getValue());
                counter.increment();
                System.out.println("Increment thread value " + counter.getValue());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Decrement  " + counter.getValue());
                counter.decrement();
                System.out.println("Decrement thread value " + counter.getValue());
            }
        }).start();


        System.out.println("Main thread " + counter.getValue());

    }
}
