/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeReuse2;

/**
 *
 * @author Douglas
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Funcionario g1 = new Funcionario("Douglas", 2000);
        BonusAdministrativo b1 = new BonusAdministrativo();
        b1.calculaBonus(g1);
        
        
        System.out.println(g1.getSalarioComBonus());
        
    }
    
}
