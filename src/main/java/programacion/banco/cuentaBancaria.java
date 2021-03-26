
package programacion.banco;

import java.util.Scanner;
public class cuentaBancaria {
    public static void main(String arg[]){
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
