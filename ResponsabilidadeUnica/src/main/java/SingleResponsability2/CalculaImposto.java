/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleResponsability2;

/**
 *
 * @author Douglas
 */
public class CalculaImposto {
    
    public double impostoLocal = 0.20;
    
    public CalculaImposto(Produto p1){
        
        p1.setPreco(p1.preco + (p1.preco * impostoLocal));
        
    }
    
}
