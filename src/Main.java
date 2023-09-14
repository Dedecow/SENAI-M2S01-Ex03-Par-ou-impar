import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(" o número digitado " +numero+ " é um número par.");
        }else {
            System.out.println("Esse número não é par, tente de novo.");
            numero = sc.nextInt();
        }
        sc.close();
    }

}