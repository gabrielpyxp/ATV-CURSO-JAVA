package While;
//calcular media de uma turma, digitar uma nota valida, de 10a 0

import java.util.Scanner;

    public class desafioW {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int quantidadeDeNotas = 0;
            double nota = 0;
            double total = 0;


            while (nota != -1 ) {
                System.out.println("Digite sua nota (ou -1p/sair): ");
                nota = sc.nextDouble();

                if (nota >= 0) {
                    System.out.println("Boa, nota valida!");
                }
                if (nota <= 10 && nota >= 0) {
                    total += nota;
                    quantidadeDeNotas++;
                }
                    else if (nota != -1){
                    System.out.println("Nota invalida, Digite novamente: ");
                }
            }

        //calcular media
                double media = total/quantidadeDeNotas;
                System.out.println("Media = " + media);


        }
    }


