import java.util.Arrays;
import java.util.Random;

public class MaxMinFromRandom {

    public static void findMax(int[] num){

        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println("The max number is: " + max);
    }

    public static void findMin(int[] num){

        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println("The min number is: " + min);
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int result = random.nextInt(1,50);
            arr[i] = result;
        }

        System.out.println("The random number is: " + Arrays.toString(arr).replaceAll("[\\[\\]]", ""));
        findMax(arr);
        findMin(arr);

    }
}
