import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();
        System.out.println("Escolha a operação: 1(soma), 2(subtração), 3(multiplicação), 4(divisão)");
        int operacao = scan.nextInt();

        switch (operacao) {
            case 1:
                System.out.println(soma(num1, num2));
                break;
            case 2:
                System.out.println(subtracao(num1, num2));
                break;
            case 3:
                System.out.println(multiplicacao(num1, num2));
                break;
            case 4:
                // Verifica se num2 é 0 antes de realizar a divisão
                if (num2 != 0) {
                    System.out.println(divisao(num1, num2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static float divisao(int a, int b) {
        // Converte os inteiros para float antes de dividir
        return (float) a / b;
    }
}
