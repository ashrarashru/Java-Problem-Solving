import java.util.Arrays;

public class SortingCgpa {
    public static void main(String[] args) {
        double[] arr = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        
        System.out.println("The final sorting value is: " + Arrays.toString(arr).replaceAll("[\\[\\]]",""));
    }
}
