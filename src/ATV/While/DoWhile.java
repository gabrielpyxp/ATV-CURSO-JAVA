package While;

import java.util.Scanner;

// if (...) sentenca; ou {}
// while(...) sentenca; ou {}
//for (...; ...; ...;) ou {}
// do {} while(...);
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = "";


        do{
            System.out.println("você precisa falar as " +
                    "palavras mágicas");
            System.out.print("Quer sair?");
            texto = sc.nextLine();
        } while(!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado!");

        sc.close();
    }
}
