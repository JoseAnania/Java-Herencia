
package práctico2;

public class Administrativo extends Empleado {
    
    private boolean presentismo;

    public boolean isPresentismo() {
        return presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }

    public Administrativo(boolean presentismo, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    @Override
    public String toString() {
        return super.toString()+ " Categoría: Administrativo " + " Presentismo: " + presentismo + " Liquidación Final: " + calcularSueldo();
    }
    
    public float calcularSueldo()
    {
        float sueldoFinal=0;
        
        if(presentismo==true)
        {
            sueldoFinal=(sueldoBasico*0.13f)+sueldoBasico;
        }
        else
        {
            sueldoFinal=sueldoBasico;
        }
        
        return sueldoFinal;
    }
    
}
