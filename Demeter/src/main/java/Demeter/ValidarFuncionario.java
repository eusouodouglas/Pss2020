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
public class ValidarFuncionario {
    
     public static void main(String args[]) {
        Funcionario func = new Funcionario();
        func.setNome("Douglas Alves");

        Email email = new Email();
        email.setEmailPrimario("douglas.alves@gmail.com");

        NumeroContato numero = new NumeroContato();
        numero.setCelular(99559230);

        func.setEmail(email);
        func.setNumeroContato(numero);

        boolean eFuncionarioValido = eFuncionarioValido(func);
        System.out.println("É um funcionário válido : " + eFuncionarioValido);
    }

    private static boolean eFuncionarioValido(Funcionario func) {
        // Notice method chaining
        String emailPrimario = func.getEmail().getEmailPrimario();
        // Notice method chaining
        long celular = func.getNumeroContato().getCelular();

        // some good conditions
        if (emailPrimario != null && celular != 0) {
            return true;
        }
        return false;
    }
    
}
