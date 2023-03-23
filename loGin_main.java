package Prueba;
import java.util.Scanner;

public class loGin_main {
    public static void main(String[] args) {
        String username = "usuario";
        String password = "contraseña"; 
        int intentosMaximos = 3;
        int intentos = 0;

        Scanner tc = new Scanner(System.in);

        while (intentos < intentosMaximos) {
            System.out.print("Ingrese su nombre de usuario: ");
            String inputUsername = tc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String inputPassword = tc.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Inicio de sesión exitoso");
                break;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos");
                intentos++;
                System.out.println("Le quedan " + (intentosMaximos - intentos) + " intentos");
            }
        }

        if (intentos == intentosMaximos) {
            System.out.println("Número máximo de intentos de inicio de sesión alcanzado");
        }

        tc.close();
    }
}
