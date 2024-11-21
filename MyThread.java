// crateing a thread using runnable Interface
public class MyThread implements Runnable {
        public void run(){
            // task for thread
            for(int i=0 ; i<10;i++){
                System.out.println(i);

                // if you want to hold the teread 1 sec then we use thread.sleep() ; 
                try {
                     Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }   
            }
        }

        public static void main(String[] args) {
            // create a MyThread Object 
            MyThread  t = new MyThread();

            // create a Thread 

            Thread thread= new Thread(t);
            
            // this is a start method of thread
            thread.start();
        }
} 
