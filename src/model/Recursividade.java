package model;

/**
 *
 * @author Arley Bebe
 */
public class Recursividade {

    public static void main(String[] args) {

        /*System.out.println(factorial(3));
        System.out.println(mdc(1250,4500));
        int a[]={2,4,6,8,10,22,23,50};
        System.out.println(buscar(4, a.length, a));
        System.out.println(fibo(4));   */
        System.out.println("");
    }
    
    public static int factorial(int numero){
    
        if(numero==1){
            return 1;
        }
        else{
            return numero*factorial(numero-1);
        }
        
    }
    
    public static int mdc(int a,int b){
        
        if(b==0){
            return a;
        }else{
           return mdc(b,a%b); 
        }
    }
    
    public static int buscar (int numero, int tamanho,int array[]) {
        
        if (tamanho == 0) return -1;
        if (numero == array[tamanho-1]) return tamanho-1;
        return buscar (numero, tamanho-1, array); 
    }
    
    public static int fibo(int n){
        
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
