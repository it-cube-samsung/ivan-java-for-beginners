package simpletictactoe;

import java.util.Scanner;
class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean winx = false;
        boolean win0 = false;
        int countx = 0;
        int count0 = 0;
        int freeplaces = 9;
        boolean cycle = true;

        char[][] arr = new char[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }

        System.out.println("---------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("| " + arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " |");
        }
        System.out.println("---------");
        int counter = 1;
        while (cycle == true) {
            for (int i = 0; i < 3; i++) {
                switch (arr[i][0]) {
                    case '0':
                        count0++;
                        break;
                    case 'X':
                        countx++;
                        break;
                }
                switch (arr[i][1]) {
                    case '0':
                        count0++;
                        break;
                    case 'X':
                        countx++;
                        break;
                }
                {
                    switch (arr[i][2]) {
                        case '0':
                            count0++;
                            break;
                        case 'X':
                            countx++;
                            break;
                    }
                }
            }





            System.out.println("Enter coordinates");
            String print0 = scanner.nextLine();
            int coord01 = (int) print0.charAt(0) - 49;
            int coord02 = (int) print0.charAt(2) - 49;

            if (print0.length() != 3) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (print0.charAt(0) - 49 < 0 || print0.charAt(0) - 49 > 2 || print0.charAt(2) - 49 < 0 || print0.charAt(2) - 49 > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if (arr[coord01][coord02] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            char ch = (counter % 2 == 0) ? '0' : 'X';
            arr[coord01][coord02] = ch;
            freeplaces--;
            counter++;



            System.out.println("---------");
            for (int k = 0; k < arr.length; k++) {
                System.out.println("| " + arr[k][0] + " " + arr[k][1] + " " + arr[k][2] + " |");
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

            if (winx) {
                System.out.println("Win X");
                cycle = false;
            }

            if (win0) {
                System.out.println("Win 0");
                cycle = false;
            }

            if (freeplaces == 0) {
                System.out.println("End");
                cycle = false;
            }
        }


    }
}