
package partepráctica2;

public class Empleado extends Persona {
    
    private int legajo;
    private String cargo;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado(int legajo, String cargo, int dni, String nombre, String domicilio, int telefono) {
        super(dni, nombre, domicilio, telefono);
        this.legajo = legajo;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString()+" EMPLEADO \n" + " Legajo: " + legajo + " Cargo: " + cargo;
    }
    
}
