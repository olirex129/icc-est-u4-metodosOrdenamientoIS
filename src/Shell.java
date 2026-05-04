public class Shell {
    int array[];

    public Shell(int[] arreglo) {
        this.array = arreglo;
    }

    public void ShellSort(boolean asc) {
        System.out.println("==== METODO SHELL ====");
        System.out.println("Arreglo original:");
        printArray();
        System.out.println();

        int tam = array.length;
        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        // El salto (gap) comienza en tam/2 y se reduce a la mitad en cada iteración
        for (int salto = tam / 2; salto > 0; salto /= 2) {
            System.out.println("--- Salto (Gap) actual: " + salto + " ---");
            
            for (int i = salto; i < tam; i++) {
                iteraciones++;
                int aux = array[i];
                int j = i;

                // 
                System.out.print("I" + iteraciones + " ");
                for (int k : array) {
                    System.out.print(k + ", ");
                }
                
                comparaciones++;
                
                
                if (asc) {
                    System.out.print("---------- i= " + i + " j= " + (j - salto) + " [i]= " + aux + " [j]= " + array[j - salto]);
                    if(j>=salto && array[j-salto] > aux){
                        System.out.println(" cambio = si");
                    }
                    else{
                        System.out.println(" cambio = no");
                        System.out.println("");
                    }
                    while (j >= salto && array[j - salto] > aux) {
                        if (j > i) comparaciones++; // Comparaciones extras dentro del while
                        System.out.println(array[j - salto]+", " + array[j] +"---------- i= " + i + " j= " + (j - salto) + " [i]= " + aux + " [j]= " + array[j - salto]);
                        array[j] = array[j - salto];
                        j -= salto;
                        cambios++;
                    }
                } 
                else {
                    System.out.print("---------- i= " + i + " j= " + (j - salto) + " [i]= " + aux + " [j]= " + array[j - salto]);

                    if(j>=salto && array[j-salto] < aux){
                        System.out.println(" cambio = si");
                    }
                    else{
                        System.out.println(" cambio = no");
                        System.out.println("");
                    }
                    while (j >= salto && array[j - salto] < aux) {
                        if (j > i) comparaciones++;
                        
                        System.out.println("       " + array[j]+", " + array[j-salto] +"---------- i= " + i + " j= " + (j - salto) + " [i]= " + aux + " [j]= " + array[j - salto]);
                        array[j] = array[j - salto];
                        j -= salto;
                        cambios++;
                    }
                }

                array[j] = aux;
            }
            System.out.println();
        }

        System.out.print("end: ");
        printArray();
        System.out.println("Comparaciones = " + comparaciones);
        System.out.println("Cambios (Desplazamientos) = " + cambios);
        System.out.println("Iteraciones = " + iteraciones);
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}