public class Comparaciones {

    private Inorganico inorganico;
    private Organico organico;
    private PersonaPromedio personaP;
    private Persona persona;

    public int comparacionBotellas() {
        int botellas = inorganico.getBotellas();
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

    public int comparacionPapel() {
        int papel = inorganico.getPapel();
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

    public int comparacionAgua() {
        int tiempo = inorganico.getTiempo();
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

    public int comparacionBolsas() {
        int bolsas = inorganico.getBolsas();
        // bolsas = cantidad de bolsas por semana que desecha la persona
        // Dimensiones bolsa de supermercado:
        // http://www.bolsaspolietileno.com/bolsas_camiseta.html
        // Dimensiones cancha de baloncesto:
        // https://www.stadiumsource.com/medidas-de-una-cancha-de-baloncesto-fiba

        // Cantidad de bolsas que llenan una cancha de baloncesto: 4200

        // Si toda la población de Guatemala (16,600,000) gastara la misma cantidad de
        // bolsas por semana:
        int botellasPoblacion = (16600000 * bolsas);

        int canchasSemana = (botellasPoblacion) / (4200); // Cantidad de canchas de baloncesto que se llenarian por
                                                          // semana
        return canchasSemana;
    }
    /*
     * public int comparacionCarro() { int km = inorganico.getkm(); // km =
     * kilometros que viaja la persona en carro por semana
     * 
     * // Consumo de un carro promedio: //
     * https://www.zoilorios.com/noticias/cuantos-litros-de-gasolina-se-gasta-por-
     * kilometro-recorrido // Cantidad de CO2 que produce un litro de gasolina: //
     * https://www.elportalinmobiliario.com.mx/articulos/que-contamina-mas-el-diesel
     * -o-la-gasolina
     * 
     * float litros = 0.083f * km; // Cantidad de litros por semana float CO2 =
     * litros * 2.42f; // Cantidad de kilogramos de CO2 que producen por
     * 
     * // Peso promedio de una persona: //
     * https://www.analesdepediatria.org/es-valoracion-del-peso-talla-e-articulo-
     * S1695403310002079
     * 
     * int personas = (int) (CO2 / 58f); // Peso equivalente al de x personas en Kg
     * en 1 semana
     * 
     * return personas; }
     */

    public int comparacionVerduras() {
        int frutasVerduras = organico.getFrutasVerduras();
        // frutasVerduras = libras de desechos de frutas y verduras a la semana
        // Cantidad de abono por kilo de verduras:
        // https://www.elperiodico.com/es/sociedad/20091025/kilo-residuos-convierte-300-gramos-135579

        int gramosAbono = frutasVerduras * 150; // Cantidad de gramos de abono que puede producir la persona en una
                                                // semana

        return gramosAbono;
    }

    public int comparacionPollo() {
        int pollo = organico.getPollo();
        // pollo = libras de pollo que consume la persona a la semana
        // peso de un pollo promedio:
        // https://www.puertasdecastilla.org/cuanto-pesa-un-pollo/

        int edad = persona.getEdad(); // edad de la persona
        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasPollos = pollo * semanasEdad; // libras de pollo que ha comido en toda su vida
        int cantidadPollos = librasPollos / 5; // Cantidad de pollos en toda su vida

        return cantidadPollos;
    }

    public int comparacionCarne() {
        int carne = organico.getCarne();
        // carne = libras de carne que consume la persona a la semana
        // peso de una vaca promedio:
        // https://www.agronegocios.co/ganaderia/a-que-edad-y-con-que-peso-se-debe-sacrificar-el-ganado-segun-su-raza-2982496

        int edad = persona.getEdad(); // edad de la persona
        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasCarne = carne * semanasEdad; // libras de carne que ha comido en toda su vida
        int cantidadVacas = librasCarne / 11023; // Cantidad de vacas que ha comido en toda su vida
        return cantidadVacas;
    }

    public int comparacionCerdo() {
        int cerdo = organico.getCerdo();
        // cerdo es la cantidad de libras de cerdo que consume la persona
        // peso promedio de un cerdo:
        // https://razasporcinas.com/el-peso-de-los-cerdos-para-ir-a-mercado-sigue-aumentando-a-135-kg/

        int edad = persona.getEdad(); // edad de la persona
        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasCerdo = cerdo * semanasEdad; // libras de cerdo que ha comido en toda su vida
        int cantidadCerdo = librasCerdo / 300; // Cantidad de cerdos que ha comido en toda su vida
        return cantidadCerdo;
    }

    public int comparacionPescado() {
        int pescado = organico.getPescado();
        // pescado es la cantidad de libras de pescado que consume la persona
        // peso promedio de un pescado:
        // https://pescadordeportivo.net/2017/06/15/cuanto-llega-a-pesar-cada-pez/

        int edad = persona.getEdad(); // edad de la persona
        int semanasEdad = edad * 52; // edad de la persona en semanas
        int librasPescado = pescado * semanasEdad; // libras de pescado que ha comido en toda su vida
        int cantidadPeces = librasPescado / 5; // cantidad de pescados
        return cantidadPeces;
    }

    public int[] comparacionPersonaP() {
        int[] comparaciones = new int[8];

        // Comparacion agua
        int aguaP = personaP.getAguaPromedio(); // Litros al mes persona promedio
        int tiempo = inorganico.conversionAgua(); // tiempo que tarda en bañarse la persona al mes
        int litrosDucha = 20 * tiempo; // litros que gasta por mes

        if (litrosDucha <= aguaP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[0] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[0] = 1; // se indica con un uno
        }

        // Comparacion botellas
        int botellasP = personaP.getBotellasPromedio(); // botellas al mes persona promedio
        int botellas = inorganico.getBotellas(); // botellas al mes persona
        if (botellas <= botellasP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[1] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[1] = 1; // se indica con un uno
        }

        // Comparacion Papel
        int papelP = personaP.getPapelPromedio(); // papel al mes persona promedio
        int papel = inorganico.conversionPapel(); // papel al mes persona
        if (papel <= papelP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[2] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[2] = 1; // se indica con un uno
        }
        // Comparacion bolsas
        int bolsasP = personaP.getBolsasPromedio(); // bolsas al mes persona promedio
        int bolsas = inorganico.conversionBolsas(); // bolsas al mes persona
        if (bolsas <= bolsasP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[3] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[3] = 1; // se indica con un uno
        }
        // Comparacion frutas y verduras
        int frutasVerdurasP = personaP.getFrutasVerdurasPromedio(); // Libras al mes persona promedio
        int frutasVerduras = organico.conversionFrutasVerduras(); // Libras al mes persona
        if (frutasVerduras <= frutasVerdurasP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[4] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[4] = 1; // se indica con un uno
        }

        // Comparacion pollo
        int polloP = personaP.getPolloPromedio(); // Libras al mes persona promedio
        int pollo = organico.conversionPollo(); // Libras al mes persona
        if (pollo <= polloP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[5] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[5] = 1; // se indica con un uno
        }

        // Comparacion carne
        int carneP = personaP.getCarnePromedio(); // Libras al mes persona promedio
        int carne = organico.conversionCarne(); // Libras al mes persona
        if (carne <= carneP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[6] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[6] = 1; // se indica con un uno
        }

        // Comparacion cerdo
        int cerdoP = personaP.getCerdoPromedio(); // Libras al mes persona promedio
        int cerdo = organico.conversionCerdos(); // Libras al mes persona
        if (cerdo <= cerdoP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[7] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[7] = 1; // se indica con un uno
        }
        // Comparacion pescado
        int pescadoP = personaP.getPescadossPromedio(); // Libras al mes persona promedio
        int pescado = organico.conversionPescados(); // Libras al mes persona
        if (pescado <= pescadoP) { // si su consumo es menor o igual al de una persona promedio
            comparaciones[8] = 0; // se indica con un cero
        } else { // de lo contrario, si su consumo es mayor
            comparaciones[8] = 1; // se indica con un uno
        }
        return comparaciones;
    }
}
