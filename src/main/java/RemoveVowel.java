import java.util.Scanner;

public class RemoveVowel {

    public static void removeVow(String data){

        data = data.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) != 'a' && data.charAt(i) != 'e' && data.charAt(i) != 'i' && data.charAt(i) != 'o' && data.charAt(i) != 'u'){
                sb.append(data.charAt(i));
            }
        }

        String result = sb.toString().replaceAll("\\s+", " ").trim(); //remove extra space
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your data: ");  //I am a SQA Engineer
        String data = input.nextLine();

        removeVow(data);
    }
}
