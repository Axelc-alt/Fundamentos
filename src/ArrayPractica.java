import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractica {
    public static void Practica(){
        ArrayList<String> frutas= new ArrayList<>();


        Scanner in = new Scanner(System.in);



        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese frutas");
            String entrada = in.nextLine();
            frutas.add(i, entrada);
        }
        System.out.println("Las frutas son");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }


    }
}
