
package partepráctica4;

import java.util.Scanner;

public class PartePráctica4 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner (System.in);
        
        System.out.println("Cantidad de Viviendas: ");
        int cantViviendas=SC.nextInt();
        
        Constructora C=new Constructora(cantViviendas);
        
        for (int i = 0; i < cantViviendas; i++) {
            
            System.out.println("Código de Vivienda: ");
            int codigo=SC.nextInt();
            System.out.println("Domicilio: ");
            String domicilio=SC.next();
            System.out.println("Valuación: ");
            float valuacion=SC.nextFloat();
            System.out.println("Porcentaje de Superficie Edificada: ");
            int superficieEdificada=SC.nextInt();
            System.out.println("Base imponible: ");
            float baseImponible=SC.nextFloat();
            System.out.println("Superficie total del Terreno: ");
            int superficieTerreno=SC.nextInt();
            
            C.agregarVivienda(new Casa(superficieTerreno, codigo, domicilio, valuacion, superficieEdificada, baseImponible));
            
        }
        
        System.out.println(" Vivienda con mayor superficie edificada: Código: "+C.codigoMayoSuperficie()+" Domicilio: "+C.nombreMayorSuperficie());
        System.out.println("Precio de la Vivienda cuyo código es 2 $"+C.calcularPrecio(2));
    }
    
}
