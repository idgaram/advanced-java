class A implements Runnable{
    public void show(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi" );
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void run(){
        show();
    }
}
class B implements Runnable{
    public void show(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello" );
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void run(){
        show();
    }
}

public class Demo{ 

    public static void main (String[] args){
   
        Runnable obj = new A();
        B obj2 = new B();

        Thread tr1 = new Thread(obj);
        Thread tr2 = new Thread(obj2);

        // obj.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(Thread.MIN_PRIORITY);

        // System.out.println(obj.getPriority());
        // System.out.println(obj2.getPriority());
        
        tr1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        tr2.start();

    }

}