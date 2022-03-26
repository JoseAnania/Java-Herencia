
package partepráctica3;

public class Comercio {
    
    private Vehiculo[]vehiculos;

    public Comercio(int cantVehiculos) {
        this.vehiculos = new Vehiculo[cantVehiculos];
    }
    
    public void agregarVehiculo(Vehiculo nuevoVehiculo)
    {
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i]==null)
            {
                vehiculos[i]=nuevoVehiculo;
                break;
            }
            
        }
    }
    
    public String mayorPrecio()
    {
        String nomMayor="";
        float mayor=0;
        
        for (int i = 0; i < vehiculos.length; i++) {
            if(i==1 || vehiculos[i].getPrecio()>mayor)
            {
                mayor=vehiculos[i].getPrecio();
                nomMayor=vehiculos[i].getDenominacion();
            }
        }
        return nomMayor;
    }
    
    public int cantStock()
    {
        int acumStock=0;
        
        for (int i = 0; i < vehiculos.length; i++) {
            
            acumStock+=vehiculos[i].getStock();
        }
        return acumStock;
    }
    
    public String superaStock(int stock)
    {
        String listado="\n";
        for (int i = 0; i < vehiculos.length; i++) {
            
            if(vehiculos[i].getStock()>stock)
            {
                listado+=vehiculos[i].getDenominacion()+"\n";
            }
        }
        return listado;
    }
}
