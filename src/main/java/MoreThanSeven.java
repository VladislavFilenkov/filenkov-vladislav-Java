import java.util.Scanner;

public class MoreThanSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();

        if (a > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Введенное число меньше либо равно семи");
        }
    }
}
