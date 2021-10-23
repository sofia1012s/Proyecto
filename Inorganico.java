
/******************************************************************************
 * Inorgánico.java
 * 
 * @author Taewung Heo
 * @author Héctor de León
 * @author Jeremy Mejía
 * @author Sofía Salguero
 * 
 * @version 21/10/2021 
 * 
 * Clase de basura inorgánica, se encarga de tener getters y setters para los
 * datos de los desechos inorgánicos
 ******************************************************************************/

public class Inorganico extends tipoBasura{

    /** 
     * @return int
     * Getter para la cantidad de botellas
     */
    public int getBotellas() {
        return botellas;
    }

    
    /** 
     * @return int
     * Getter para la cantidad de papel
     */
    public int getPapel() {
        return papel;
    }

    
    /** 
     * @return int
     * Getter para la cantidad de tiempo que tarda en bañarse la persona
     */
    public int getTiempo() {
        return tiempo;
    }

    
    /** 
     * @return int
     * Getter para la cantidad de bolsas
     */
    public int getBolsas() {
        return bolsas;
    }

    
    /** 
     * @param botellas
     * Setter para la cantidad de botellas
     */
    public void setBotellas(int botellas) {
        this.botellas = botellas;
    }

    
    /** 
     * @param papel
     * Setter para la cantidad de papel
     */
    public void setPapel(int papel) {
        this.papel = papel;
    }

    
    /** 
     * @param tiempo
     * Setter para la cantidad de tiempo que tarda en bañarse la persona
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    
    /** 
     * @param bolsas
     * Setter para la cantidad de bolsas
     */
    public void setBolsas(int bolsas) {
        this.bolsas = bolsas;
    }

    
    /** 
     * @return int
     * Getter para la cantidad de agua que gasta en un mes
     */
    public int conversionAgua() {
        /**
         * Realiza una multiplicación de la cantidad de tiempo por 4 para convertir la
         * frecuencia a menusal.
         */
        int tiempoSemanal = (tiempo * 7);
        int conversion = tiempoSemanal * 4;
        return conversion;

    }

}
