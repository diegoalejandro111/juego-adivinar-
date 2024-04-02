     import java.util.Scanner;
          import java.util.Random;
          public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Random random = new Random();;

        int aleatorio = random.nextInt(11); // porfavor crea un número aleatorio entre 0 y 10
         int intentos_fallados =  0 ;
         int numero;
        System.out.println("holaaaa bienvenido al juego de adivinar el número entre 0 y 10.....");;
           do {
            System.out.print("porfavor ingresa tu número: ");
            numero = scanner.nextInt();
               intentos_fallados++;
               if (numero < aleatorio) {
                System.out.println("tu número es mayor.....");
            } else if (numero > aleatorio) {
                System.out.println("tu número es menor.....");
            }
        } while (numero != aleatorio);
           System.out.println(" WAOS mani has adivinado el número felicidades gracias por jugar mi juego..... " + aleatorio + " en " + intentos_fallados + " intentos.");;
            scanner.close();

    }

}