
import java.util.ArrayList;


public class Astronauta {
    
    private String especialidad, nombre;
    private ArrayList <Mision> misiones = new ArrayList <Mision>();
    private ArrayList <Planeta> planetas = new ArrayList <Planeta>();

    public Astronauta() {
    }

    public Astronauta(String especialidad, String nombre) {
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.misiones = new ArrayList<>();
        this.planetas = new ArrayList<>();
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mision> getMisiones() {
        return misiones;
    }
    
    public void addMision (Mision mision){
        this.misiones.add(mision);
    }

    public void setMisiones(ArrayList<Mision> misiones) {
        this.misiones = misiones;
    }
    
    public int numeroMisiones (){
        return misiones.size();
        
    }
    
    public ArrayList<Planeta> getPlanetas(){
        return planetas;
    }
    
    public void visitarPlanetas (Planeta planeta){
        this.planetas.add(planeta);
    }
    
    public boolean verificarEspecialidad (){
        switch (especialidad){
            case "Piloto":
                return misiones.size() >= 1 && planetas.size() >= 1;
            case "Cientifico":
                return misiones.size() >= 2 && planetas.size() >= 2;
            case "Ingeniero":
                return misiones.size() >= 3 && planetas.size() >= 3;
                default: 
                    return false;
                
        }
    }
    
    
    
    
    
}
