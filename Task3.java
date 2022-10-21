package homeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для разворота: ");
        String str = scanner.nextLine();
        String result = "";
        str = str.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            if (str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
            else {
                if (sb.isEmpty()){

                }
                else {
                    sb = sb.reverse();
                    result = result + sb + " ";
                    sb = new StringBuilder();
                }

            }

        }
        sb = sb.reverse();
        result = result + sb;
        result = result.trim();
        System.out.println(result);
    }
}
