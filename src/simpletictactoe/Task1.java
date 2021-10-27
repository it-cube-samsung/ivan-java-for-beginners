package simpletictactoe;

public class Task1 {
    public static void main(String[] args) {
        String setka = "xoxxoxxox";

        for(int i = 0; i < 3; i += 1) {
            int startIndex = i * 3;
            String res = setka.charAt(startIndex) + " " + setka.charAt(startIndex + 1) + " " + setka.charAt(startIndex + 2);
            System.out.println(res);
        }
    }
}
