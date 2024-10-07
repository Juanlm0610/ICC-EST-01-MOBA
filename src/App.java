import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");

        leerEnteroValido(scanner, false); // Llama a la función después de obtener el tamaño
    }

    public static int leerEnteroValido(Scanner scann1, boolean numerosNegativos) {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        int num = 0;

        do {
            System.out.println("Ingrese el tamaño que sea positivo");
            while (!scann1.hasNextInt()) {
                System.out.println("Error: El valor ingresado no es valido");
                scann1.next();
            }
            num = scann1.nextInt();
            if (num <= 0 || numerosNegativos) {
                System.out.println("El tamaño debe ser un entero positivo");
            }
        } while (num <= 0);

        int[] arreglo = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            arreglo[i] = scann1.nextInt();
        }

        mO.printArr(arreglo);
        mO.sortBubbleAva(arreglo);
        mO.printArr(arreglo);
        scann1.close();

        return num;
    }
}
