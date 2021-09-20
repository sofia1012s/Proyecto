



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
    private int cuatroSemanas = 4;


//*****************************************************************************
//Constructores
//*****************************************************************************
public Inorganico(int botellas, int papel, int tiempo, int bolsas){
    this.botellas = botellas;
    this.papel = papel;
    this.tiempo = tiempo;
    this.bolsas = bolsas;
    
}
//*****************************************************************************
//Metodos
//*****************************************************************************
public int getBotellas(){
    return botellas;
} 
public int getPapel(){
    return papel;
}
public int getTiempo(){
    return tiempo;
}
public int getBolsas(){
    return bolsas;
}  

public int conversionBotellas(){
    /**
     * Realiza una multiplicación de la cantidad de botellas por semana 
     * por 4 para convertir la frecuencia a menusal.
     */

    int conversion = botellas*cuatroSemanas;
    return conversion;

}
public int conversionPapel(){
    /**
     * Realiza una multiplicación de la cantidad de papel por semana 
     * por 4 para convertir la frecuencia a menusal.
     */
    int conversion = papel*cuatroSemanas;
    return conversion;

}
public int conversionAgua(){
    /**
     * Realiza una multiplicación de la cantidad de tiempo
     * por 4 para convertir la frecuencia a menusal.
     */
    int tiempoSemanal = (tiempo*7);
    int conversion = tiempoSemanal * 4;
    return conversion;

}
public int conversionBolsas(){
    /**
     * Realiza una multiplicación de la cantidad de bolsas por semana 
     * por 4 para convertir la frecuencia a menusal.
     */
    int conversion = bolsas*cuatroSemanas;
    return conversion;
}
}
