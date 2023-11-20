import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tercero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> descuentos = new HashMap<>();

        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + i + ": ");
            String nombreEmpleado = scanner.nextLine();

            System.out.print("Ingrese el estrato social del empleado " + i + ": ");
            int estrato = scanner.nextInt();
            scanner.nextLine(); 

            double porcentajeDescuento = 0.0;
            switch (estrato) {
                case 1:
                case 2:
                    porcentajeDescuento = 0.02;
                    break;
                case 3:
                case 4:
                    porcentajeDescuento = 0.04;
                    break;
                case 5:
                    porcentajeDescuento = 0.08;
                    break;
                case 6:
                    porcentajeDescuento = 0.10;
                    break;
                default:
                    System.out.println("Estrato no válido. No se aplicará descuento.");
            }

            double descuento = porcentajeDescuento * 100; 
            descuentos.put(nombreEmpleado, descuento);

            System.out.println("Descuento para " + nombreEmpleado + ": " + descuento + "%\n");
        }


System.out.println("Descuentos realizados:");
        for (Map.Entry<String, Double> entry : descuentos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "%");
        }
    }
}