package transmilenio;

import Modelo.Administrador;
import Modelo.MapaEstaciones;
import Modelo.Pago;
import Modelo.Rutas;
import Modelo.Ticket;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Transmilenio {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        Rutas r = new Rutas();
        MapaEstaciones map = new MapaEstaciones();
        Pago p = new Pago();
        Ticket t = new Ticket();
        Administrador a = new Administrador ();

        JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA TRANSMILENIO", "TRANSMILENIO", 1);

        String[] OpUsuario = {"Usuario", "Administrador"};
        int ventana = JOptionPane.showOptionDialog(null, "¿Quien esta ingresando?", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, OpUsuario, OpUsuario[0]);

        if (ventana == 0) {
            JOptionPane.showMessageDialog(null, "A CONTINUACION SE LE MOSTRARA EL MAPA DE LAS ESTACIONES", "TRANSMILENIO", 2);
            String Mapas[][] = map.mapaEstaciones();
            System.out.println("Estaciones Duitama");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(Mapas[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("1. Libertadores = L");
            System.out.println("2. CocaCola = C");
            System.out.println("3. Postobon = P");
            System.out.println("4. Boyaca = B");
            System.out.println("5. Cementerio = E");
            System.out.println("6. Plaza = Z");
            System.out.println("7. Salesiano = S");
            System.out.println("8. RutaMundial = R");
            System.out.println("9. Culturama = U");
            System.out.println("10. Innovo = I");

            System.out.println("");

            System.out.println("Pulse enter para continuar");
            String Pass = Sc.nextLine();

            int Confirm = JOptionPane.showConfirmDialog(null, "¿Desea ver las rutas previamente?", "TRANSMILENIO", JOptionPane.YES_NO_OPTION, 3);

            if (Confirm == 0) {
                int Confirm2 = 0;
                do {
                    String[] Rutas = {"Ruta 1 (Divertida)", "Ruta 2 (Especial)", "Ruta 3 (Feliz)", "Ruta 4 (Homogenea)", "Ruta 5 (Heterogenea)"};
                    int SelRuta = JOptionPane.showOptionDialog(null, "Elija una ruta(Tenga en cuenta que cada ruta esta disponible tanto de ida como de vuelta)", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Rutas, Rutas[0]);
                    switch (SelRuta) {
                        case 0:
                            System.out.println("Ruta 1 Divertida");
                            String ruta1[][] = r.ruta1();
                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(ruta1[i][j] + " ");
                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 1:
                            System.out.println("Ruta 2 Especial");
                            String Ruta2[][] = r.ruta2();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta2[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 2:
                            System.out.println("Ruta 3 Feliz");
                            String Ruta3[][] = r.ruta3();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta3[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 3:
                            System.out.println("Ruta 4 Homogenea");
                            String Ruta4[][] = r.ruta4();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta4[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 4:
                            System.out.println("Ruta 5 Heterogenea");
                            String Ruta5[][] = r.ruta5();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta5[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;
                    }
                    Confirm2 = JOptionPane.showConfirmDialog(null, "¿Desea consultar otra ruta?", "TRANSMILENIO", JOptionPane.YES_NO_OPTION, 3);
                    if (Confirm2 == -1) {
                        System.exit(0);
                    }
                } while (Confirm2 == 0);
            } else if (Confirm == -1) {
                System.exit(0);
            }
            String[] OpViajar = {"VIAJAR", "Salir"};
            int Viaje = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, OpViajar, OpViajar[0]);
            if (Viaje == 0) {
                String[] Ppartida = {"1. Libertadores", "2. CocaCola", "3. Postobon", "4. Boyaca", "5. Cementerio", "6. Plaza", "7. Salesiano", "8. RutaMundial", "9. Culturama", "10. Innovo"};
                int PunPartida = JOptionPane.showOptionDialog(null, "¿En que estacion se encuentra usted en este momento?", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Ppartida, Ppartida[0]);
                String[] Plegada = {"1. Libertadores", "2. CocaCola", "3. Postobon", "4. Boyaca", "5. Cementerio", "6. Plaza", "7. Salesiano", "8. RutaMundial", "9. Culturama", "10. Innovo"};
                int PunLlegada = JOptionPane.showOptionDialog(null, "¿Hacia que punto se dirige?", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Ppartida, Ppartida[0]);

                JOptionPane.showMessageDialog(null, r.seleccionRuta(PunPartida, PunLlegada), "TRANSMILENIO", 1);

                String[] Rutas = {"Ruta 1 (Divertida)", "Ruta 2 (Especial)", "Ruta 3 (Feliz)", "Ruta 4 (Homogenea)", "Ruta 5 (Heterogenea)"};
                int SelRuta2 = JOptionPane.showOptionDialog(null, "A continuacion elija la ruta que tomara", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Rutas, Rutas[0]);

                int Confirm2 = JOptionPane.showConfirmDialog(null, "¿Desea tomar ruta facil? (NO PODRA BAJARSE EN LAS DEMAS ESTACIONES)", "TRANSMILENIO", JOptionPane.YES_NO_OPTION, 2);

                int Confirm3 = JOptionPane.showConfirmDialog(null, "¿Desea visualizar su ruta? ", "TRANSMILENIO", JOptionPane.YES_NO_OPTION, 3);
                if (Confirm3 == 0) {

                    switch (SelRuta2) {
                        case 0:
                            System.out.println("Ruta 1 Divertida");
                            String ruta1[][] = r.ruta1();
                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(ruta1[i][j] + " ");
                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 1:
                            System.out.println("Ruta 2 Especial");
                            String Ruta2[][] = r.ruta2();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta2[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 2:
                            System.out.println("Ruta 3 Feliz");
                            String Ruta3[][] = r.ruta3();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta3[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 3:
                            System.out.println("Ruta 4 Homogenea");
                            String Ruta4[][] = r.ruta4();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta4[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 4:
                            System.out.println("Ruta 5 Heterogenea");
                            String Ruta5[][] = r.ruta5();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta5[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;
                    }

                } else if (Confirm3 == -1) {
                    System.exit(0);

                }
                if (Confirm2 == 0) {
                    JOptionPane.showMessageDialog(null, "El costo de su pasaje es de $1500 ", "TRANSMILENIO", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "El costo de su pasaje es de $2000 ", "TRANSMILENIO", 1);
                }

      int Vingresado = 1;   
      int cam = 1;
try{
       Vingresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su Dinero Por favor", "TRANSMILENIO", 1));
}catch(NumberFormatException ex){
    
    String Vingresadoo = Integer.toString(Vingresado);
    JOptionPane.showMessageDialog(null, "Excepcion presentada "+ex.getMessage()+"(debe dijitar un entero)", "TRANSMILENIO", 0);
    cam =0;
}
finally{
JOptionPane.showMessageDialog(null, "(Esto se ejecutara siempre)", "Alerta excepcion", 2);

}
if(cam==0 ){
    System.exit(0);
}

                if (Vingresado < 1500) {
                    JOptionPane.showMessageDialog(null, "Ingreso un valor inferior al costo de su pasaje (Ingrese Nuevamente) ", "TRANSMILENIO", 0);
                    System.exit(0);

                }
                p.getPago(Vingresado);
                p.darVuletas(Vingresado, Confirm2);
                String Vueltas = "$" + Integer.toString(p.darVuletas(Vingresado, Confirm2));
                JOptionPane.showMessageDialog(null, "Sus vueltas son " + Vueltas, "TRANSMILENIO", 2);

                JOptionPane.showMessageDialog(null, "A continuacion se imprimira su tickete ", "TRANSMILENIO", 2);
                String Name = JOptionPane.showInputDialog(null, "Ingrese su Nombre por favor", "TRANSMILENIO", 3);
                String id = JOptionPane.showInputDialog(null, "Ingrese su id por favor", "TRANSMILENIO", 3);
                String partida = t.getPuntoPartida(PunPartida);
                String Ruta = t.getRuta(SelRuta2);
                String Valor = t.getValor(Confirm2);
                String PIngresado = "$" + Integer.toString(Vingresado);

                t.imprimirTicket(Name, id, partida, Ruta, Valor, PIngresado, Vueltas);

                JOptionPane.showMessageDialog(null, t.imprimirTicket(Name, id, partida, Ruta, Valor, PIngresado, Vueltas), "TRANSMILENIO", 1);

            }
        } else if (ventana == -1) {
            System.exit(0);

        } else if (ventana == 1) {

            JOptionPane.showMessageDialog(null, "BIENVENIDO ADMINISTRADOR ", "TRANSMILENIO", 1);

            String NameUserr = JOptionPane.showInputDialog(null, "Ingrese su Nombre de usuario por favor \n" + "Pista: uptc", "TRANSMILENIO", 1);
            if (NameUserr.equals("uptc")){
              
            
                    int Admi = 0;
do{
                    String[] Aop = {"Mostrar estaciones", "Mostrar Rutas", "Modificar costo", "Desactivar rutas","salir"};
                     Admi = JOptionPane.showOptionDialog(null, "¿Que accion desea realizar?", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Aop, Aop[0]);
                    switch (Admi) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "A CONTINUACION SE LE MOSTRARA EL MAPA DE LAS ESTACIONES", "TRANSMILENIO", 2);
                            String Mapas[][] = map.mapaEstaciones();
                            System.out.println("Estaciones Duitama");
                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Mapas[i][j] + " ");
                                }
                                System.out.println("");
                            }
                            System.out.println("");
                            System.out.println("1. Libertadores = L");
                            System.out.println("2. CocaCola = C");
                            System.out.println("3. Postobon = P");
                            System.out.println("4. Boyaca = B");
                            System.out.println("5. Cementerio = E");
                            System.out.println("6. Plaza = Z");
                            System.out.println("7. Salesiano = S");
                            System.out.println("8. RutaMundial = R");
                            System.out.println("9. Culturama = U");
                            System.out.println("10. Innovo = I");

                            System.out.println("");

                            System.out.println("pulse enter para continuar");

                            break;

                        case 1:
                             int ccc = 0;
                do {
                    String[] Rutas = {"Ruta 1 (Divertida)", "Ruta 2 (Especial)", "Ruta 3 (Feliz)", "Ruta 4 (Homogenea)", "Ruta 5 (Heterogenea)"};
                    int SelRuta = JOptionPane.showOptionDialog(null, "Elija una ruta", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Rutas, Rutas[0]);
                    switch (SelRuta) {
                        case 0:
                            System.out.println("Ruta 1 Divertida");
                            String ruta1[][] = r.ruta1();
                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(ruta1[i][j] + " ");
                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 1:
                            System.out.println("Ruta 2 Especial");
                            String Ruta2[][] = r.ruta2();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta2[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 2:
                            System.out.println("Ruta 3 Feliz");
                            String Ruta3[][] = r.ruta3();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta3[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 3:
                            System.out.println("Ruta 4 Homogenea");
                            String Ruta4[][] = r.ruta4();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta4[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;

                        case 4:
                            System.out.println("Ruta 5 Heterogenea");
                            String Ruta5[][] = r.ruta5();

                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    System.out.print(Ruta5[i][j] + " ");

                                }
                                System.out.println("");
                            }
                            System.out.println("Pulse enter para continuar");
                            Sc.nextLine();
                            break;
                    }
                    ccc = JOptionPane.showConfirmDialog(null, "¿Desea consultar otra ruta?", "TRANSMILENIO", JOptionPane.YES_NO_OPTION, 3);
                    if (ccc == -1) {
                        System.exit(0);
                    }
                } while (ccc == 0);
           
                            
                            break;

                        case 2:
                            String[] Cos = {"Ruta Facil","Ruta Normal"};
                    int Coss = JOptionPane.showOptionDialog(null, "Elija el costo de una ruta", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Cos, Cos[0]);
                            if(Coss==0){
                            JOptionPane.showMessageDialog(null, "El costo actual de esta ruta es de $1500 ", "TRANSMILENIO", 1);
                            String NewCost = JOptionPane.showInputDialog(null, "Seleccione el nuevo valor", "TRANSMILENIO", 1);
                            
                            
                            a.nuevoCosto( NewCost);
                            JOptionPane.showMessageDialog(null, a.nuevoCosto(NewCost), "TRANSMILENIO", 1);
                            }else{
                                JOptionPane.showMessageDialog(null, "El costo actual de esta es de $2000 ", "TRANSMILENIO", 1);
                            String NewCost1 = JOptionPane.showInputDialog(null, "Seleccione el nuevo valor", "TRANSMILENIO", 1);
                            
                            
                            a.nuevoCosto2( NewCost1);
                            JOptionPane.showMessageDialog(null, a.nuevoCosto2(NewCost1), "TRANSMILENIO", 1);
                            
                            }
                            break;

                        case 3:
                             String[] Dr = {"Ruta 1","Ruta 2","Ruta 3","Ruta 4","Ruta 5"};
                    int Drr = JOptionPane.showOptionDialog(null, "Elija la ruta que desea desactivar", "TRANSMILENIO", JOptionPane.DEFAULT_OPTION, 3, null, Dr, Dr[0]);
                            a.desactivarRutas(Drr);
                            JOptionPane.showMessageDialog(null, a.desactivarRutas(Drr), "TRANSMILENIO", 1);
                            break;

                    }
}while(Admi != 4);  
                
            
            }else 
            {

                JOptionPane.showMessageDialog(null, "Nombre de usuario Incorrecto (ingrese nuevamente) ", "TRANSMILENIO", 0);
                System.exit(0);
            }
        }
    
    }

}