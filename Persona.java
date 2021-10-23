/******************************************************************************
 * Persona.java
 * 
 * @author Taewung Heo
 * @author Héctor de León
 * @author Jeremy Mejía
 * @author Sofía Salguero
 * 
 * @version 21/10/2021 
 * 
 * Clase Persona, se encarga de tomar los datos del usuario
 ******************************************************************************/
class Persona{

    private String Nombre = "";
    private int Edad = 0;

    
    /** 
     * @return String
     * Getter de nombre
     */
    public String getNombre() {
        return Nombre;
    }

    
    /** 
     * @param Nombre
     * Setter de nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    /** 
     * @return int
     * Getter de edad
     */
    public int getEdad() {
        return Edad;
    }

    
    /** 
     * @param Edad
     * Setter de edad
     */
    public void setEdad(int Edad) {
        this.Edad= Edad;
    }
}