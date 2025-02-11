import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your name:");
        String nome = scanner.nextLine();
        System.out.printf("User name %s contains %d caracteres %n", nome.toLowerCase(), nome.length());
    }
}
