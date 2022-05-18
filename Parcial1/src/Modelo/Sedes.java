
package Modelo;

import java.util.Scanner;


public class Sedes {
    
    public static int buscarSedes(Cuenta cuentas[], int numeroSedesBuscar){
        int indice=0;
        int iterador=0;
        boolean numeroSedesEncontrada = false;
        
        while ((iterador < cuentas.length)&& (numeroSedesEncontrada == false)){
            if (cuentas[iterador].getNoCuenta()== numeroSedesBuscar){
                numeroSedesEncontrada = true;
                indice = iterador;
            }
            iterador++;
        }
        if(numeroSedesEncontrada == false){
            indice = -1;
        }
        return indice;
    }
    
    public static int buscarNumeroCuentas(Cuenta cuentas[], int numeroCuentasBuscar){
        int indice=0;
        int iterador=0;
        boolean numeroCuentasEncontrada = false;
        
        while ((iterador < cuentas.length)&& (numeroCuentasEncontrada == false)){
            if (cuentas[iterador].getNoCuenta()== numeroCuentasBuscar){
                numeroCuentasEncontrada = true;
                indice = iterador;
            }
            iterador++;
        }
        if(numeroCuentasEncontrada == false){
            indice = -1;
        }
        return indice;
    }
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido,CC,sexo;
        Cuenta cuentas[];
        Usuario usuario;
        int noCuenta, cantidadCuenta,opcion, indiceNumeroCuenta;
        double saldoinicial,cantidadDinero;
        
        System.out.println("Digite el nombre del usuario: ");
        nombre=teclado.next();
        
        System.out.println("Digite el Apellido del usuario: ");
        apellido=teclado.next();
        
        System.out.println("Digite la cedula de ciudadania del usuario");
        CC=teclado.next();
               
        System.out.println("Digite su sexo 'M' o 'H' ");
        sexo=teclado.next();
        
        System.out.println("\nDigite la cantidad de cuanta que tiene el usuario");
        cantidadCuenta= teclado.nextInt();
        
        System.out.println("");
        
        cuentas = new Cuenta[cantidadCuenta];
        
        
        for (int i= 0;i < cuentas.length; i++){
            System.out.println("\nDigite la "+(i+1)+" cuenta : ");
            
            System.out.println("Digite el numero de cuenta: ");
            noCuenta= teclado.nextInt();
            
            System.out.println("Digite el saldo de la cuenta: ");
            saldoinicial = teclado.nextDouble();
            System.out.println("");
            
            cuentas[i] = new Cuenta(noCuenta,saldoinicial);
            }
        usuario= new Usuario(CC,nombre,apellido,sexo,cuentas);
        
        do{
            System.out.println("\n\tMENU");
            System.out.println("1. Crear Banco");
            System.out.println("2. Crear Sedes Bancarias");
            System.out.println("3. Consultar Sedes Bancarias");
            System.out.println("4. Consultar Cuenta");
            System.out.print("5. Salir");
            opcion=teclado.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.print("Digite el nombre del banco");
                       noCuenta = teclado.nextInt();
                       indiceNumeroCuenta = buscarNumeroCuentas(cuentas, noCuenta);
                       
                       if(indiceNumeroCuenta == -1){
                           System.out.println("\nCuenta no encontrado , verifique su número de cuenta");
                           System.out.println("");
                       }else{
                           System.out.print("Digite la cantidad de dinero a depositar : ");   
                           cantidadDinero = teclado.nextDouble();
                           
                           usuario.ingresarDinero(indiceNumeroCuenta, cantidadDinero);
                           System.out.println("\nDeposito con exito ");
                           System.out.print("Saldo disponible : " + usuario.consultarSaldo(indiceNumeroCuenta));
                           System.out.println("");
                       }
                    break;
                
                case 2:
                    System.out.print("\nDigite el numero de cuenta : ");
                       
                    break;
                
                case 3:
                    System.out.print("\nDigite el numero de la sede");
                    noCuenta = teclado.nextInt();
                       indiceNumeroCuenta = buscarNumeroCuentas(cuentas, noCuenta);
                       
                       if(indiceNumeroCuenta == -1){
                           System.out.println("\nNo existe una cuenta con ese número");
                           System.out.println("");
                       }
                       else{
                           System.out.print("\nDigite la cantidad de dinero a retirar : ");
                           cantidadDinero = teclado.nextDouble();
                           
                           if(usuario.consultarSaldo(indiceNumeroCuenta) < cantidadDinero){
                               System.out.print("Saldo insuficiente");  
                               System.out.println("");
                           }else{
                               usuario.retirarDinero(indiceNumeroCuenta, cantidadDinero);
                               System.out.println("");
                               System.out.println("Retiro con exito");
                               System.out.println("Saldo disponible de la cuenta : " + usuario.consultarSaldo(indiceNumeroCuenta));
                               System.out.println("");
                           }
                       }
                    
                    break;
                
                case 4:
                    System.out.print("\nDigite el numero de cuenta");
                    noCuenta = teclado.nextInt();
                    indiceNumeroCuenta = buscarNumeroCuentas(cuentas,noCuenta);
                    
                    if (indiceNumeroCuenta == -1){
                        System.out.println("\nCuenta no encontrada, verifique su numero de cuenta");
                        }
                    
                    break;
                
                case 5:
                    System.out.println("\nGracias por utilizar, espero que sea de vuestro agrado");
                    opcion=5;  
                    break;
                    
                default:
                    System.out.println("Opcion no Disponible, vuelva a intentarlo");
                    break;
            }
            
        }while(opcion != 5);
    }
    
     
}
