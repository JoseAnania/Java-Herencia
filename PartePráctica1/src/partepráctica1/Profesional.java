
package partepráctica1;

public class Profesional extends Persona {
    
    private int profesion;
    private String puesto;
    private float sueldo;
    private int matricula;

    public int getProfesion() {
        return profesion;
    }

    public void setProfesion(int profesion) {
        this.profesion = profesion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Profesional(int profesion, String puesto, float sueldo, int matricula, int dni, String nombre, String direccion, int tipoDni) {
        super(dni, nombre, direccion, tipoDni);
        this.profesion = profesion;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()+" PROFESIONAL: " + " Profesión: " + profesion + " Puesto: " + puesto + " Sueldo: " + sueldo + " Matricula: " + matricula;
    }
    
}
