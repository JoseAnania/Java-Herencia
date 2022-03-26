
package partepráctica3;

public class Vehiculo {
    
    protected String denominacion;
    protected String marca;
    protected int stock;
    protected float precio;

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Vehiculo(String denominacion, String marca, int stock, float precio) {
        this.denominacion = denominacion;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "VEHICULO " + " Denominación: " + denominacion + " Marca: " + marca + " Stock: " + stock + " Precio: $" + precio;
    }
    
}
