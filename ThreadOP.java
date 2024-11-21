
// here i am using the  oprations of  multithreading 
public class ThreadOP {

 static class UserThread extends Thread {
         
        public void run(){ 
            // task of the thread 
            System.out.println(" this is the user  defined thread ");
        }

    }
      public static void main(String[] args) {
         System.out.println( "Program Started");
         int x=56+34;
         System.out.println("sum is : " + x);

         // this is return the current Thread
         Thread t = Thread.currentThread();

         // this is the method to get the  name of Thread 
         String tname = t.getName();
         System.out.println(" currrent thread is "+tname );

         // set a new name of the thread 
           t.setName("myName");

           System.out.println(" after change the name of thread "+t.getName());



           // sleep() is used to sleep the Thread and delay the 5 sec 
          try{
            Thread.sleep(5000);
          }  catch(Exception e){

          }
         
         
        
 
          // to run the UserThread we should create the object of the UserThread 

          
          UserThread th = new UserThread();
          th.start();


          

          System.out.println("Program Ended ..");

      }
}

