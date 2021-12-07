import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Peso: ");
        double peso  = entrada.nextDouble();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso /(Math.pow(altura, 2));

        if (imc < 20){
            System.out.println("Abaixo do peso!");
        }
        else if (imc > 20 && imc <25){
            System.out.println("Peso normal!");
        }
        else if (imc > 25 && imc < 30){
            System.out.println("Sobrepeso!");
        }
        else if (imc > 30 && imc < 40){
            System.out.println("Obeso!");
        }
        else{
            System.out.println("Obeso Mórbido!");
        }

    }
}
