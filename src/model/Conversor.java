package  model;
/**
 *
 * @author Arley Bebe
 */
public class Conversor {


    public static void decimalBinario(int n){
    
        if(n>0){
            
            decimalBinario(n/2);
            System.out.print(n%2);
        
        }
    
    }
    
    public static void main(String[] args) {
        
        decimalBinario(2);
    }
    
}
