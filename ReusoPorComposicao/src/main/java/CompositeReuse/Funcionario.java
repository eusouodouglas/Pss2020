/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeReuse;

/**
 *
 * @author Douglas
 */
public class Funcionario {
    
    public String nome;
    public double salario;
    public double salarioComBonus;
  
    
    
    public Funcionario(String nome, double salario){
    
        this.nome = nome;
        this.salario = salario;
       
    }
    
    public double calculaBonus(){
        
        return this.salarioComBonus = this.salario + (salario*0.10);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioComBonus() {
        return salarioComBonus;
    }

    public void setSalarioComBonus(double salarioComBonus) {
        this.salarioComBonus = salarioComBonus;
    }


    
    
}
