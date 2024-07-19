import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean numeroEsPrimo;

        do {
            System.out.println("Introduce un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero == 0 ) {
                System.out.println("Programa terminado.");
                break;
            }

            numeroEsPrimo = verificarSiEsPrimo(numero);

            if (numeroEsPrimo) {
                System.out.println("El numero " +numero+ " es primo.");
            } else {
                System.out.println("El numero " +numero+ " no es primo. Intentelo de nuevo.");
            }
        } while (!numeroEsPrimo);
    }
    public static boolean verificarSiEsPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2;i <= Math.sqrt(numero); i++) {
            if (numero %i == 0) {
                return false;
            }
        }
        return true;
    }
}
