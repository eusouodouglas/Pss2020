/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package SingleResponsibility;

/**
 *
 * @author Douglas
 */
public class Produto {

    public int codigo;
    public String nome;
    public double preco;

    public double impostoLocal = 0.21;

    public Produto(int codigo, String nome, double preco) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;

        calculaImposto();

    }

    public void calculaImposto() {

        this.preco = preco + (preco * this.impostoLocal);

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImpostoLocal() {
        return impostoLocal;
    }

    
    

}
