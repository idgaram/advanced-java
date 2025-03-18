class A extends Thread{
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
class B extends Thread{
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
   
        A obj = new A();
        B obj2 = new B();

        // obj.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(obj.getPriority());
        System.out.println(obj2.getPriority());
        
        obj.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        obj2.start();

    }

}