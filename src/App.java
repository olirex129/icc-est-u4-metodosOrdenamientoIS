import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] arregloOriginal = {12,-7,25,0,-15,33,19,-22,5,48,-3};
        int[] arregloInsert = arregloOriginal.clone();
        int[] arregloShell = arregloOriginal.clone();

        Shell sortShell = new Shell(arregloShell);
        Insert sortInsert = new Insert(arregloInsert);

        Scanner teclado = new Scanner(System.in);
        System.out.println("MENU DE ORDENAMIENTO");
        System.out.println();
        System.out.println("1.Ejecutar Ordenamientos");
        System.out.println("2.Salir");

        int menu = teclado.nextInt();
        switch (menu) {
            case 1:
                System.out.println("En el metodo Insert: ");
                System.out.println("Acendiente = true");
                System.out.println("Descendiente = false");
                boolean insertOrden = teclado.nextBoolean();
                sortInsert.InsertSort(arregloInsert,insertOrden);
                System.out.println("///////////////////////////////////////////////////");
                System.out.println("En el metodo Shell: ");
                System.out.println("Acendiente = true");
                System.out.println("Descendiente = false");
                boolean shellOrden = teclado.nextBoolean();
                sortShell.ShellSort(arregloShell,shellOrden);
                break;
            case 2:
                System.out.println("Saliste");
                break;
        }

        
}
}