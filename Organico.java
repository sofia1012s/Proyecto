/******************************************************************************
 * Organico.java
 * 
 * @author Taewung Heo
 * @author Héctor de León
 * @author Jeremy Mejía
 * @author Sofía Salguero
 * 
 * @version 21/10/2021 
 * 
 * Clase de basura orgánica, se encarga de tener getters y setters para los
 * datos de los desechos orgánicos
 ******************************************************************************/

public class Organico extends tipoBasura{

    /** 
     * @return int
     * Getter frutas y verduras
     */
    public int getFrutasVerduras() {
        return frutasVerduras;
    }

    
    /** 
     * @return int
     * Getter Pollo
     */
    public int getPollo() {
        return pollo;
    }

    
    /** 
     * @return int
     * Getter Carne
     */
    public int getCarne() {
        return carne;
    }

    
    /** 
     * @return int
     * Getter Cerdo
     */
    public int getCerdo() {
        return cerdos;
    }

    
    /** 
     * @return int
     * Getter Pescado
     */
    public int getPescado() {
        return pescado;
    }

    
    /** 
     * @param frutasVerduras
     * Setter frutas y verduras
     */
    public void setFV(int frutasVerduras) {
        this.frutasVerduras = frutasVerduras;
    }

    
    /** 
     * @param pollo
     * Setter Pollo
     */
    public void setPollo(int pollo) {
        this.pollo = pollo;
    }

    
    /** 
     * @param carne
     * Setter Carne
     */
    public void setCarne(int carne) {
        this.carne = carne;
    }

    
    /** 
     * @param cerdos
     * Setter Cerdo
     */
    public void setCerdo(int cerdos) {
        this.cerdos = cerdos;
    }

    
    /** 
     * @param pescado
     * Setter Pescado
     */
    public void setPescado(int pescado) {
        this.pescado = pescado;
    }

}
