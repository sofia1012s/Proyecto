
/******************************************************************************
 * Comparaciones.java
 * 
 * @author Taewung Heo
 * @author Héctor de León
 * @author Jeremy Mejía
 * @author Sofía Salguero
 * 
 * @version 21/10/2021 
 * Clase de Comparaciones, se encarga de comparar los resultados que brinda la persona 
 ******************************************************************************/

public class Comparaciones {
    
    /** 
     * @param botellas
     * @return int
     * Método que compara la cantidad de botellas que gasta la persona semanalmente
     */
    public int comparacionBotellas(int botellas) {
        // botellas = cantidad de botellas en una semana

        // dimensiones botella promedio:
        // https://www.remsaplasticos.com/productos/botellas-pet/botella-pet-600ml

        // dimensiones cancha de futból:
        // https://www.cihefe.es/cuadernosdefutbol/2019/01/el-terreno-de-juego-dimensiones/

        // Cantidad de botellas que llenan una cancha: 151,404

        // Si toda la población de Guatemala (16,600,000) gastara la misma cantidad de
        // botellas por semana:
        int botellasPoblacion = (16600000 * botellas);

        int canchasSemana = (botellasPoblacion) / (151404); // Cantidad de canchas de futból que se llenarían por semana
        return canchasSemana;
    }

    
    /** 
     * @param papel
     * @return int
     * Método que compara la cantidad de papel que gasta la persona semanalmente
     */
    public int comparacionPapel(int papel) {
        // papel = cantidad de hojas de papel por semana

        // El libro Don Quijote de la mancha tiene aproximadamente 500 hojas
        // https://www.alohacriticon.com/preguntas/cuantas-paginas-tiene-el-quijote/

        // Las dimensiones de una hoja de un libro son aproximadamente la mitad de una
        // hoja carta
        // https://www.ibm.com/docs/es/cmofm/9.5.0?topic=SSEPCD_9.5.0/com.ibm.ondemand.mp.doc/arsa0449.htm

        int hojasLibro = (papel * 2); // cantidad de consumo semanales
        int tiempo = 500 / hojasLibro; // cantidad de tiempo en semanas que le llevaría imprimir el libro
                                       // Quijote de la Mancha

        return tiempo;
    }

    
    /** 
     * @param tiempo
     * @return int
     * Método que compara la cantidad de agua que gasta la persona semanalmente
     */
    public int comparacionAgua(int tiempo) {
        // tiempo es la cantidad de minutos que tarda la persona en bañarse

        // En promedio se gastan 20 litros de agua si se deja el grifo abierto por 1
        // minuto
        // https://www.tuproyectodevida.es/gasto-agua-ducha/

        // Litros de una piscina tamaño mediano: 108,000
        // https://as.com/juegos_olimpicos/2021/07/23/noticias/1627027620_361156.html

        int litrosDucha = 20 * tiempo;
        int cantidadDuchas = 108000 / litrosDucha;
        int dias = cantidadDuchas; // asumiendo que la persona se baña 1 vez al día
        // cantidad de días que se tardaría en llenar una piscina
        return dias;
    }

    
    /** 
     * @param bolsas
     * @return int
     * Método que compara la cantidad de bolsas que gasta la persona semanalmente
     */
    public int comparacionBolsas(int bolsas) {
        // bolsas = cantidad de bolsas por semana que desecha la persona
        // Dimensiones bolsa de supermercado:
        // http://www.bolsaspolietileno.com/bolsas_camiseta.html
        // Dimensiones cancha de baloncesto:
        // https://www.stadiumsource.com/medidas-de-una-cancha-de-baloncesto-fiba

        // Cantidad de bolsas que llenan una cancha de baloncesto: 4200

        // Si toda la población de Guatemala (16,600,000) gastara la misma cantidad de
        // bolsas por semana:
        int bolsasPoblacion = (16600000 * bolsas);

        int canchasSemana = (bolsasPoblacion) / (4200); // Cantidad de canchas de baloncesto que se llenarian por
                                                          // semana
        return canchasSemana;
    }
    
    /** 
     * @param frutasVerduras
     * @return int
     * Método que compara la cantidad de frutas y verduras que desecha la persona semanalmente
     */

