import java.util.Random;

enum Status{
    Running, Failed, Pending, Success
}
public class Demo{

    public static void main(String[] args) {

        Random seed = new Random();
        
        int randomInt = seed.nextInt(Status.values().length);

        System.out.println(randomInt);


        switch (Status.values()[randomInt]) {
            case Running:
                System.out.println("all good");
                break;
            default:
                System.out.println("not running");
                break;
        }
        

            // Status s = Status.values()[randomInt];

            // if(s == Status.Pending){
            //     System.out.println("all good");
            // }
            // else if(s != Status.Pending){
            //     System.out.println("no good");
            // }
    }
   
    
    
}