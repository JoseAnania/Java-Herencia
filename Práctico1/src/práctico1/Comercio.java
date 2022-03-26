
package práctico1;

public class Comercio {
    
    private Cliente[]clientes;

    public Comercio(int cantClientes) {
        this.clientes = new Cliente[cantClientes];
    }
    public void agregarCliente(Cliente nuevoCliente)
    {
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i]==null)
            {
                clientes[i]=nuevoCliente;
                break;
            }
        }
    }

    @Override
    public String toString() {
        
        String listado="\n";
        for (int i = 0; i < clientes.length; i++) {
            
            listado+=clientes[i].toString()+"\n";
            
        }
        return listado;
    }
    
    
    
}
