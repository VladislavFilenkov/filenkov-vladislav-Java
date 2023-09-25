import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = "Вячеслав";

        if (a.equals(b)) {
            System.out.println("Привет, " + b);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
