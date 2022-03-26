
package partepráctica1;

public class RecursosHumanos {
    
    private Persona[]personas;

    public RecursosHumanos(int cantPersonas) {
        this.personas = new Persona[cantPersonas];
    }
    
    public void agregarPersona(Persona nuevaPersona)
    {
        for (int i = 0; i < personas.length; i++) {
            if(personas[i]==null)
            {
                personas[i]=nuevaPersona;
                break;
            }
        }
    }
    
    public int cantTipoProf(int tipoProf)
    {
        int contProf=0;
        
        for (int i = 0; i < personas.length; i++) {
            
            if(personas[i]!=null && personas[i] instanceof Profesional)
            {
                Profesional PR=(Profesional) personas[i];
                
                if(PR.getProfesion()==tipoProf)
                {
                    contProf++;
                }
            }
            
        }
        return contProf;
    }
    
    public String contMenorSueldo()
    {
        String nomMenor="";
        float sueldoMenor=0;
        
        for (int i = 0; i < personas.length; i++) {
            if(personas[i]!=null && personas[i] instanceof Profesional)
            {
                Profesional PR=(Profesional) personas[i];
                
                if(PR.getProfesion()==3)
                {
                    if(i==1 || PR.getSueldo()<sueldoMenor)
                    {
                        sueldoMenor=PR.getSueldo();
                        nomMenor=PR.getNombre();
                    }
                }
            }
            
        }
        return nomMenor;
    }
    
    public float totalSueldos()
    {
        float acumSueldos=0;
        
        for (int i = 0; i < personas.length; i++) {
            if(personas[i]!=null && personas[i] instanceof Profesional)
            {
                Profesional PR=(Profesional) personas[i];
                
                acumSueldos+=PR.getSueldo();
            }
            
        }
        
        return acumSueldos;
    }
}
