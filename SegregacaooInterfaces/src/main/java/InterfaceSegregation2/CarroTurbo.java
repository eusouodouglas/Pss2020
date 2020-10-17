/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceSegregation2;

/**
 *
 * @author Douglas
 */
public class CarroTurbo implements IFormulaUm, ICarroCorridaTurbo{

    @Override
    public void partida() {
        System.out.println("Estou dando a partida");
    }

    @Override
    public void acelerar() {
        
        System.out.println("Estou acelerando!");
      
    }

    @Override
    public void turbo() {
            
            System.out.println("Estou dando turbo e aumentando a velocidade");
       
    }
    
}
