package Modelo;

public class Rutas {

   
    
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

    public String[][] ruta1() {

        String rut1[][] = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==0&&j<=2||j==2&&i<=3||i==3&&j==4||i==3&&j==3||j==4&&i==4||i==5&&j==3||i==5&&j==2||i==6&&j==2||i==8&&j<=2){
                rut1[i][j] = "+";
                }else{
                rut1[i][j] = ".";
                }
                rut1[5][4] = Libertadores;
                rut1[7][8] = CocaCola;
                rut1[8][0] = Postobon;
                rut1[0][0] = Boyaca;
                rut1[3][2] = Cementerio;
                rut1[7][2] = Plaza;
                rut1[2][5] = Salesiano;
                rut1[0][9] = RutaMundial;
                rut1[5][7] = Culturama;
                rut1[3][6] = Innovo;
            }
        }

        return rut1;
    }
 public String[][] ruta2() {

        String Rut2[][] = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==0&&j<=2||j==2&&i<=3||i==2&&j==3||i==2&&j==4||j==6&&i==2||i==4&&j==6||i==5&&j==6||i==5&&j==8||i==6&&j==8){
                Rut2[i][j] = "+";
                }else{
                Rut2[i][j] = ".";
                }
                Rut2[5][4] = Libertadores;
                Rut2[7][8] = CocaCola;
                Rut2[8][0] = Postobon;
                Rut2[0][0] = Boyaca;
                Rut2[3][2] = Cementerio;
                Rut2[7][2] = Plaza;
                Rut2[2][5] = Salesiano;
                Rut2[0][9] = RutaMundial;
                Rut2[5][7] = Culturama;
                Rut2[3][6] = Innovo;
            }
            
        }

        return Rut2;
    }
 
  public String[][] ruta3() {

        String Rut3[][] = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==4&&j==4||j==4&&i==3||i==3&&j>=4||i<=2&&j==9){
                Rut3[i][j] = "+";
                }else{
                Rut3[i][j] = ".";
                }
                Rut3[5][4] = Libertadores;
                Rut3[7][8] = CocaCola;
                Rut3[8][0] = Postobon;
                Rut3[0][0] = Boyaca;
                Rut3[3][2] = Cementerio;
                Rut3[7][2] = Plaza;
                Rut3[2][5] = Salesiano;
                Rut3[0][9] = RutaMundial;
                Rut3[5][7] = Culturama;
                Rut3[3][6] = Innovo;
            }
            
        }

        return Rut3;
    }
 
   public String[][] ruta4() {

        String Rut4[][] = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i<=3&&j==9||j==8&&i==3||i==3&&j==7||i==4&&j==6||j==6&&i==5||i==5&&j==8||i==6&&j==8||i==8&&j<=8){
                Rut4[i][j] = "+";
                }else{
                Rut4[i][j] = ".";
                }
                Rut4[5][4] = Libertadores;
                Rut4[7][8] = CocaCola;
                Rut4[8][0] = Postobon;
                Rut4[0][0] = Boyaca;
                Rut4[3][2] = Cementerio;
                Rut4[7][2] = Plaza;
                Rut4[2][5] = Salesiano;
                Rut4[0][9] = RutaMundial;
                Rut4[5][7] = Culturama;
                Rut4[3][6] = Innovo;
            }
            
        }

        return Rut4;
    }
 
   public String[][] ruta5() {

        String Rut5[][] = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==0&&j<=2||j==2&&i<=6||i==7&&j>=3){
                Rut5[i][j] = "+";
                }else{
                Rut5[i][j] = ".";
                }
                Rut5[5][4] = Libertadores;
                Rut5[7][8] = CocaCola;
                Rut5[8][0] = Postobon;
                Rut5[0][0] = Boyaca;
                Rut5[3][2] = Cementerio;
                Rut5[7][2] = Plaza;
                Rut5[2][5] = Salesiano;
                Rut5[0][9] = RutaMundial;
                Rut5[5][7] = Culturama;
                Rut5[3][6] = Innovo;
                Rut5[7][9] = ".";
                Rut5[8][2] = ".";
                Rut5[9][2] = ".";
            }
            
        }

        return Rut5;
    }
 

 public String seleccionRuta(int pp,int ll){
     String Ruta = "";
     if(pp==0&&ll==9||pp==0&&ll==7||pp==9&&ll==0||pp==7&&ll==0){
         Ruta = "Le sirve unicamente la ruta 3";
     
     }else if(pp==7&&ll==9||pp==9&&ll==7){
     Ruta ="Le sirve la ruta 3 , y la ruta 4";
     
     }else if(pp==2&&ll==5||pp==2&&ll==0||pp==2&&ll==4||pp==2&&ll==3||pp==5&&ll==2||pp==5&&ll==0||pp==0&&ll==2||pp==0&&ll==5||pp==0&&ll==4||pp==0&&ll==3||pp==4&&ll==2||pp==4&&ll==0||pp==3&&ll==2||pp==3&&ll==0||pp==4&&ll==0){
     Ruta = "Le sirve unicamente la ruta 1";
     }
     else if(pp==5&&ll==4||pp==4&&ll==5||pp==4&&ll==3||pp==3&&ll==4||pp==5&&ll==3||pp==3&&ll==5){
     Ruta ="Le sirve la ruta 1 , y la ruta 5";
     
     }else if(pp==3&&ll==6||pp==3&&ll==9||pp==3&&ll==8||pp==3&&ll==1||pp==6&&ll==3||pp==6&&ll==9||pp==6&&ll==8||pp==6&&ll==1||pp==9&&ll==3||pp==9&&ll==6||pp==8&&ll==3||pp==8&&ll==6||pp==1&&ll==3||pp==1&&ll==6){
     Ruta = "Le sirve unicamente la ruta 2";
     }
     else if(pp==9&&ll==8||pp==8&&ll==9||pp==9&&ll==1||pp==1&&ll==9||pp==8&&ll==1||pp==1&&ll==8){
     Ruta ="Le sirve la ruta 2 , y la ruta 4";
     
     }
     else if(pp==2&&ll==1||pp==2&&ll==8||pp==2&&ll==9||pp==2&&ll==7||pp==1&&ll==2||pp==1&&ll==7||pp==8&&ll==2||pp==8&&ll==7||pp==9&&ll==2||pp==7&&ll==2||pp==7&&ll==9||pp==7&&ll==8||pp==7&&ll==1){
     Ruta = "Le sirve unicamente la ruta 4";
     }
     else if(pp==3&&ll==1||pp==4&&ll==1||pp==5&&ll==1||pp==1&&ll==5||pp==1&&ll==4||pp==1&&ll==3){
     Ruta = "Le sirve unicamente la ruta 5";
     }
     else if(pp==3&&ll==7){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion innovo, y alli tomar la ruta 3 o la ruta 4 ";
     }
     else if(pp==7&&ll==3){
     Ruta = "Para este destino debes tomar la ruta 3 o la ruta 4 hasta estacion innovo, y alli tomar la ruta 2 ";
     }
     else if(pp==6&&ll==7){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion innovo, y alli tomar la ruta 3 o la ruta 4  ";
     }
      else if(pp==7&&ll==6){
     Ruta = "Para este destino debes tomar la ruta 3 o la ruta 4 hasta estacion innovo, y alli tomar la ruta 2 ";
     }
     else if(pp==6&&ll==0){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion innovo, y alli tomar la ruta 3 ";
     }
      else if(pp==0&&ll==6){
     Ruta = "Para este destino debes tomar la ruta 3 hasta estacion innovo, y alli tomar la ruta 2 ";
     }
     else if(pp==6&&ll==4){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion Boyaca, y alli tomar la ruta 5 o la ruta 1 ";
     }
      else if(pp==4&&ll==6){
     Ruta = "Para este destino debes tomar la ruta 5 o la ruta 1 hasta estacion Boyaca, y alli tomar la ruta 2 ";
     }
     else if(pp==6&&ll==5){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion Boyaca, y alli tomar la ruta 5  ";
     }
      else if(pp==5&&ll==6){
     Ruta = "Para este destino debes tomar la ruta 5  hasta estacion Boyaca, y alli tomar la ruta 2 ";
     }
     else if(pp==6&&ll==2){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion Boyaca ,y alli tomar la ruta 1 ,o puedes tomar la ruta 2 hasta estacion Innovo, y alli tomar la ruta 4  ";
     }
      else if(pp==2&&ll==6){
     Ruta = "Para este destino debes tomar la ruta 1 hasta estacion Boyaca, y alli tomar la ruta 2 ,o puedes tomar la ruta 4 hasta estacion CocaCola, y alli tomar la ruta 2";
     }
      else if(pp==4&&ll==9||pp==4&&ll==7){
     Ruta = "Para este destino debes tomar la ruta 1 hasta estacion Libetadores, y alli tomar la ruta 3  ";
     }
     else if(pp==9&&ll==4||pp==7&&ll==4){
     Ruta = "Para este destino debes tomar la ruta 3 hasta estacion Libertadores, y alli tomar la ruta 1 ";
     }
     else if(pp==4&&ll==8||pp==4&&ll==1){
     Ruta = "Para este destino debes tomar la ruta 5 o la ruta 1  hasta estacion Boyaca, y alli tomar la ruta 2  ";
     }
     else if(pp==8&&ll==4||pp==1&&ll==4){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion Boyaca, y alli tomar la ruta 1 o la ruta 5 ";
     }
     else if(pp==0&&ll==8||pp==0&&ll==1){
     Ruta = "Para este destino debes tomar la ruta 3  hasta estacion Innovo, y alli tomar la ruta 2  ";
     }
     else if(pp==8&&ll==0||pp==1&&ll==0){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion Innovo, y alli tomar la ruta 3 ";
     
     }
      else if(pp==5&&ll==8||pp==5&&ll==9){
     Ruta = "Para este destino debes tomar la ruta 5  hasta estacion CocaCola, y alli tomar la ruta 2  ";
     }
     else if(pp==8&&ll==5||pp==9&&ll==5){
     Ruta = "Para este destino debes tomar la ruta 2 hasta estacion CocaCola, y alli tomar la ruta 5 ";
     
     }
      else if(pp==5&&ll==7){
     Ruta = "Para este destino debes tomar la ruta 1  hasta estacion Libertadores, y alli tomar la ruta 3  ";
     }
     else if(pp==7&&ll==5){
     Ruta = "Para este destino debes tomar la ruta 3 hasta estacion Libetadores, y alli tomar la ruta 1 ";
     
     }
     else if(pp==ll){
     Ruta = "Estas en el mismo lugar al que pretendes ir";
     }
     
     
     
 return Ruta;
 }

}
