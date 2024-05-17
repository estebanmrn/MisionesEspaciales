
public class Main
{
    public static void main(String[] args) {
        
        Fecha fecha1 = new Fecha(21, 9, 2009);
        Fecha fecha2 = new Fecha(2, 12, 2001);
        
        Mision mision1 = new Mision ("Apolo11", fecha1, 2);
        Mision mision2 = new Mision ("Starligh", fecha2, 3);
        
        Nave nave1 = new Nave ("TigerFang", "Tripulada", 3);
        
        Astronauta astronauta1 = new Astronauta ("Cientifico", "Andres");
        Astronauta astronauta2 = new Astronauta ("Piloto", "Sergio");
        
        Planeta planeta1 = new Planeta ("Marte", "Rojizo");
        Planeta planeta2 = new Planeta ("Jupiter", "Enorme");
        
        astronauta1.addMision(mision1);
        astronauta2.addMision(mision2);
        astronauta1.visitarPlanetas(planeta1);
        
        
        //Verificar especialidad
        System.out.println ("Especialidad de Andres: " + astronauta1.verificarEspecialidad());
        System.out.println ("Especialidad de Sergio: " + astronauta2.verificarEspecialidad());
        
        
        
        
}
}
