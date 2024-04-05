import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Digite o número da operação desejada: ");
        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
                break;
        }
        switch (escolha) {
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtracao é: " + resultado);
                break;
        }
        switch (escolha) {
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado da Multiplicação é: " + resultado);
                break;
        }
        switch (escolha) {
            case 4:
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
        }
    }
}
