package homeWork1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки на полиндром: ");
        String str = scanner.nextLine();
        System.out.println(check(str));
    }
    public static boolean check (String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            Character c1 = str.charAt(left);
            Character c2 = str.charAt(right);
            if (!Character.isLetterOrDigit(c1)) {
                left++;
            }
            else if (!Character.isLetterOrDigit(c2)) {
                right--;
            }
            else {
                if (c1 != c2) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
