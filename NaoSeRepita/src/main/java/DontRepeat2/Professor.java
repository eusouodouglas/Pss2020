/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DontRepeat2;

/**
 *
 * @author Douglas
 */
public class Professor extends Pessoa {
    
    private int cargaHoraria;
    
     public Professor(String nome, int idade, String profissao, int cargaHoraria) {

        super(nome, idade, profissao);
        this.cargaHoraria = cargaHoraria;

    }
    
}
