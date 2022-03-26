
package partepráctica2;

import java.util.Scanner;

public class PartePráctica2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Empleados: ");
        int cantEmpleados=SC.nextInt();
        
        Empresa EM=new Empresa(cantEmpleados);
        
        for (int i = 0; i < cantEmpleados; i++) {
            
            System.out.println("D.N.I. del empleado "+(1+i));
            int dni=SC.nextInt();
            System.out.println("Nombre: ");
            String nombre=SC.next();
            System.out.println("Domicilio: ");
            String domicilio=SC.next();
            System.out.println("Teléfono: ");
            int telefono=SC.nextInt();
            System.out.println("Legajo: ");
            int legajo=SC.nextInt();
            System.out.println("Cargo: ");
            String cargo=SC.next();
            
            Empleado E=new Empleado(legajo, cargo, dni, nombre, domicilio, telefono);
            
            EM.nuevoEmpleado(E);
        }
        
        System.out.println("Datos de los Empleados: "+EM.toString());
    }
    
}
