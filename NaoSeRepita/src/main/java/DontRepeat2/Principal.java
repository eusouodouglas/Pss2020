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
public class Principal {

    public static void main(String[] args) {

        Pessoa a = new Jogador("Douglas", 25, "Jogador", "atacante");
        Pessoa b = new Professor("Maria", 25, "Professora de matematica", 120);

        /* 
        Todos os tipos de pessoa tem atributos diferentes entre si, porém ainda assim possuem 
        atributos em comum. E este código mostra como não precisa repetir o código dos atributos em comum
        escrevendo-as em todos as classes de pessoa. Evitando assim, o duplicamento de código.
         */
    }

}
