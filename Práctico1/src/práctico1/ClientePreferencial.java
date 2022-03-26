
package práctico1;

public class ClientePreferencial extends Cliente {
    
    private float saldo;
    private float limite;
    private String domicilio;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ClientePreferencial(float saldo, float limite, String domicilio, int numero, String nombre, int telefono) {
        super(numero, nombre, telefono);
        this.saldo = saldo;
        this.limite = limite;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return super.toString()+" ClientePreferencial " + "Saldo:" + saldo + " Límite:" + limite + " Domicilio:" + domicilio;
    }
    
    
}
