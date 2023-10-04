
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutmovil(String modelo, String marca, String motor, 
            String color, String placa, int numPuertas) {
        
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setNumPuertas(numPuertas);
        
        controlPersis.agregarAutomovil(auto);
        
    }
    
    
    
}
