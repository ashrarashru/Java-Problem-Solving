import java.util.Scanner;

public class CountNotes {

    public static void count(int[] notes, int amount){

        while(amount > 0){
            for (int i = 0; i < notes.length; i++) {
                if(amount >= notes[i]){
                    int count = amount / notes[i];
                    amount = amount % notes[i];
                    System.out.println(notes[i] + " " + count);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] notes = {1000,500,200,100,50,20,10,5,2,1};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter you amount: "); //546
        int amount = input.nextInt();

        count(notes,amount);
    }
}
