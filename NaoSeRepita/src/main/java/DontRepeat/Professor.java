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
public class Professor  {
    
   private String nome;
    private String profissao;
    private int idade;
    private int cargaHoraria;

    public Professor(String nome, int idade, String profissao,int cargaHoraria) {

        this.idade = idade;
        this.nome = nome;
        this.profissao = profissao;
        this.cargaHoraria = cargaHoraria;

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
}
