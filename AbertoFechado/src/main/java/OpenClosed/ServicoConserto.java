/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosed;

/**
 *
 * @author Douglas
 */
class ServicoConserto {
    
    public Eletronico e;

    public ServicoConserto(Eletronico e) {
        
        this.e = e;

    }

    public void consertarEletronico(Eletronico e) {

        if (e.tipo == "celular") {
            repararCelular(e);
        } else if (e.tipo == "tv") {
            repararTv(e);
        } else if (e.tipo == "geladeira") {
            repararGeladeira(e);
        }
    }

    public void repararCelular(Eletronico e) {
        
        System.out.println("celular consertado!");

    }

    public void repararTv(Eletronico e) {
        
        System.out.println("tv consertada!");

    }

    public void repararGeladeira(Eletronico e) {
        
        System.out.println("geladeira consertada!");

    }
}

