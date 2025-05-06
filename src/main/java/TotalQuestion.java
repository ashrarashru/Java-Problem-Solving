public class TotalQuestion {

    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;

        for (x = 0; x <= 15; x++) {
            y = 15-x;

            if((5 * x) + (10 * y) == 100){
                System.out.println("5 marks question is " + x);
                System.out.println("10 marks question is " + y);
                break;
            }
        }
    }
}
