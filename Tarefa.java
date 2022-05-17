import java.util.ArrayList;
import java.util.*;

public class Tarefa{
    public static void main(String args[]){
        ListaNumeros listaNum = new ListaNumeros();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 'N' quanto quiser parar.");
        while(true){
            try{
                int numero = scan.nextInt();
                listaNum.Adicionar(numero);
            }
            catch(Exception e){
                break;
            }
        }

        int maximo = listaNum.Maximo();
        int minimo = listaNum.Minimo();
        double media = listaNum.Media();
        
        ArrayList<Integer> primos = new ArrayList();
        for(int i = 0; i < listaNum.tamanho; i++){
            int numDivisoes = 0;
            int numAtual = listaNum.Pegar(i);
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