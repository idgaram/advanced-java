public class Demo{ 

    public static void main(String[] args) {

        int i = 5 ;
        int j = 0 ;
        int nums[] = new int[5];
        String str = null;



        

        try {
            System.out.println(str.length());
            j = i/j;
            System.out.println(j);
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception: " + e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of array bounds : " + e);
        } catch(Exception e){
            System.out.println("error happened : " + e);
        }

        System.out.println(j);
    }

}