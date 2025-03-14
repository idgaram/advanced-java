@FunctionalInterface
interface A{
    void show(int i);
}

// class B implements A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

public class Demo{ 

    public static void main(String[] args) {

        A obj = i -> System.out.println("in A show " + i);
        obj.show(15);

    }
   
    
    
}