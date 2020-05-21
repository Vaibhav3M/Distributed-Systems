package MultiThreading;

public class MultiThreading_3 {

    public static void main(String args[]){

        // we can also directly create a thread object
        // this runs in different thread than mainh
        new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=0; i<10;i++){
                   System.out.println(i + " inside thread");

                   try{
                       Thread.sleep(2);
                   }
                   catch (InterruptedException e){

                       System.out.println("Oops..! Thread interruped");
                       break;
                   }
                }
            }
        }).start();

        // try commenting sleep and see difference
        System.out.println("On main thread");

    }
}
