/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionPrinciple;

/**
 *
 * @author Douglas
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Tv c1 = new Tv();
        Botao b1 = new Botao(c1);
        
        b1.acionar();
        b1.acionar();
       
        
        
        
      
        
    }
    
}
