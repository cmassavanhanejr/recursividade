/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  model;

import java.util.Vector;

/**
 *
 * @author Arley Bebe
 */
public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(7);
        v.add(10);
        
        System.out.println(soma(v,0));
        
    
    }
    
    public static int soma(Vector<Integer> v, int n){
        if(n==v.size()){
            return 0;
        }
        return v.get(n)+soma(v,n+1);
    }
    
}
