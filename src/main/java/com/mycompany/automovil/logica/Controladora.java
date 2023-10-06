
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
        
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAutmovil(Automovil auto, String modelo, String marca, String motor, String color, String placa, int numPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setNumPuertas(numPuertas);
        
        controlPersis.modificarAutomovil(auto);
    }
    
    
    
}
