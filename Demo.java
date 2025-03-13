enum Status{
    Running, Failed, Pending, Success
}
public class Demo{

    public static void main(String[] args) {
    int i =5;
    Status s = Status.Failed; 
    System.out.println(s.ordinal());
    System.out.println(s.getClass());

    Status[] all = Status.values();
    for (Status single : all) {
        System.out.println(single + " : " + single.ordinal());
    }

    }
   
    
    
}