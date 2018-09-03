package  model;
/**
 *
 * @author Arley Bebe
 */
public class Multiplicacao {

    public static int multiplicacao(int n1,int n2){
        
        if(n2==0){
            return 0;
        }
        
        if(n2>0){
            
            return n1+multiplicacao(n1,n2-1);
        }else{
            return -n1+multiplicacao(n1,n2+1);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(multiplicacao(-5, 5));
    }
    
}
