/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosed2;

/**
 *
 * @author Douglas
 */
public class ServicoConserto {

public ServicoConserto(Eletronico e){
    
    consertarEletronico(e);
}    
    public void consertarEletronico(Eletronico e){
        e.consertar();
    }
    
}
