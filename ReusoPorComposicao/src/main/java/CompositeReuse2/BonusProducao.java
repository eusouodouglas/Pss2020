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
public class BonusProducao implements CalculoBonus {
    
    @Override
    public void calculaBonus(Funcionario funcionario) {
        
         double valor = funcionario.getSalario() * 1.05;
        funcionario.setSalarioComBonus(valor);
      
    }
    
}
