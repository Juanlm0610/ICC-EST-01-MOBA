import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Tamanio del arreglo : ");

        int tam = scanner.nextInt();

        if(tam<=0){
            System.out.println("El tamanio Ingresado es invalido, Adios!");

        }

        do{
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un entero valido, Tonto >:c ");
                scanner.next();
                
            }
            tam = scanner.nextInt();
            if(tam<=0){
                System.out.println("El tamanio Ingresado es invalido, Adios!");
        }
    }while(tam <= 0);

       int[] arreglo = new int[tam];

       for (int i = 0 ; i<tam ; i++){
        System.out.println("INgrese el numero de la poscision " + (i+1) + " : ");
        arreglo[i] = scanner.nextInt();
       }

       mO.printArr(arreglo);
       mO.sortBubbleAva(arreglo);
       mO.printArr(arreglo);
}
}
