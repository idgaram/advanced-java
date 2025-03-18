class Counter{

    int count;
    public synchronized  void increment(){
        count++;
    }
}
public class Demo{ 

    public static void main (String[] args) throws InterruptedException{
   
        Counter ct1 = new Counter();
        // Counter ct2 = new Counter();

      Runnable obj1 = () -> {
        for (int i = 0; i < 100000; i++) {
            try {
                ct1.increment();
                // System.out.println("count for counter 1 is : " + ct1.count);
                // Thread.sleep(1);
            } 
            // catch (InterruptedException e) {}
            finally{}
        }
      };
      Runnable obj2 = () -> {
        for (int i = 0; i < 100000; i++) {
            try {
                ct1.increment();
                // System.out.println("count for counter 2 is : " + ct1.count);
                // Thread.sleep(1);
            }// catch (InterruptedException e) {}
            finally{}
        }
      };

      Thread tr1 = new Thread(obj1);
      Thread tr2 = new Thread(obj2);


        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();

        System.out.println(ct1.count);
    }

}