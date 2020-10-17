/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleResponsibility;

/**
 *
 * @author Douglas
 */
public class Principal {
    
    public static void main(String[] args) {
        
        //Exemplo incorreto
        
        Produto produto1 = new Produto(5, "Veneno", 50);
        
        System.out.println(produto1.getPreco());
      
    }
    
}
