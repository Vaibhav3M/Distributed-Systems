package MultiThreading;

public class MultiThreading_1 extends Thread{

    public void run(){
        System.out.println("I am thread " + this.getId());

        //
    }
    public static void main(String args[]){

        //Creating multiple threads
        MultiThreading_1 t1 = new MultiThreading_1();
        t1.start();

        MultiThreading_1 t2 = new MultiThreading_1();
        t2.start();

        MultiThreading_1 t3 = new MultiThreading_1();
        t3.start();

        MultiThreading_1 t4 = new MultiThreading_1();
        t4.start();

        //threads are assigned at random

    }
}
