/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  model;

/**
 *
 * @author Arley Bebe
 */
public class SomaAlgarismos {

   
    public static int somaAlgarismos(int numero, int soma){
        
        if(numero<1){
            return soma;
        }
        soma+=(numero%10);
        return somaAlgarismos(numero/10,soma);
        
    }    
    
    public static void main(String[] args) {
        
        System.out.println(somaAlgarismos(1111, 0));
    }
    
}
