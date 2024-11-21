public class main {
    public static void main(String[] args) {
         Compeny comp = new Compeny();
         Producer p= new Producer(comp);
         Consumer c= new Consumer(comp);
         p.start();
         c.start();
    }
}
