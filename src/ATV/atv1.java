//
package colaborador;
import java.util.Scanner;


public class atv1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean SistemaAtivo = true;

      while(SistemaAtivo){
          System.out.flush();
          System.out.println("Login, Digite seu usuario: ");
          String usuario = sc.nextLine();

        if (usuario.equalsIgnoreCase("admin")) {


        }
        else {

            System.out.println("Este usuario nunca foi cadastrado: ");

        }



        System.out.println("Login, Digite seu password: ");

        String senha = sc.nextLine();

        if (senha.equals("1234")){
            System.out.println("Senha Correta:");
        break;
        } else {

            System.out.println("Senha incorreta!");




        }

    }
        sc.close();
    }}
