package While;

import java.util.Scanner;

public class execw2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String valor = "sim";

        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Você diz: ");
            valor = sc.nextLine();

        }

        sc.close();
    }
}
