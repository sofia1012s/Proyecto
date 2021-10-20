//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************

public class Organico {

    // *****************************************************************************
    // variables
    // *****************************************************************************
    private int frutasVerduras;
    private int pollo;
    private int carne;
    private int cerdos;
    private int pescado;
    private int cuatroSemanas = 4;

    // *****************************************************************************
    // Metodos
    // *****************************************************************************
    public int getFrutasVerduras() {
        return frutasVerduras;
    }

    public int getPollo() {
        return pollo;
    }

    public int getCarne() {
        return carne;
    }

    public int getCerdo() {
        return cerdos;
    }

    public int getPescado() {
        return pescado;
    }

    public void setFV(int frutasVerduras) {
        this.frutasVerduras = frutasVerduras;
    }

    public void setPollo(int pollo) {
        this.pollo = pollo;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public void setCerdo(int cerdo) {
        this.cerdos = cerdos;
    }

    public void setPescado(int pescado) {
        this.pescado = pescado;
    }

    public int conversionFrutasVerduras() {
        /**
         * toma el valor de la cantidad de frutas o verduras(Lb) que consume la persona
         * a la semana y lo multiplica por su edad o por 4 para convertir la frecuencia
         * a menusal
         */

        int conversion = frutasVerduras * cuatroSemanas;
        return conversion;
    }

    public int conversionPollo() {
        /**
         * toma el valor de la cantidad de libras de pollo que consume la persona a la
         * semana y lo multiplica por su edad o por alguna cantidad de tiempo en
         * específico
         */
        int conversion = pollo * cuatroSemanas;
        return conversion;
    }

    public int conversionCarne() {
        /**
         * toma el valor de la cantidad de libras de carne que consume la persona a la
         * semana y lo multiplica por su edad o por alguna cantidad de tiempo en
         * específico
         */
        int conversion = carne * cuatroSemanas;
        return conversion;
    }

    public int conversionCerdos() {
        /**
         * toma el valor de la cantidad de libras de cerdo que consume la persona a la
         * semana y lo multiplica por su edad o por alguna cantidad de tiempo en
         * específico
         */
        int conversion = cerdos * cuatroSemanas;
        return conversion;
    }

    public int conversionPescados() {
        /**
         * toma el valor de la cantidad de libras de pescado que consume la persona a la
         * semana y lo multiplica por su edad o por alguna cantidad de tiempo en
         * específico
         */
        int conversion = pescado * cuatroSemanas;
        return conversion;
    }

}
