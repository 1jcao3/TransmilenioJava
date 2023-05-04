
package Modelo;


public class Pago {
    int pago ;
int CostoNormal= 2000;
int CostoFacil= 1500;
    public int getPago(int pago) {
        return pago;
    }
    public int darVuletas(int pago,int sel){
    int Vueltas= 0 ;
        if (sel==0){
            Vueltas= pago-CostoFacil;
    
    }else{
        Vueltas=pago-CostoNormal;
        }
    return Vueltas;
    }
    
    
}
