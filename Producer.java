public class Producer extends Thread {

Compeny c;

Producer(Compeny c){
     this.c=c;
}

     public void Run(){
        // task 
        int i=1;
while(true){

    
 this.c.produce_item(i);

 
 try {
    Thread.sleep(1000);
 } catch (Exception e) {
    // TODO: handle exception
 }
 i++;
}
     }
}
