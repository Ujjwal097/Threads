public class Consumer extends Thread {
      
    Compeny c;

    Consumer(Compeny c){
        this.c=c;

    }

    public void run(){
        // task 
      while (true) {
         this.c.consume_item();
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
            // TODO: handle exception
         }
      }
    }
}
