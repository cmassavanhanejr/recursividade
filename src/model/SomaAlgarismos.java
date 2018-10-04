/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  model;

/**
 * Classe que contem metodo para calcular a soma dos algarismos de um numero de forma recursiva
 * @author Arley Bebe
 */
public class SomaAlgarismos {

   /**
   * Metodo recursivo para calcular a soma dos algarismos de um numero
   *@param numero
   *@param soma - vai armazenando a soma
   */
    public static int somaAlgarismos(int numero, int soma){
        // Se o numero for menor que 1 ele retorna a soma
        if(numero<1){
            return soma;
        }
        //soma + algarismo do numero(encontrado a partir do resto da divisao)
        soma+=(numero%10);
       //chamada do propio metodo
        return somaAlgarismos(numero/10,soma);
        
    }    
    
    public static void main(String[] args) {
        
        System.out.println(somaAlgarismos(1111, 0));
    }
    
}
