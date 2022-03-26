
package partepráctica3;

public class Automovil extends Vehiculo{
    
    private int cantPuertas;

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public Automovil(int cantPuertas, String denominacion, String marca, int stock, float precio) {
        super(denominacion, marca, stock, precio);
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+" AUTOMOVIL" + " Cantidad de Puertas: " + cantPuertas;
    }
    
}
