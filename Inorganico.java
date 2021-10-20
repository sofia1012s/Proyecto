
//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************

public class Inorganico extends tipoBasura{

    // *****************************************************************************
    // variables
    // *****************************************************************************
    private int botellas;
    private int papel;
    private int tiempo;
    private int bolsas;

    // *****************************************************************************
    // Metodos
    // *****************************************************************************
    public int getBotellas() {
        return botellas;
    }

    public int getPapel() {
        return papel;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getBolsas() {
        return bolsas;
    }

    public void setBotellas(int botellas) {
        this.botellas = botellas;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setBolsas(int bolsas) {
        this.bolsas = bolsas;
    }

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
