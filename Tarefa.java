import java.util.ArrayList;
import java.util.*;

public class Tarefa{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();

        System.out.println("Digite 'N' quanto quiser parar.");
        while(true){
            try{
                int numero = scan.nextInt();
                lista.add(numero);
            }
            catch(Exception e){
                break;
            }
        }

        int maximo = Collections.max(lista);
        int minimo = Collections.min(lista);

        double soma = 0;
        for(int i = 0; i < lista.size(); i++)
            soma += lista.get(i);

        double media = (double)soma / lista.size(); 


        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        System.out.println("Média: " + media);
    }
}