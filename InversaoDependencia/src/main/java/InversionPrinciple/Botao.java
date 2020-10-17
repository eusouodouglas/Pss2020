/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionPrinciple;

/**
 *
 * @author Douglas
 */
public class Botao {

    private Tv controle;
    private String estado = "desligado";

    public Botao(Tv controle) {
        this.controle = controle;

    }

    public void acionar() {

        if (this.estado == "desligado") {

            controle.ligar();
            this.estado = "ligado";
        } else {
            controle.desligar();
            this.estado = "desligado";

        }
    }



    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

}
