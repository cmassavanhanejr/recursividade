package model;
/**
 * Essa eh uma classe que calcula o factorial de um numero usando a recursividade
 * @author Arley Bebe
 */
public class Factorial {
    
    /**
    * esse eh um metodo que estado que recebe um numero e calcula o seu factorial
    * @param recursividade
    */
    public static int factorial(int numero){
        //verifica o caso base 
        if(numero==1){
            return 1;
        }
        //caso o baso ainda nao seja verdadeiro ele continua a fazer a multiplicação de forma empilhada
        else{
            return numero*factorial(numero-1);
        }
        
    }
    
    public static void main(String[] args) {
        //chama o metodo para calcular factorial e imprime na tela o seu factorial
        System.out.println(factorial(5));
    }
}
