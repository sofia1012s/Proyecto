



//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************

public class Inorganico {

//*****************************************************************************
//variables
//*****************************************************************************
    private int botellas;
    private int papel;
    private int tiempo;
    private int bolsas;
    private int edad;
   // private Persona persona;

//*****************************************************************************
//Constructores
//*****************************************************************************

//*****************************************************************************
//Metodos
//*****************************************************************************
    public int conversionBotellas(int botellas, int tiempo){
        /**
         * Realiza una multiplicación de la cantidad de botellas por semana 
         * por una cantidad de tiempo específico.
         */

        int conversion = botellas*tiempo;
        return conversion;

    }
    public int conversionPapel(int papel, int tiempo){
        /**
         * Realiza una multiplicación de la cantidad de papel por semana 
         * por una cantidad de tiempo específico.
         */
        int conversion = papel*tiempo;
        return conversion;

    }
    public int conversionAgua(int tiempoBaniandose, int tiempo){
        /**
         * Realiza una multiplicación de la cantidad de agua consumida 
         * por una cantidad de tiempo específico.
         */
        int conversion = tiempoBaniandose*tiempo;
        return conversion;

    }
    public int conversionBolsas(int bolsas, int tiempo){
        /**
         * Realiza una multiplicación de la cantidad de bolsas por semana 
         * por una cantidad de tiempo específico.
         */
        int conversion = bolsas*tiempo;
        return conversion;
    }
}
