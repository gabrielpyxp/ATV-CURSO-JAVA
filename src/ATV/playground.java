//crie um programa em que o usuario insere o seu nome e o sistema retorna uma saudção personalizada

package colaborador;

import java.util.Scanner;

public class playground {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bom dia, qual o seu nome?: ");

        String name = sc.nextLine();



        System.out.println("Olá "  +name+ ",! Seja bem-vindo! " );


        sc.close();
    }
}
