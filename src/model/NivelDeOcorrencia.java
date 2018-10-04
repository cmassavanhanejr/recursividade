package  model;

/**
 * Classe que contem um metodo para verificar o nivel de ocorencia de um algarismo num numero
 * @author Arley Bebe
 */
public class NivelDeOcorrencia {

    /**
    *Metodo para achar de forma recursiva o numero de vezes que um algarismo ocore em um determinado numero
    *@param n - numero em causa
    *@param k - algarismo que queremos verificar ocorencia
    *@param i - armazena o numero de vezes da ocorencia
    */
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
