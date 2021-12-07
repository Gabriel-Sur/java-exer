import java.util.Scanner;

public class Bar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe seu ano de nascimento: ");
        int ano = entrada.nextInt();

        if(ano > 2002){
            int falta = 18 - (2020 - ano);
            System.out.println("Apenas maiores de idade podem beber, falta " + falta + "anos para você poder beber!");
        }
        else{
            System.out.println("Qual drink você vai querer? ");
            String drink = entrada.next();
            System.out.println("Aqui está o seu " + drink);
        }
    }

}



