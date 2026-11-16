import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contacto = sc.nextLine();

        int opcion;
        do{
            System.out.println("==== AGENDA DE CONTACTOS ====");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.println("Elige una opción");
            if(sc.hasNextInt()){
            opcion = sc.nextInt();
            } else{
                sc.next();
                opcion = -1;
            }
            switch(opcion){
                case 1:
                    System.out.println("Has elegido: Añadir contacto");
                    break;
                case 2:
                    System.out.println("Has elegido: Mostrar contactos");
                    break;
                case 3:
                    System.out.println("Has elegido: Buscar contacto");
                    break;
                case 4:
                    System.out.println("Has elegido: Salir. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Elige un número del 1 al 4.");
            }
            System.out.println();
        }
        while (opcion !=4);
        sc.close();
    }
}