
package práctico2;

public class Vendedor extends Empleado{
    
    private float totalVentas;

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public Vendedor(float totalVentas, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return super.toString()+ " Categoría: Vendedor " + " Total de Ventas: " + totalVentas + " Liquidación Final: " + calcularSueldo();
    }
    
    public float calcularSueldo()
    {
        float sueldoFinal=0;
        
        sueldoFinal=sueldoBasico+(totalVentas*0.01f);
        
        return sueldoFinal;
    }
    
}
