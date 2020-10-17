/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NaoSeRepita2;

/**
 *
 * @author Douglas
 */
public class LavaRapido {
    
    public LavaRapido(){
        
    }
    
    public void servicoCarro(){
        
        System.out.println("Limpando carro agora");
        servicosExtras();
    }
    
    public void servicoMoto(){
        
        System.out.println("Limpando moto agora");
        servicosExtras();
    }
    
    public void servicoBicicleta(){
        
        System.out.println("Limpando bicicleta agora");
        servicosExtras();
        
    }
    
    public void servicosExtras(){
        
        System.out.println("Reparando a pintura");
        System.out.println("Colocando na esteira");
        
    }
    
}
