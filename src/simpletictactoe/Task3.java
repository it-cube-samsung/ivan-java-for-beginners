package simpletictactoe;

import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.next();
        boolean winx = false;
        boolean win0 = false;
        int countx = 0;
        int count0 = 0;
        int freeplaces = 0;
        System.out.println(vvod);

        char[][] arr = new char[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int vvodIndex = j + i * 3;
                arr[i][j] = vvod.charAt(vvodIndex);
            }
        }

        System.out.println("---------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("| " + arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " |");
            switch (arr[i][0]) {
                case '_':
                    freeplaces++;
                    break;
                case '0':
                    count0++;
                    break;
                case 'X':
                    countx++;
                    break;
            }
            switch (arr[i][1]) {
                case '_':
                    freeplaces++;
                    break;
                case '0':
                    count0++;
                    break;
                case 'X':
                    countx++;
                    break;
            }
            {
                switch (arr[i][2]) {
                    case '_':
                        freeplaces++;
                        break;
                    case '0':
                        count0++;
                        break;
                    case 'X':
                        countx++;
                        break;
                }
            }
        }

        System.out.println("---------");

        if ((arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] && arr[0][2] == 'X')
                || (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] && arr[1][0] == 'X')
                || (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] && arr[2][0] == 'X')
                || (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && arr[0][0] == 'X')
                || (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && arr[0][1] == 'X')
                || (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2] && arr[1][2] == 'X')
                || (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] == 'X')
                || (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[1][1] == 'X')) {
            winx = true;
        }

        if ((arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] && arr[0][2] == '0')
                || (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] && arr[1][0] == '0')
                || (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] && arr[2][0] == '0')
                || (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && arr[0][0] == '0')
                || (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && arr[0][1] == '0')
                || (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2] && arr[1][2] == '0')
                || (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[1][1] == '0')
                || (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[1][1] == '0')) {
            win0 = true;
        }

        if ((winx && win0) || (countx - count0 >= 2) || (count0 - countx >= 1)) {
            System.out.println("Impossible");
        }
        else if ((freeplaces == 0) && (winx == false) && (win0 == false)) {
            System.out.println("End");
        }
        else if ((winx == false) && (win0 == false) && (freeplaces >= 1)) {
            System.out.println("Game not finished");
        }
        else if (winx == true) {
            System.out.println("Win X");
        }
        else if (win0 == true) {
            System.out.println("Win 0");
        }
    }
}