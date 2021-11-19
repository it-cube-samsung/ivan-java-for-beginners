package simpletictactoe;

import java.util.Arrays;
import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.next();
        System.out.println(vvod);

//        System.out.println("---------");
//        for (int i = 0; i < 3; i += 1) {
//            int startIndex = i * 3;
//            String res = "| " + vvod.charAt(startIndex) + " " + vvod.charAt(startIndex + 1) + " " + vvod.charAt(startIndex + 2) + " |";
//            System.out.println(res);
//        }
//        System.out.println("---------");

        char[][] arr = new char[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = vvod.charAt(i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}