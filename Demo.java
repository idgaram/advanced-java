class A implements Runnable{
    String msg = "hello";

    public A(){

    }

    public A(String msg){
        this.msg = msg;
    }

    public void show(){
        for (int i = 0; i < 100; i++) {
            System.out.println(msg);
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
// class B implements Runnable{
//     public void show(){
//         for (int i = 0; i < 100; i++) {
//             System.out.println("hello" );
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
//     public void run(){
//         show();
//     }
// }

public class Demo{ 

    public static void main (String[] args){
   
        A obj = new A("hello 1");
        A obj2 = new A("hello 2");

        Thread tr1 = new Thread(obj);
        Thread tr2 = new Thread(obj2);

        tr1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        tr2.start();

    }

}