/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceSegregation;

/**
 *
 * @author Douglas
 */
public class Principal {
    
    public static void main(String[] args) {
        
        IFormulaUm f1 = new CarroCorrida1Divisao();
        f1.partida();
        f1.acelerar();
        
        //Não é chamado o método "turbo" porque carro de fórmula 1 da 1ª divisão não tem turbo
        
        
        
    }
    
}
