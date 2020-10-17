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
public class Jogador extends Pessoa {

    private String posicao;

    public Jogador(String nome, int idade, String profissao, String posicao) {

        super(nome, idade, profissao);
        this.posicao = posicao;

    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    

}
