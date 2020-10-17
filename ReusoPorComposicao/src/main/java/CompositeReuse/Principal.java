/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeReuse;

/**
 *
 * @author Douglas
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Funcionario g1 = new Gerente("Douglas", 1000);
        g1.setSalarioComBonus(g1.calculaBonus());;
        
        System.out.println(g1.getSalarioComBonus());
        
    }
    
}
