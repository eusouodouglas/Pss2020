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
public class CarroCorrida1Divisao implements IFormulaUm {

    @Override
    public void partida() {
        System.out.println("Estou ligando o motor");
    }

    @Override
    public void acelerar() {
        
        System.out.println("Estou acelerando");
        
    }

    @Override
    public void turbo() {
       
    }

}
