import java.util.Arrays;
import java.util.Scanner;

public class IpValidOrNot {

    public static void ipCheck(String ip){
        int count = 0;

        String[] cut = ip.split("\\.");

        int[] ipAdd = new int[cut.length];

        for (int i = 0; i < cut.length; i++) {
            ipAdd[i] = Integer.parseInt(cut[i]);
        }


        for (int i = 0; i < 4; i++) {
            if(ipAdd.length < 4){
                count++;
            }
            else if (ipAdd[0] == 0 || ipAdd[0] < 10) {
                count++;
            }
        }

        if(count == 0){
            System.out.println("Valid IP");
        }
        else{
            System.out.println("Invalid IP");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your IP address: ");

        String result = input.nextLine();
        ipCheck(result);
    }
}
