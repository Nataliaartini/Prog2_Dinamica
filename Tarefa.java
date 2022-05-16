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

        ArrayList<Integer> primos = new ArrayList();

        for(int i = 0; i < lista.size(); i++){
            int numDivisoes = 0;
            int numAtual = lista.get(i);
            for(int num = numAtual; num > 0; num--){
                if(numAtual % num == 0){
                    numDivisoes++;
                }

                if(numDivisoes >= 3)
                    break;
            }

            if(numDivisoes == 2)
                primos.add(numAtual);
        }


        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        System.out.println("Média: " + media);

        System.out.print("Primos: ");
        for(int i = 0; i < primos.size(); i++)
            System.out.print(primos.get(i) + " ");
    }
}