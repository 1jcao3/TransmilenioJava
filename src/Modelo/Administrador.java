
package Modelo;


public class Administrador {
    public String nuevoCosto(String Cnuevo){
    return "Costo Anterior: $1500\n"
            +"Costo Nuevo: $"+ Cnuevo;
    }
    public String nuevoCosto2(String Cnuevo1){
    return "Costo Anterior: $2000\n"
            +"Costo Nuevo: $"+ Cnuevo1;
    }
    public String desactivarRutas(int ruta){
       String RutaD=""; 
        switch(ruta){
            case 0:RutaD = "Ruta 1";
                break;
                case 1:
                    RutaD = "Ruta 2";
                break;
                case 2:
                    RutaD = "Ruta 3";
                break;
                case 3:
                    RutaD = "Ruta 4";
                break;
                case 4:
                    RutaD = "Ruta 5";
                break;
        
        }
    
    return "La Ruta Inhabilitada fue la "+RutaD;
    }
}
