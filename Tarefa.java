import java.util.ArrayList;
import java.util.*;

public class Tarefa{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos nums quer armazenar: ");
        int quantidade = scan.nextInt();

        ListaNumeros listaNum = new ListaNumeros(quantidade);

        /*System.out.println("Digite 'N' quanto quiser parar.");
        while(true){
            try{
                int numero = scan.nextInt();
                listaNum.Adicionar(numero);
            }
            catch(Exception e){
                break;
            }
        }*/
        for(int i =0; i < quantidade; i++){
            double numero = scan.nextDouble();
            listaNum.Adicionar(numero);
        }

        double maximo = listaNum.Maximo();
        double minimo = listaNum.Minimo();
        double media = listaNum.Media();
        
        ArrayList<Integer> primos = new ArrayList();
        for(int i = 0; i < listaNum.tamanho; i++){
            int numDivisoes = 0;
            double numAtual = listaNum.Pegar(i);
            if(numAtual != (int)numAtual)
                continue;

            int numInt = (int)numAtual;
            for(int num = numInt; num > 0; num--){
                if(numInt % num == 0){
                    numDivisoes++;
                }

                if(numDivisoes >= 3)
                    break;
            }

            if(numDivisoes == 2)
                primos.add(numInt);
        }


        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        System.out.println("Média: " + media);
        
        System.out.print("Primos: ");
        for(int i = 0; i < primos.size(); i++)
           System.out.print(primos.get(i) + " , ");

        System.out.println("");
        System.out.print("Todos: ");
        for(int i = 0; i < listaNum.tamanho; i++)
            System.out.print(listaNum.Pegar(i) + " , ");

        //System.out.println("");
        //System.out.println("Qtd divisiveis por 2: " + listaNum.QtdDivisiveis2());
        //System.out.println("Qtd divisiveis por 3 e 5: " + listaNum.QtdDivisiveis3e5());
    }
}