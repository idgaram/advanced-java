
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import java.io.IOException;

public class Demo{ 

    public static void main (String[] args) throws NumberFormatException, IOException{
    // int nombre = 0;
    //     try {
    //         nombre = System.in.read();
    //     } catch (IOException e) {
    //         System.out.println(e);
    //     }
    //     System.out.println((int) nombre);

    InputStreamReader in = new InputStreamReader(System.in);
        try (BufferedReader bf = new BufferedReader(in)) {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }

}