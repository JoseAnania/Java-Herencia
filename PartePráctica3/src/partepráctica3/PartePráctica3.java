
package partepráctica3;

import java.util.Scanner;

public class PartePráctica3 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Vehículos a cargar: ");
        int cantVehiculos=SC.nextInt();
        
        Comercio C=new Comercio(cantVehiculos);
        
        for (int i = 0; i < cantVehiculos; i++) {
            
            System.out.println("Denominación del vehículo: ");
            String denominacion=SC.next();
            System.out.println("Marca del vehículo: ");
            String marca=SC.next();
            System.out.println("Cantidad en Stock del vehículo: ");
            int stock=SC.nextInt();
            System.out.println("Precio del vehículo: $");
            float precio=SC.nextFloat();
            System.out.println("Cantidad de puertas del automóvil: ");
            int cantPuertas=SC.nextInt();
            
            C.agregarVehiculo(new Automovil(cantPuertas, denominacion, marca, stock, precio));
            
        }
        
        System.out.println("Automóvil de mayor precio: "+C.mayorPrecio());
        System.out.println("Total en Stock de Autos: "+C.cantStock());
        System.out.println("Vehículos cuyo stock existente es mayor a 30: "+C.superaStock(30));
    }
}
