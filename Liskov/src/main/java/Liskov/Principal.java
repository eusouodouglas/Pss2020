/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Liskov;

/**
 *
 * @author Douglas
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
        Ave ave = new Passaro();
        ave.voar();
        
        //Pinguim não pode voar, logo nao faz sentido criar um método voar em sua respectiva classe
    }
    
}
