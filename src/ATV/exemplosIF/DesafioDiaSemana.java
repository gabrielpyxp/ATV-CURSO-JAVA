package exemplosIF;

import java.util.Scanner;

// domingo  - 1
// quarta -> 4
// terça -> 3
public class DesafioDiaSemana {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia da semana nerdola: ");
        String dia = sc.next();

        if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("sabado")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(5);
        }











    }


}
