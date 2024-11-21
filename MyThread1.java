//  creating thread using Thread class 

public class MyThread1  extends Thread{
     
 // this is a run method of Thread
    public void run(){
        
        // task of the terads 

         for(int i=10; i>0;i--){
            System.out.println("the value of i is : " + i);
             // if the thread delaye 2 second  than
         try{

            Thread.sleep(2000);

         }catch(Exception e){}
    }

         }

        
    public static void main(String[] args) {
        // createing a object of MyThread1 class 
         MyThread1 t = new MyThread1();
          
         // this is the start method of Thread
        t.start();

    }
}
