class A{
    public void showLongName(){
        System.out.println("in a show");
    }
}

class B extends A{
    public void showLongName(){
        System.out.println("in b show");
    }
}
public class Demo{

    public static void main(String[] args) {
    B obj = new B();   
    obj.showLongName();
        
    }
   
    
    
}