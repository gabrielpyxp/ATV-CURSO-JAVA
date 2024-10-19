package exemplosIF;

import javax.swing.JOptionPane;

public class desafioIF {
    public static void main (String[]args){

        String valor = JOptionPane.showInputDialog("Informe o número:");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("Este número é PAR POHA!");
        }else {
            System.out.println("Este número é impar KRL!");
        }






    }
}
