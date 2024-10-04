public class MetodoOrdenamiento {

    public int[] sortBubbleAva(int[] arreglo) {

        int n = arreglo.length;
        boolean change = false;

        for (int i = 0; i < n; i++) {
            System.out.println("Pasada" + i);
            change = false;
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println("j=" + j + "[j]= " + arreglo[j] + " j + 1= " + (j + 1) + "[j+1]=" + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {

                    // Intercambio
                    int aux = arreglo[j];
                    System.out.println("Si hay cambio");
                    arreglo[j] = j + 1;
                    arreglo[j + 1] = aux;

                    change = true;

                }

            }

            if (!change) {
                break;
            }
        }

        return arreglo;
    }

    public void printArr(int[] arreglo) {

        for (int elemento : arreglo) {

            System.out.print(" " + elemento + " ");

        }

    }

}
