import java.util.Scanner;

public class WordCharVowelConsonant {

    public static void findWords(String name) {

        String[] word = name.split(" ");
        System.out.println("Words: " + word.length);
    }

    public static void findChars(String name) {
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Chars: "+ count);
    }

    public static void findVowel(String name) {

        int count = 0;
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' ||name.charAt(i) == 'i' ||name.charAt(i) == 'o' ||name.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Vowel: " + count);
    }

    public static void findConsonant(String name) {

        int count = 0;
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != ' ' && name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o' && name.charAt(i) != 'u'){
                count++;
            }
        }

        System.out.println("Consonant: " + count);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your words: "); //I am a SQA Engineer

        String data = input.nextLine();
        findWords(data);
        findChars(data);
        findVowel(data);
        findConsonant(data);
    }
}
