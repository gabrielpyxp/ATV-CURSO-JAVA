package exemplosIF;

import java.util.Scanner;

public class exec1 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("imprima sua média: ");
        double nota = sc.nextDouble();

        if (nota >= 7.0){
            System.out.println("Aprovado!! ");
            System.out.println("Parabéns NERD!");

        }else {
            System.out.println("Burro do caraio  ;-; ");
        }

        if (nota < 4.5 && nota >+0){
            System.out.println("REPROVADO ANIMAL.");

        }







        sc.close();
    }
}
