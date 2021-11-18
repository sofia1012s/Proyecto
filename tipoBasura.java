/******************************************************************************
 * tipoBasura.java
 * 
 * @author Taewung Heo
 * @author Héctor de León
 * @author Jeremy Mejía
 * @author Sofía Salguero
 * 
 * @version 18/11/2021 
 * 
 * Clase de basura general, se utiliza para derivar las clases de orgánico e 
 * inorgánico
 ******************************************************************************/

public class tipoBasura {
    protected int frutasVerduras;
    protected int pollo;
    protected int carne;
    protected int cerdos;
    protected int pescado;
    protected int cuatroSemanas = 4;

    protected int botellas;
    protected int papel;
    protected int tiempo;
    protected int bolsas;

    
    /** 
     * @param varible
     * @return int
     * Conversion de semana a mes de los desechos del usuario
     */
    public int conversionMes(int varible)
    {
        int conversion = varible * 4;

        return conversion;
    }

}
