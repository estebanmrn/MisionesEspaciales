
public class Mision {
    
    private String nombre;
    private Fecha fechaInicio;
    private int cantidadTripulantes;

    public Mision() {
    }

    public Mision(String nombre, Fecha fechaInicio, int cantidadTripulantes) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;        
        if (cantidadTripulantes > 3){
            System.out.println ("Error, la cantidad de tripulantes no puede ser mayor a 3");
            this.cantidadTripulantes = 3;
        }
        else {
            this.cantidadTripulantes = cantidadTripulantes;
        }
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public int getCantidadTripulantes(){
        return cantidadTripulantes;
    }
    public void setCantidadTripulantes (int cantidadTripulantes){
        this.cantidadTripulantes = cantidadTripulantes;
    }
    
    
}