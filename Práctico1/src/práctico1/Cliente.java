
package práctico1;

public class Cliente {
    
    protected int numero;
    protected String nombre;
    protected int telefono;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Cliente(int numero, String nombre, int telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente " + "Número: " + numero + " Nombre:" + nombre + " Télefono:" + telefono;
    }
    
}
