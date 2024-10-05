import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        
        
        leerEnteroValido(scanner, false); // Llama a la función después de obtener el tamaño
    }

    public static int leerEnteroValido(Scanner s, boolean numerosNegativos) {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        int num = 0;

        do {
            System.out.println("Ingrese el tamaño que sea positivo");
            while (!s.hasNextInt()) {
                System.out.println("Error: El valor ingresado no es valido");
                s.next();
            }
            num = s.nextInt();
            if (num <= 0 || numerosNegativos) {
                System.out.println("El tamaño debe ser un entero positivo");
            }
        } while (num <= 0);

        int[] arreglo = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            arreglo[i] = s.nextInt();
        }

        mO.printArr(arreglo);
        mO.sortBubbleAva(arreglo);
        mO.printArr(arreglo);
        s.close();

        return num;
    }
}
