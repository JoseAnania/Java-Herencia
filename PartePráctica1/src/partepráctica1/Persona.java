
package partepráctica1;

public class Persona {
    
    protected int dni;
    protected String nombre;
    protected String direccion;
    protected int tipoDni;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(int tipoDni) {
        this.tipoDni = tipoDni;
    }

    public Persona(int dni, String nombre, String direccion, int tipoDni) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoDni = tipoDni;
    }

    @Override
    public String toString() {
        return "PERSONA: " + " D.N.I.: " + dni + " Nombre: " + nombre + " Dirección: " + direccion + " Tipo de D.N.I.: " + tipoDni;
    }
    
}
