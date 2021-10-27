package simpletictactoe;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.next();
        System.out.println(vvod);

        for(int i = 0; i < 3; i += 1) {
            int startIndex = i * 3;
            String res = vvod.charAt(startIndex) + " " + vvod.charAt(startIndex + 1) + " " + vvod.charAt(startIndex + 2);
            System.out.println(res);
        }
    }
}
