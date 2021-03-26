
package programacion.banco;
import java.util.Scanner;
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
