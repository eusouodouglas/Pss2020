/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionPrinciple2;

/**
 *
 * @author Douglas
 */
public class Botao {

    IDispositivo dispositivo;

    public Botao(IDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligar() {
        dispositivo.acionar();
    }

    public void desligar() {
        dispositivo.acionar();
    }

}
