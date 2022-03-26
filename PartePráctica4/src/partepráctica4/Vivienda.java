package partepráctica4;


public class Vivienda {
    
    protected int codigo;
    protected String domicilio;
    protected float valuacion;
    protected int superficieEdificada;
    protected float baseImponible;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getValuacion() {
        return valuacion;
    }

    public void setValuacion(float valuacion) {
        this.valuacion = valuacion;
    }

    public int getSuperficieEdificada() {
        return superficieEdificada;
    }

    public void setSuperficieEdificada(int superficieEdificada) {
        this.superficieEdificada = superficieEdificada;
    }

    public float getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(float baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Vivienda(int codigo, String domicilio, float valuacion, int superficieEdificada, float baseImponible) {
        this.codigo = codigo;
        this.domicilio = domicilio;
        this.valuacion = valuacion;
        this.superficieEdificada = superficieEdificada;
        this.baseImponible = baseImponible;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "codigo=" + codigo + ", domicilio=" + domicilio + ", valuacion=" + valuacion + ", superficieEdificada=" + superficieEdificada + ", baseImponible=" + baseImponible + '}';
    }
    

}
