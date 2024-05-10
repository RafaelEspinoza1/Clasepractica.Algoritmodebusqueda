 // Rafael Antonio Espinoza Sandoval 1m7-s
 // número de carnet: 2024-1642U 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese el número de productos en el inventario: ");
        int numproduc = scanner.nextInt();

        String[] inventario = new String[numproduc];

        for (int i = 0; i < numproduc; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ": ");
            inventario[i] = scanner.next();
        }

        System.out.println("Ingrese el nombre del producto a buscar: ");
        String productoBuscado = scanner.next();

        boolean encontrado = false;
        for (String producto : inventario) {
            if (producto.equalsIgnoreCase(productoBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El producto \"" + productoBuscado + "\" se encuentra disponible en el inventario.");
        } else {
            System.out.println("El producto \"" + productoBuscado + "\" no esta disponible en el inventario.");
        }
        scanner.close();
    }

}
 // Rafael Antonio Espinoza Sandoval 1m7-s
 // número de carnet: 2024-1642U 