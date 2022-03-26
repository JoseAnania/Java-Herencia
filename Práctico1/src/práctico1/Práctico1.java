
package práctico1;

public class Práctico1 {

    public static void main(String[] args) {
        
        Comercio Co=new Comercio(5);
        
        Co.agregarCliente(new Cliente(1, "Jose", 4247404));
        Co.agregarCliente(new ClientePreferencial(500, 1000, "Córdoba", 2, "Luis", 4737773));
        Co.agregarCliente(new ClientePreferencial(250, 1000, "San Rafael", 3, "Juan", 515555284));
        Co.agregarCliente(new Cliente(4, "Teo", 5552852));
        Co.agregarCliente(new ClientePreferencial(748, 1250, "Río Gallegos", 5, "Carlos", 0));
        
        System.out.println("Listado de Clientes: "+Co.toString());
    }
    
}
