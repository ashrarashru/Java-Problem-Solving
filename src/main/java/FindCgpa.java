import java.util.Arrays;
import java.util.Scanner;

public class FindCgpa {

    public static double fCgpa(double[] num, double target){

        int first = 0;
        int last = num.length - 1;
        int mid;

        while (first <= last){
            mid = ((first+last)/2);

            if(target > num[mid]){
                first = mid + 1;
            }
            else if (target < num[mid]) {
                last = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your CGPA: ");

        double target = input.nextDouble();

        double[] num = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(num);

        double result = fCgpa(num, target);

        if(result == -1){
            System.out.println("The CGPA is not found");
        }
        else{
            System.out.println("The CGPA is found in "+ (int)result + " number of index");
        }
    }
}
