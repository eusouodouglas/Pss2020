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
public class Gerente extends Funcionario{
    
   
    
    
    public Gerente(String nome, double salario){
        super(nome, salario);
        
    }
    
    @Override
    public double calculaBonus(){
        return  this.salario + (salario*0.20);
    }
    
}
