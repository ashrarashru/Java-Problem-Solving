import java.util.*;

public class RandomPassword {

    public static void main(String[] args) {

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String special = "!@#$%^&*";
        String number = "0123456789";

        String combined = upper + lower + special + number;

        char[] totalPassword = combined.toCharArray();

        Random random = new Random();

        char[] password = new char[8];

        password[0] = upper.charAt(random.nextInt(upper.length()));
        password[1] = lower.charAt(random.nextInt(lower.length()));
        password[2] = special.charAt(random.nextInt(special.length()));
        password[3] = number.charAt(random.nextInt(number.length()));

        for (int i = 4; i < password.length; i++) {
            int index = random.nextInt(totalPassword.length);
            password[i] = totalPassword[index];
        }

        List<Character> shuPass = new ArrayList<>();

        for (int i = 0; i < password.length; i++) {
            shuPass.add(password[i]);
        }

        Collections.shuffle(shuPass);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < password.length; i++) {
            sb.append(shuPass.get(i));
        }

        System.out.println("Random generated password is: "+ sb);
    }
}
