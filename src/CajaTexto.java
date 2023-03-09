import java.util.ArrayList;
import java.util.Scanner;
public class CajaTexto {
    static ArrayList <Integer> lista= new ArrayList<>();
    public static void entradaDatos(){

        Scanner in = new Scanner(System.in);
        int nun = 0;
        do {
            System.out.println("ingrese un Número");
            nun = in.nextInt();
            lista.add(nun);
        }while (nun != 0);
        sumaTotal();
    }
    public static  void sumaTotal(){
        int total = 0;

        for (int i = 0; i < lista.size(); i++) {
            total = total + lista.get(i);
        }
        System.out.println("SUuma total = "+ total);
    }
}

