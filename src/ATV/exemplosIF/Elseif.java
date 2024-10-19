package exemplosIF;

import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        if (nota > 10 || nota <0 ){
            System.out.println("Nota invalida");

        }else if (nota >= 8.1) {
            System.out.println("Conceito A! ");

        }else {
            if (nota >= 6.1){
                System.out.println("Conceito B");

            }
        }


        System.out.println("Acabou BB!rs");
        sc.close();
    }
}
