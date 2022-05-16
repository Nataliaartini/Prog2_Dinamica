import java.util.ArrayList;
import java.util.*;

public class Tarefa{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();

        for(int i=0; i<20; i++){
            int numero = scan.nextInt();
            lista.add(numero);
        }

        int maximo = Collections.max(lista);
        int minimo = Collections.min(lista);

        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
    }
}
