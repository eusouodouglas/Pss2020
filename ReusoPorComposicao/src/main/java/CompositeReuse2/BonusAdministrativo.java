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
public class BonusAdministrativo implements CalculoBonus {

    @Override
    public void calculaBonus(Funcionario funcionario) {
        
        double valor = funcionario.getSalario() * 1.18;
        funcionario.setSalarioComBonus(valor);
      
    }
    
}
