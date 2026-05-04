public class Insert {
    int array[];   

public  Insert(int[] arreglo){
    this.array = arreglo;

}
public void InsertSort(int array[], boolean asc){
    System.out.println("==== METODO INSERCIÓN ====");
    System.out.println("Arreglo original");
    System.out.println();
    printArray();
    System.out.println();
    int tam = array.length;
    int comparaciones = 0;
    int cambios = 0;
    int iteraciones = 0;
    for(int i = 1 ; i < tam ; i++){
        System.out.println();
        iteraciones++;
        int aux = array[i];
        int j = i-1;
        /////////////////////
        System.out.print("I"+ i + " ");
        for (int k : array) {
        System.out.print(k + ", ");
    }
    if(!asc){
        System.out.print("---------- i= "+ i + " j= "+ j + " [i] = " + array[i] + " [j]= " + array[j]);
    if (array[j] < aux) {
        System.out.println(" cambio = si");
    }
    else{
        System.out.println(" cambio = no");
    }
    }
    else{
    System.out.print("---------- i= "+ i + " j= "+ j + " [i] = " + array[i] + " [j]= " + array[j]);
    if (array[j] > aux) {
        System.out.println(" cambio = si");
    }
    else{
        System.out.println(" cambio = no");
    }
}
        
        /////////////////////
        comparaciones++;//las comparaciones no exitosas
        boolean existeCambio = false;
        if(!asc){
             while( j>=0 && array[j] < aux){
            System.out.println(aux + ", " + array[j] + "---------- i= "+ i + " j= "+ j + " [i] = " + array[i] + " [j]= " + array[j]);
            comparaciones++;//las comparaciones exitosas
            array[j+1] = array[j];
            existeCambio = true;
            j = j - 1;
            }  
        }
        else{
        while( j>=0 && array[j] > aux){
            System.out.println(aux + ", " + array[j] + "---------- i= "+ i + " j= "+ j + " [i] = " + array[i] + " [j]= " + array[j]);
            comparaciones++;//las comparaciones exitosas
            array[j+1] = array[j];
            existeCambio = true;
            j = j - 1;
            }  
        }
            array[j+1] = aux;
            if(existeCambio){
                cambios++;
            }
            System.out.println();
            
        }
        System.out.print("end: ");
        printArray();
        System.out.println("Comparaciones = " + comparaciones );
        System.out.println("Cambios = " + cambios);
        System.out.println("Iteraciones = " + iteraciones);

    }
public void printArray(){
    for (int i : array) {
        System.out.print(i+", ");
    }
    System.out.println();

}
}