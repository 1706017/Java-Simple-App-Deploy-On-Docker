import java.util.Scanner;

public class SimpleJavaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Java App!");
        System.out.print("Please enter your name: ");
        
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! Welcome to your Java application.");
        scanner.close();
    }
}
