import java.util.Scanner;

public class App {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        sc.close();

        double celsius = 5 * ((fahrenheit - 32) / 9 );

        System.out.print("A é temperatura em graus celsius é: " +celsius);

    }
    
}