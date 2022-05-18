
package Modelo;



public class Usuario {
    private String CC;
    private String Nombre;
    private String Apellido;
    private char sexo;
    Cuenta cuentas[];

    public Usuario(String CC, String Nombre, String Apellido, char sexo) {
        this.CC = CC;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.sexo = sexo;
    }

    Usuario(String CC, String nombre, String apellido, String sexo, Cuenta[] cuentas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public double consultarSaldo(int indice){
        return cuentas[indice].getSaldoinicial();

    }
    
    public void ingresarDinero(int indice, double cantidad){
        cuentas[indice].ingresarDinero(cantidad);

    }
    
    public void retirarDinero(int indice, double cantidad){
        cuentas[indice].retirarDinero(cantidad);
    }
}

