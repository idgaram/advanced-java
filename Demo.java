
public class Demo{ 

    public static void main(String[] args) {

        int i = 1;


        

        try {
            int j = 10/i;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("error happened : " + e);
        }

    }

}