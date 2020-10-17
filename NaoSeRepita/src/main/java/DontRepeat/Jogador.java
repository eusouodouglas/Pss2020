/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DontRepeat;

import DontRepeat2.*;

/**
 *
 * @author Douglas
 */
public class Jogador {

    private String nome;
    private String profissao;
    private int idade;
    private String posicao;

    public Jogador(String nome, int idade, String profissao, String posicao) {

        this.idade = idade;
        this.nome = nome;
        this.profissao = profissao;
        this.posicao = posicao;

    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    

}
