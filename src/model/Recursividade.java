package model;

/**
 * Classe que contem algund metodos que calculam funcoes matematicas de forma recursiva
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
    
    /**
    *Metodo recursivo para calcular factorial de um numero
    *@param numero
    */
    public static int factorial(int numero){
    
        if(numero==1){
            return 1;
        }
        else{
            return numero*factorial(numero-1);
        }
        
    }
    
    /**
    *Metodo recursivo para calcular um maximo divisor comum
    *@param a - indica o primeiro numero
    *@param b - indica o segundo numero
    */
    public static int mdc(int a,int b){
        
        if(b==0){
            return a;
        }else{
           return mdc(b,a%b); 
        }
    }
    
    /**
    *Metodo recursivo para buscar a posicao de um numero num array
    *@param numero - o numero o qual pretendemos buscar a sua posicao
    *@param tamanho - tamanho do array
    *@param array[] - que é o array o qual nos queremos fazer a pesquisa.
    */
    public static int buscar (int numero, int tamanho,int array[]) {
        //verifica se o tamanho e igual a zero
        if (tamanho == 0) return -1; //se sim retorna -1 que signifca que o numero nao existe no array
        //verifica se o numero esta na posicao tamanho -1 do array
        if (numero == array[tamanho-1]) return tamanho-1; //retorna a posicao
        //chama novamente o metodo para fazer a busca.
        return buscar (numero, tamanho-1, array); 
    }
    
    /**
    *Metodo recusivo para calcular o numero da posicao n da serie de fibonacci;
    *@param n - posicao que queremos o numero
    */
    public static int fibo(int n){
        
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
