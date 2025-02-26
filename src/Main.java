import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + " " + "\uD83D\uDE02" +"\uD83D\uDE48");

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
