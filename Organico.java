//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************

public class Organico {

//*****************************************************************************
//variables
//*****************************************************************************
    private int frutasVerduras;
    private int pollo;
    private int carne;
    private int cerdos;
    private int pescado;
    private int edad;
   // private Persona Persona;//el nombre de esta clase puede cambiar dependiendo como le pongan  //agrege el nombre de la clase 

//*****************************************************************************
//Constructores
//*****************************************************************************

//*****************************************************************************
//Metodos
//*****************************************************************************
    public int conversionFrutasVerduras(int frutasVerduras, int tiempo){
        /**
         * toma el valor de la cantidad de frutas o verduras que consume la 
         * persona a la semana y lo multiplica por su edad o por alguna 
         * cantidad de tiempo en específico
         */

        int conversion = frutasVerduras * tiempo;
        return conversion;
    }
    public int conversionPollo(int pollo, int tiempo){
        /**
         *  toma el valor de la cantidad de libras de pollo que consume la 
         * persona a la semana y lo multiplica por su edad o por alguna 
         * cantidad de tiempo en específico
         */
        int conversion = pollo * tiempo;
        return conversion;
    }
    public int conversionCarne(int carne, int tiempo){
        /**
         *  toma el valor de la cantidad de libras de carne que consume 
         * la persona a la semana y lo multiplica por su edad o por 
         * alguna cantidad de tiempo en específico
         */
        int conversion = carne * tiempo;
        return conversion;
    }
    public int conversionCerdos(int cerdos, int tiempo){
        /**
         * toma el valor de la cantidad de libras de cerdo que 
         * consume la persona a la semana y lo multiplica por su 
         * edad o por alguna cantidad de tiempo en específico
         */
        int conversion = cerdos * tiempo;
        return conversion;
    }
    public int conversionPescados(int pescado, int tiempo){
        /**
         * toma el valor de la cantidad de libras de pescado que 
         * consume la persona a la semana y lo multiplica por su 
         * edad o por alguna cantidad de tiempo en específico
         */
        int conversion = pescado * tiempo;
        return conversion;
    }



}
