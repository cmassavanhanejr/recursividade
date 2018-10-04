/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  model;

import java.util.Vector;

/**
 * Classe que possui metodo recursivo para calcular a soma de numeros em um vector
 * @author Arley Bebe
 */
public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(7);
        v.add(10);
        
        System.out.println(soma(v,0));
        
    
    }
    
    /**
    * Metodo que realiza a soma de numeros em vector
     * @param v- vector
     * @param i - indice a ser usado. sera sempre inicialido com 0
     */
    public static int soma(Vector<Integer> v, int i){
        //verifica se o indice actual e igual ao tamanho do vector
        if(i==v.size()){
            return 0;
        }
        //chama novamente ele mesmo adicionando o o numero na posicao i
        return v.get(i)+soma(v,i+1);
    }
    
}
