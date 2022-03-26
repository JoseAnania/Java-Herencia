
package partepráctica2;

public class Persona {
    
    protected int dni;
    protected String nombre;
    protected String domicilio;
    protected int telefono;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Persona(int dni, String nombre, String domicilio, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return " PERSONA \n" + " D.N.I.: " + dni + " Nombre: " + nombre + " Domicilio: " + domicilio + " Teléfono: " + telefono;
    }
    
    
}
