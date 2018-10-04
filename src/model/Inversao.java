package model;

/**
 *
 * @author Arley Bebe
 */
public class Inversao {

    
    public static int inverter(int n,int total){
        
        if(n==0){
            
            return total;
        
        }else{
            
            System.out.println("n/10 : "+n/10);
            System.out.println("10+n%10 : "+10+n%10);
            System.out.println("total*10+n%10 : "+total*10+n%10);
//            System.out.println("total : "+total);
            System.out.println();
            
            
            return inverter(n/10,total*10+n%10);
        
        }
    
    }
    
    
    public static void main(String[] args) {

        System.out.println(invert(123456,0));
    }
    
}
