import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Digite um número entre 1 e 10: ");
            input = scanner.nextInt();
        } while (input < 1 || input > 10);

        System.out.println("Você digitou: " + input);
    }
}
