/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosed;

/**
 *
 * @author Douglas
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Eletronico E1 = new Eletronico("tv");
        ServicoConserto S1 = new ServicoConserto(E1);
        S1.consertarEletronico(E1);
        
        
        
        
    }
    
}
