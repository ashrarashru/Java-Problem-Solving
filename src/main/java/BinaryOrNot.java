import javax.swing.*;
import java.util.Scanner;

public class BinaryOrNot {

    public static void binary(String data){

        boolean isBinary = true;

        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) != '0' && data.charAt(i) != '1'){
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your data: "); //1001 or 2001

        String data = input.nextLine();

        binary(data);

    }
}
