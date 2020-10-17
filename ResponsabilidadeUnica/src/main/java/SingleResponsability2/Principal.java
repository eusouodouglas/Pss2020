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
public class Principal {
    
    public static void main(String[] args) {
        
        //Exemplo correto
        
        Produto produto1 = new Produto(5, "Veneno", 100);
        CalculaImposto c1 = new CalculaImposto(produto1);
        
        System.out.println(produto1.getPreco());
      
    }
    
}
