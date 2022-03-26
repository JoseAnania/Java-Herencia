
package partepráctica4;

public class Casa extends Vivienda {
    
    private int superficieTerreno;

    public int getSuperficieTerreno() {
        return superficieTerreno;
    }

    public void setSuperficieTerreno(int superficieTerreno) {
        this.superficieTerreno = superficieTerreno;
    }

    public Casa(int superficieTerreno, int codigo, String domicilio, float valuacion, int superficieEdificada, float baseImponible) {
        super(codigo, domicilio, valuacion, superficieEdificada, baseImponible);
        this.superficieTerreno = superficieTerreno;
    }

    @Override
    public String toString() {
        return super.toString()+"Casa{" + "superficieTerreno=" + superficieTerreno + '}';
    }
    
}
