
package Modelo;


public class Ticket {
    
    public String getPuntoPartida(int PunPartida){
        String partida = "";
        switch(PunPartida){
                    case 0 :
                         partida = "Estacion Libertadores";
                        break;
                        case 1 :
                             partida = "Estacion CocaCola";
                        break;
                        case 2 :
                            partida = "Estacion Postobon";
                        break;
                        case 3 :
                            partida = "Estacion Boyaca";
                        break;
                        case 4 :
                            partida = "Estacion Cementerio";
                        break;
                        case 5 :
                            partida = "Estacion Plaza";
                        break;
                        case 6 :
                            partida = "Estacion Salesiano";
                        break;
                        case 7 :
                            partida = "Estacion RutaMundual";
                        break;
                case 8 :
                    partida = "Estacion Culturama";
                        break;
                        case 9 :
                            partida = "Estacion Innovo";
                        break;
                }
    return partida;
    }
    public String getRuta(int ruta){
        String Ruta= "";
         switch(ruta){
                
                    case 0 :
                        Ruta= "Ruta 1 Divertida";
                        
                        break;
                        case 1 :
                        Ruta= "Ruta 2 Especial";
                        break;
                        case 2 :
                        Ruta= "Ruta 3 Feliz";
                        break;
                        case 3 :
                        Ruta= "Ruta 4 Homogenea";
                        break;
                        case 4 :
                        Ruta= "Ruta 5 Heterogenea";
                        break;
                
                }
    return Ruta;
    }
    public String getValor(int Valor){
    String valor ="";
    if (Valor==0){
        valor = "$1500";
    
    }else{
    valor ="$2000";
    }
        return valor;
    }
    
    public String imprimirTicket(String Nombre,String id,String origen,String ruta,String valor,String pago,String vueltas){
    
        return "TRANSMILENIO \n"
                +"Usuario: "+Nombre+"\n"
                +"Id: "+ id+"\n"
                +"Estacion Origen: "+ origen+"\n"
                +"Ruta Seleccionada: "+ ruta+"\n"
                +"Valor del pasaje: "+ valor+"\n"
                + "Ingreso: "+ pago+"\n"
                +"Devolvio: "+ vueltas+"\n"
                + "GRACIAS POR USAR EL SERVICIO- RECUERDE QUE LO ATENDIO: MAQUINA VIRTUAL JULIAN AYALA";
    }
}
