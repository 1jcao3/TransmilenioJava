package Modelo;

public class MapaEstaciones {

    String Libertadores = "L";
    String CocaCola = "C";
    String Postobon = "P";
    String Boyaca = "B";
    String Cementerio = "E";
    String Plaza = "Z";
    String Salesiano = "S";
    String RutaMundial = "R";
    String Culturama = "U";
    String Innovo = "I";
    
    

    public String[][] mapaEstaciones() {

        String Mapa[][] = new String[10][10];
for(int i = 0; i <10;i++){
    for(int j= 0 ; j <10; j++){
        Mapa[i][j] = "*";
        Mapa[5][4] = Libertadores;
        Mapa[7][8] = CocaCola;
        Mapa[8][0] = Postobon;
        Mapa[0][0] = Boyaca;
        Mapa[3][2] = Cementerio ;
        Mapa[7][2] = Plaza ;
        Mapa[2][5] = Salesiano ;
        Mapa[0][9] = RutaMundial ;
        Mapa[5][7] = Culturama ;
        Mapa[3][6] = Innovo ;
    }
}

        return Mapa;
    }
}
