
package partepráctica1;

import java.util.Scanner;


public class PartePráctica1 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Profesionales: ");
        int cantPersonas=SC.nextInt();
        
        RecursosHumanos RH=new RecursosHumanos(cantPersonas);
        
        for (int i = 0; i < cantPersonas; i++) {
            
            System.out.println("D.N.I.: ");
            int dni=SC.nextInt();
            System.out.println("Nombre del profesional: ");
            String nombre=SC.next();
            System.out.println("Dirección: ");
            String direccion=SC.next();
            System.out.println("Tipo de Documento (1-DNI / 2-LE / 3-LC / 4-Otro)");
            int tipoDni=SC.nextInt();
            System.out.println("Profesión de "+nombre+"(1-Abogado / 2-Ingeniero / 3-Contador / 4-Otro)");
            int profesion=SC.nextInt();
            System.out.println("Puesto desempeñado: ");
            String puesto=SC.next();
            System.out.println("Sueldo: ");
            float sueldo=SC.nextFloat();
            System.out.println("Matricula profesional: ");
            int matricula=SC.nextInt();
            
            RH.agregarPersona(new Profesional(profesion, puesto, sueldo, matricula, dni, nombre, direccion, tipoDni));
            
        }
        
        System.out.println("Cantidad de Abogados: "+RH.cantTipoProf(1));
        System.out.println("Cantidad de Ingenieros: "+RH.cantTipoProf(2));
        System.out.println("Cantidad de Contadores: "+RH.cantTipoProf(3));
        System.out.println("Cantidad de Otros profesionales: "+RH.cantTipoProf(4));
        
        System.out.println("Nombre del Contador con Menor Sueldo: "+RH.contMenorSueldo());
        
        System.out.println("Total de Sueldos abonados: $"+RH.totalSueldos());
    }
    
}
