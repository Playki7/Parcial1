
package Modelo;


public class Cuenta {
    
    private int noCuenta;
    private double saldoinicial;

    public Cuenta(int noCuenta, double saldoinicial) {
        this.noCuenta = noCuenta;

        this.saldoinicial = saldoinicial;
    }

   

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }
    
    public void ingresarDinero(double cantidad){
        saldoinicial += cantidad;
        
    }
    
    public void retirarDinero(double cantidad){
        saldoinicial -= cantidad;
    }
    
    
}
