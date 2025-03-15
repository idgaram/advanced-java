public class Demo{ 

    public static void main(String[] args) {

        int i = 20 ;
        int j = 0;



        

        try {
            j = 18/i;
            if (j==0) {
                throw new ArithmeticException("i don't want to print 0");
            }
            System.out.println(j);

        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception: " + e);
        } catch(Exception e){
            System.out.println("error happened : " + e);
        }

    }

}