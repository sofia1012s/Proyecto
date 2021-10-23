/******************************************************************************
 * PersonaPromedio.java
 * 
 * @author Taewung Heo
 * @author Héctor de León
 * @author Jeremy Mejía
 * @author Sofía Salguero
 * 
 * @version 21/10/2021 
 * 
 * Clase de persona promedio, se encarga de brindar los métodos necesarios
 * para comparar los desechos del usuario con la de una persona promedio
 ******************************************************************************/

class PersonaPromedio {
    private int botellasPromedio = 16; //Botellas consumidas por mes 
    private int papelPromedio = 105; //Libras al mes
    private int aguaPromedio = 3000; //Litros de agua al mes
    private int bolsasPromedio = 20; //Bolsas al mes
    private int frutasVerdurasPromedio = 17; //Libras al mes
    private int polloPromedio = 4; //Libras al mes
    private int carnePromedio = 9; //Libras al mes 
    private int cerdoPromedio = 4; //Libras al mes
    private int pescadosPromedio = 4; //Libras al mes 

    
    /** 
     * @return int
     * Getter botellas promedio
     */
    public int getBotellasPromedio() {
        return botellasPromedio;
    }

    
    /** 
     * @return int
     * Getter papel promedio
     */
    public int getPapelPromedio() {
        return papelPromedio;
    }

    
    /** 
     * @return int
     * Getter agua promedio
     */
    public int getAguaPromedio() {
        return aguaPromedio;
    }

    
    /** 
     * @return int
     * Getter bolsas promedio
     */
    public int getBolsasPromedio() {
        return bolsasPromedio;
    }

    
    /** 
     * @return int
     * Getter frutas y verduras promedio
     */
    public int getFrutasVerdurasPromedio() {
        return frutasVerdurasPromedio;
    }

    
    /** 
     * @return int
     * Getter pollo promedio
     */
    public int getPolloPromedio() {
        return polloPromedio;
    }

    
    /** 
     * @return int
     * Getter carne promedio
     */
    public int getCarnePromedio() {
        return carnePromedio;
    }

    
    /** 
     * @return int
     * Getter cerdo promedio
     */
    public int getCerdoPromedio() {
        return cerdoPromedio;
    }

    
    /** 
     * @return int
     * Getter pescado promedio
     */
    public int getPescadossPromedio() {
        return pescadosPromedio;
    }

    
    
}
