public class SecondHighestCGPA {
    public static void main(String[] args) {

        double[] arr = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double highest = Double.MIN_VALUE;
        double second_Highest = Double.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > highest){
                second_Highest = highest;
                highest = arr[i];
            } else if (arr[i] > second_Highest && second_Highest != highest) {
                second_Highest = arr[i];
            }
        }
        System.out.println("2nd highest score: " + second_Highest);
    }
}