    public int comparacionVerduras(int frutasVerduras) {
        // frutasVerduras = libras de desechos de frutas y verduras a la semana
        // Cantidad de abono por kilo de verduras:
        // https://www.elperiodico.com/es/sociedad/20091025/kilo-residuos-convierte-300-gramos-135579

        int gramosAbono = frutasVerduras * 150; // Cantidad de gramos de abono que puede producir la persona en una
                                                // semana

        return gramosAbono;
    }

    
    /** 
     * @param pollo
     * @param edad
     * @return int
     * Método que compara la cantidad de pollos que consume la persona semanalmente
     */
    public int comparacionPollo(int pollo, int edad) {
        // pollo = libras de pollo que consume la persona a la semana
        // peso de un pollo promedio:
        // https://www.puertasdecastilla.org/cuanto-pesa-un-pollo/

        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasPollos = pollo * semanasEdad; // libras de pollo que ha comido en toda su vida
        int cantidadPollos = librasPollos / 5; // Cantidad de pollos en toda su vida

        return cantidadPollos;
    }

    
    /** 
     * @param carne
     * @param edad
     * @return int
     * Método que compara la cantidad de carne que consume la persona semanalmente
     */
    public int comparacionCarne(int carne, int edad) {
        // carne = libras de carne que consume la persona a la semana
        // peso de una vaca promedio:
        // https://www.agronegocios.co/ganaderia/a-que-edad-y-con-que-peso-se-debe-sacrificar-el-ganado-segun-su-raza-2982496

        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasCarne = carne * semanasEdad; // libras de carne que ha comido en toda su vida
        int cantidadVacas = librasCarne / 11023; // Cantidad de vacas que ha comido en toda su vida
        return cantidadVacas;
    }

    
    /** 
     * @param cerdo
     * @param edad
     * @return int
     * Método que compara la cantidad de cerdos que consume la persona semanalmente
     */
    public int comparacionCerdo(int cerdo, int edad) {
        // cerdo es la cantidad de libras de cerdo que consume la persona
        // peso promedio de un cerdo:
        // https://razasporcinas.com/el-peso-de-los-cerdos-para-ir-a-mercado-sigue-aumentando-a-135-kg/

        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasCerdo = cerdo * semanasEdad; // libras de cerdo que ha comido en toda su vida
        int cantidadCerdo = librasCerdo / 300; // Cantidad de cerdos que ha comido en toda su vida
        return cantidadCerdo;
    }

    
    /** 
     * @param pescado
     * @param edad
     * @return int
     * Método que compara la cantidad de pescado que consume la persona semanalmente
     */
    public int comparacionPescado(int pescado, int edad) {
        // pescado es la cantidad de libras de pescado que consume la persona
        // peso promedio de un pescado:
        // https://pescadordeportivo.net/2017/06/15/cuanto-llega-a-pesar-cada-pez/

        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasPescado = pescado * semanasEdad; // libras de pescado que ha comido en toda su vida
        int cantidadPeces = librasPescado / 5; // cantidad de pescados
        return cantidadPeces;
    }

    
    /** 
     * @param aguaP
     * @param tiempo
     * @param botellasP
     * @param botellas
     * @param papelP
     * @param papel
     * @param bolsasP
     * @param bolsas
     * @param frutasVerdurasP
     * @param frutasVerduras
     * @param polloP
     * @param pollo
     * @param carneP
     * @param carne
     * @param cerdoP
     * @param cerdo
     * @param pescadoP
     * @param pescado
     * @return int[]
     * Método que compara la cantidad de desechos de la persona, con el de una persona promedio
     */
    public int[] comparacionPersonaP(int aguaP, int tiempo, int botellasP, int botellas, int papelP, int papel,
            int bolsasP, int bolsas, int frutasVerdurasP, int frutasVerduras, int polloP, int pollo, int carneP,
            int carne, int cerdoP, int cerdo, int pescadoP, int pescado) {
        int[] comparaciones = new int[9];

        // Comparacion agua
        int litrosDucha = 20 * tiempo; // litros que gasta por mes

        if (litrosDucha <= aguaP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[0] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[0] = 1; // se indica con un uno
        }

        // Comparacion botellas
        if (botellas <= botellasP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[1] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[1] = 1; // se indica con un uno
        }

        // Comparacion Papel
        int papelLibras = (int) (papel * 0.17f);
        if (papelLibras <= papelP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[2] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[2] = 1; // se indica con un uno
        }
        // Comparacion bolsas
        if (bolsas <= bolsasP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[3] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[3] = 1; // se indica con un uno
        }
        // Comparacion frutas y verduras
        if (frutasVerduras <= frutasVerdurasP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[4] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[4] = 1; // se indica con un uno
        }

        // Comparacion pollo
        if (pollo <= polloP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[5] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[5] = 1; // se indica con un uno
        }

        // Comparacion carne
        if (carne <= carneP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[6] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[6] = 1; // se indica con un uno
        }

        // Comparacion cerdo
        if (cerdo <= cerdoP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[7] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[7] = 1; // se indica con un uno
        }
        // Comparacion pescado
        if (pescado <= pescadoP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[8] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[8] = 1; // se indica con un uno
        }
        return comparaciones;
    }
}
