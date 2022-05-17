import java.util.ArrayList;
import java.util.*;

public class ListaNumeros{
    public int tamanho = 0;
    public int[] lista = new int[99999];

    public void Adicionar(int numero){
        this.lista[tamanho] = numero;
        this.tamanho++;
    }

    public int Pegar(int posicao){
        return this.lista[posicao];
    }

    public int Maximo(){
        int maximo = 0;
        for(int i=0; i<tamanho; i++){
            if(i == 0)
                maximo = lista[i];

            if(lista[i] > maximo)
                maximo = lista[i];
        }

        return maximo;
    }

    public int Minimo(){
        int minimo = 0;
        for(int i=0; i<tamanho; i++){
            if(i == 0)
                minimo = lista[i];

            if(lista[i] < minimo)
                minimo = lista[i];
        }

        return minimo;
    }

    public double Media(){
        double soma = 0;
        for(int i = 0; i < this.tamanho; i++)
            soma += lista[i];

        double media = (double)soma / this.tamanho; 

        return media;
    }

    public int QtdDivisiveis2(){
        int qtd = 0;
        for(int i=0; i<tamanho; i++){
            if(lista[i] % 2 == 0)
                qtd++;
        }

        return qtd;
    }

    public int QtdDivisiveis3e5(){
        int qtd = 0;
        for(int i=0; i<tamanho; i++){
            if(lista[i] % 3 == 0 && lista[i] % 5 == 0)
                qtd++;
        }

        return qtd;
    }
}