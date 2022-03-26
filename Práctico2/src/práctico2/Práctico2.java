
package práctico2;

public class Práctico2 {

    public static void main(String[] args) {
        
        Empresa E=new Empresa(6);
        
        E.agregarEmpleado(new Obrero(30, 1, "José", 12000));
        E.agregarEmpleado(new Administrativo(true, 2, "Luis", 17000));
        E.agregarEmpleado(new Vendedor(5000, 3, "Teo", 15000));
        E.agregarEmpleado(new Obrero(27, 4, "Carlos", 12000));
        E.agregarEmpleado(new Administrativo(false, 5, "Leandro", 17000));
        E.agregarEmpleado(new Vendedor(7237, 6, "Gisell", 15000));
        
        System.out.println("Listado: "+E.toString());
        
    }
    
}
