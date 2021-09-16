public class Comparaciones {

    private Inorganico inorganico;
    private Organico organico;
    private PersonaPromedio personaP;

    public int comparacionBotellas(int botellas) {
        // botellas = cantidad de botellas en cierta cantidad de tiempo
        // dimensiones botella promedio:
        // https://www.remsaplasticos.com/productos/botellas-pet/botella-pet-600ml

        // dimensiones cancha de futból:
        // https://www.cihefe.es/cuadernosdefutbol/2019/01/el-terreno-de-juego-dimensiones/

        // Cantidad de botellas que llenan una cancha: 151,404

        // Si toda la población de Guatemala (16,600,000) gastara la misma cantidad de
        // botellas por semana:
        int botellasPoblacion = (16600000 * botellas);

        int canchasSemana = (botellasPoblacion) / (151404); // Cantidad de canchas que se llenarían por semana
        return canchasSemana;
    }

    public int comparacionPapel(int papel) {
        
        return papel;
    }

    public int comparacionAgua(int tiempo) {

        return tiempo;
    }

    public int comparacionBolsas(int bolsas) {

        return bolsas;
    }

    public int comparacionCarro(int km) {

        return km;
    }

    public int comparacionVerduras(int frutasVerduras) {

        return frutasVerduras;
    }

    public int comparacionPollo(int pollo) {

        return pollo;
    }

    public int comparacionCarne(int carne) {

        return carne;
    }

    public int comparacionCerdo(int cerdo) {

        return cerdo;
    }

    public int comparacionPescado(int pescado) {

        return pescado;
    }

    public int comparacionPersonaP(int cantidadPromedio) {

        return cantidadPromedio;
    }
}
