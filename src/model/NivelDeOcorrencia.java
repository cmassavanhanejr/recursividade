package  model;

/**
 *
 * @author Arley Bebe
 */
public class NivelDeOcorrencia {

    public static int calcular(int n,int k,int i){
    
        if(n%10==k){
            
            i++;
        }
        if(n%10==n){
        
            return i;
        }
        return calcular(n/10,k,i);
    }
    
    
    public static void main(String[] args) {
        System.out.println(calcular(112223346,2,0));
    }
    
}
