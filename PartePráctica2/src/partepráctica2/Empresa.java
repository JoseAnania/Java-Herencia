
package partepráctica2;

public class Empresa {
    
    private Empleado[]empleados;

    public Empresa(int cantEmpleados) {
        this.empleados = new Empleado[cantEmpleados];
    }
    
    public void nuevoEmpleado(Empleado nuevoEmpleado)
    {
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i]==null)
            {
                empleados[i]=nuevoEmpleado;
                break;
            }
            
        }
    }

    @Override
    public String toString() {
        String listado="\n";
        
        for (int i = 0; i < empleados.length; i++) {
            
            listado+=empleados[i].toString()+"\n";
            
        }
        return listado;
    }
    
    
}
