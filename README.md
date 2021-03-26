# BritezJonathanBanco
Ejercicio_3

import java.util.Scanner;

public class cuentaBancaria {

    public static void main(String arg[])
    
    {
        String nombreTitular = "";
        String tipoDeCuenta = "";
        Integer saldo = 20000;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("elija el monto a extraer: ");
        saldo = entrada.nextInt();
        
        extraer Saldo = new extraer(saldo);
        Saldo.imprimir();
       
    }
}


public class extraer {
    
    private String nombre;
    private String Tipo;
    private Integer saldo;
    
    
    public extraer(Integer saldo){
        
       
        this.saldo = saldo;
        
    
    }
    
    public void imprimir(){
        
         if(saldo<20000){
        
            saldo =20000 - saldo;
            System.out.println("Te queda disponible: " + saldo );
         
        }
    
    }
}
