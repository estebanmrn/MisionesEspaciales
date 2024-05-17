import java.util.ArrayList;


public class Nave {
    
    private String nombre;
    private String tipo;
    private int capacidad;
    private ArrayList <Mision> misiones = new ArrayList<>();

    public Nave() {
    }

    public Nave(String nombre, String tipo, int capacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.misiones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public boolean verificarCapacidad(int cantidadTripulantes){
        return cantidadTripulantes <= capacidad;
    }
    
    
    
    
    
    
}