/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demeter;

/**
 *
 * @author Douglas
 */
public class Funcionario {
    
    private String nome;
    private Email email;
    private NumeroContato numeroContato;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public NumeroContato getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(NumeroContato numeroContato) {
        this.numeroContato = numeroContato;
    }

   
}
