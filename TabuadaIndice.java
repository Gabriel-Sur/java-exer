import java.util.Scanner;

public class TabuadaIndice {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        System.out.println("Digite um índice: ");
        int ind = entrada.nextInt();

        for (int f = num; f <= num + 10; f++){
            for (int i = ind; i <= 10; i++){
                System.out.println(i * f);
            }
        }
    }
}
