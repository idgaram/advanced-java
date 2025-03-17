class CustomException extends Exception{
    public CustomException(String string){
        super(string);
    }
}

public class Demo{ 

    public static void main(String[] args) {
        try{
        Class.forName("CustomException");
        } catch(ClassNotFoundException e) {
            System.out.println("no class.forName()");
        }
        // int i = 20 ;
        // int j;
        
        // CustomException obj = new CustomException("a");

        

        // try {
        //     j = 18/i;
        //     if (j==0) {
        //         throw new CustomException("i don't want to print 0");
        //     }
        //     System.out.println(j);

        // } catch (CustomException e) {
        //     System.out.println("in custom exception: " + e);
        // } catch(Exception e){
        //     System.out.println("error happened : " + e);
        // }

    }

}