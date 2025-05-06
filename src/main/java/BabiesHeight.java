import java.util.Arrays;
import java.util.Scanner;

public class BabiesHeight {

    public static void height(int[] height) {

        int lowest = Integer.MAX_VALUE;
        int sec_Lowest = Integer.MAX_VALUE;

        for (int i = 0; i < height.length; i++) {
            if(lowest > height[i]){
                sec_Lowest = lowest;
                lowest = height[i];
            }
            else if (sec_Lowest > height[i]) {
                sec_Lowest = height[i];
            }
        }

        System.out.println("Lowest baby's height is: " + lowest);
        System.out.println("Second lowest baby's height is: " + sec_Lowest);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] height = new int[10];

        for (int i = 0; i <height.length; i++) {
            System.out.print("Enter your babies height: ");
            height[i] = input.nextInt();
        }

        height(height);

    }
}
