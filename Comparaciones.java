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

        int canchasSemana = (botellasPoblacion) / (151404); // Cantidad de canchas de futból que se llenarían por semana
        return canchasSemana;
    }

    public int comparacionPapel(int papel) {
        // El libro Don Quijote de la mancha tiene aproximadamente 500 hojas
        // https://www.alohacriticon.com/preguntas/cuantas-paginas-tiene-el-quijote/

        // Las dimensiones de una hoja de un libro son aproximadamente la mitad de una
        // hoja carta
        // https://www.ibm.com/docs/es/cmofm/9.5.0?topic=SSEPCD_9.5.0/com.ibm.ondemand.mp.doc/arsa0449.htm

        int hojasLibro = (papel * 2); // cantidad de consumo semanales o mensuales (falta ver eso)
        int tiempo = 500 / hojasLibro; // cantidad de tiempo en semanas o meses que le llevaría imprimir el libro
                                       // Quijote de la Mancha

        return tiempo;
    }

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

    public int comparacionBolsas(int bolsas) {
        // bolsas es la cantidad de bolsas que desecha la persona por semana o mes
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

    public int comparacionCarro(int km) {
        // km es la cantidad de kilometros que viaja la persona en carro por semana o
        // día
        // Consumo de un carro promedio:
        // https://www.zoilorios.com/noticias/cuantos-litros-de-gasolina-se-gasta-por-kilometro-recorrido
        // Cantidad de CO2 que produce un litro de gasolina:
        // https://www.elportalinmobiliario.com.mx/articulos/que-contamina-mas-el-diesel-o-la-gasolina

        float litros = 0.083f * km; // Cantidad de litros por semana o día
        float CO2 = litros * 2.42f; // Cantidad de kilogramos de CO2 que producen

        // Peso promedio de una persona:
        // https://www.analesdepediatria.org/es-valoracion-del-peso-talla-e-articulo-S1695403310002079

        int personas = (int) (CO2 / 58f); // Peso equivalente al de x personas en Kg

        return personas;
    }

    public int comparacionVerduras(int frutasVerduras) {
        // frutasVerduras es la cantidad de libras de desechos de frutas y verduras que
        // desecha la persona
        // Cantidad de abono por kilo de verduras:
        // https://www.elperiodico.com/es/sociedad/20091025/kilo-residuos-convierte-300-gramos-135579

        int gramosAbono = frutasVerduras * 150; // Cantidad de gramos de abono que puede producir la persona

        return gramosAbono;
    }

    public int comparacionPollo(int pollo) {
        // pollo es la cantidad de libras de pollo que consume la persona
        // peso de un pollo promedio:
        // https://www.puertasdecastilla.org/cuanto-pesa-un-pollo/

        int cantidadPollos = pollo / 5; // Cantidad de pollos
        return cantidadPollos;
    }

    public int comparacionCarne(int carne) {
        // carne es la cantidad de libras de carne que consume la persona
        // peso de una vaca promedio:
        // https://www.agronegocios.co/ganaderia/a-que-edad-y-con-que-peso-se-debe-sacrificar-el-ganado-segun-su-raza-2982496

        int cantidadVacas = carne / 11023; // Cantidad de vacas
        return cantidadVacas;
    }

    public int comparacionCerdo(int cerdo) {
        // cerdo es la cantidad de libras de cerdo que consume la persona
        // peso promedio de un cerdo:
        // https://razasporcinas.com/el-peso-de-los-cerdos-para-ir-a-mercado-sigue-aumentando-a-135-kg/

        int cantidadCerdo = cerdo / 300; // Cantidad de cerdos
        return cantidadCerdo;
    }

    public int comparacionPescado(int pescado) {
        // pescado es la cantidad de libras de pescado que consume la persona
        // peso promedio de un pescado:
        // https://pescadordeportivo.net/2017/06/15/cuanto-llega-a-pesar-cada-pez/

        int cantidadPeces = pescado / 5; // cantidad de pescados
        return cantidadPeces;
    }

    public int comparacionPersonaP(int cantidadPromedio) {
        int aguaP = personaP.getAguaPromedio();
        int botellasP = personaP.getBotellasPromedio();
        int papelP = personaP.getPapelPromedio();
        int bolsasP = personaP.getBolsasPromedio();
        int frutasVerdurasP = personaP.getFrutasVerdurasPromedio();
        int polloP = personaP.getPolloPromedio();
        int carneP = personaP.getCarnePromedio();
        int cerdoP = personaP.getCerdoPromedio();
        int pescadoP = personaP.getPescadossPromedio();

        return cantidadPromedio;
    }
}
