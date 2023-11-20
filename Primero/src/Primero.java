import java.util.Scanner;

public class Primero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPersonasRegistradas = 0;
        int personasIngresadas = 0;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        System.out.print("Ingrese el número de personas a registrar: ");
        int numPersonas = scanner.nextInt();


        for (int i = 1; i <= numPersonas; i++) {
            
            System.out.print("Ingrese el nombre de la persona " + i + ": ");
            scanner.nextLine(); 
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el documento de la persona " + i + ": ");
            String documento = scanner.nextLine();

            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese la profesión de la persona " + i + ": ");
            scanner.nextLine();
            String profesion = scanner.nextLine();

            
            totalPersonasRegistradas++;
            personasIngresadas++;

            if (edad >= 18) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        System.out.println("Total de personas registradas: " + totalPersonasRegistradas);
        System.out.println("Cantidad de personas ingresadas: " + personasIngresadas);
        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);

       
        scanner.close();
    }
}
