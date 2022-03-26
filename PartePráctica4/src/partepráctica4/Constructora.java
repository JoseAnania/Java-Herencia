
package partepráctica4;

public class Constructora {
    
    private Vivienda[]viviendas;

    public Constructora(int cantViviendas) {
        this.viviendas = new Vivienda[cantViviendas];
    }
    
    public void agregarVivienda(Vivienda nuevaVivienda)
    {
        for (int i = 0; i < viviendas.length; i++) {
            if(viviendas[i]==null)
            {
                viviendas[i]=nuevaVivienda;
                break;
            }
        }
    }
    
    public String nombreMayorSuperficie()
    {
        int mayor=0;
        String domMayor="";
        
        for (int i = 0; i < viviendas.length; i++) {
            if(i==1 || viviendas[i].getSuperficieEdificada()>mayor )
            {
                mayor=viviendas[i].getSuperficieEdificada();
                domMayor=viviendas[i].getDomicilio();
            }
        }
        return domMayor;
    }
    
    public int codigoMayoSuperficie()
    {
        int mayor=0;
        int codigo=0;
        
        for (int i = 0; i < viviendas.length; i++) {
            if(i==1 || viviendas[i].getSuperficieEdificada()>mayor)
            {
                mayor=viviendas[i].getSuperficieEdificada();
                codigo=viviendas[i].getCodigo();
            }
        }
        return codigo;
    }
    
    public float calcularPrecio(int codVivienda)
    {
        float precio=0;
        
        for (int i = 0; i < viviendas.length; i++) {
            if(viviendas[i].getCodigo()==codVivienda)
            {
                precio=(viviendas[i].getBaseImponible()*viviendas[i].getValuacion())/viviendas[i].getSuperficieEdificada();
            }
        }
        return precio;
    }
    
}
