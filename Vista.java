import java.util.*;

class Vista {
	private Scanner scan;

	public Vista() {
		scan = new Scanner(System.in);
	}

	/**
	 * Crea un menu el cual le muestra las opciones y le pide un input al usuario.
	 * 
	 * @return opcion que eligio el usuario.
	 **/
	public int Menu(int opcion) {
		String Mensaje = "\nQue desea hacer?\n" + "1. Ingresar consumos orgánicos\n"
				+ "2. Ingresar consumos inorganicos\n 3. Salir\n";
		System.out.println(Mensaje);
		opcion = scan.nextInt();
		return opcion;
	}
	//"3. Ver resultados\n" + "4. Recomendaciones\n"
	/**
	 * Hace print el mensaje que se escribe en esta.
	 **/
	public void Print(String M) {
		System.out.println(M);
	}

	/**
	 * Mensaje de bienvenida al usuario.
	 **/
	public void Saludo() {
		System.out.println("\nBienvenido al programa de concientización sobre el medio ambiente\n"
				+ "El capitalino promedio produce una cantidad de basura de 2 libras por día. Estos desechos se dividen en un 4% de vidrio, 5% de aluminio, 6% de plástico, 11% de papel y cartón y un 68% orgánico. De todos estos desechos el 70% se vuelve inutilizable debido a la humedad que absorben al llegar al basurero. Gonzalez, (2019)\n"
				+ "\nEl programa busca concientizar al usuario sobre el uso y desecho excesivo de los recursos que consume. Haciéndolo de una forma más amigable, utilizaremos datos que pueda relacionar con su estilo de vida y entender la dimensión del problema.\n"
				+ "A continuación, se realizará una serie de preguntas relacionadas con su consumo de recursos. Con sus respuestas, se le dará una aproximación de cuánto puede llegar a contaminar en cierta cantidad de tiempo y se dimensionarán con ejemplos de qué tan dañino puede llegar a ser ese consumo para que conozca la magnitud del problema.\n");
	}

	/**
	 * Muestra las recomendaciones sobre el consumo de recursos. Fuentes:
	 * https://www.directoalpaladar.com/salud/proteina-no-solo-esta-carne-27-alimentos-vegetales-buen-aporte-proteico
	 * https://www.ecologiaverde.com/como-hacer-abono-organico-casero-para-plantas-1275.html
	 * 11
	 **/
	public void Recomendaciones() {
		String[] Recomendaciones = new String[] {
				"\n-Reduce tus duchas al menor tiempo posible para no gastar el agua.\n",
				"\n-Cierra el grifo cuando no lo necesites (al cepillarte los dientes, al enjabonarte, al lavar los platos, etc)\n",
				"\n-Reduce los paseos en automóvil, compartiendo el transporte con alguien más o disminuyendo los viajes inecesarios.\n",
				"\n-Considera implementar otras fuentes de proteínas a tu alimentación para disminuir los consumos de carnes."
						+ "\nAquí hay algunos alimentos que podrías incluir en tu dieta: "
						+ "\nlentejas, tofu, avena, soya, semillas de calabaza o de girasol, habas, garbanzos, pistachos, quinoa, brocoli.\n",
				"\n-Considera realizar tu propio abono orgánico con los siguientes sencillos pasos: "
						+ "\n1)Realiza agujeros en la superficie inferior de un contenedor."
						+ "\n2)Agrega un poco de tierra para cubrir el fondo del contenedor."
						+ "\n3)Añade todos tus desechos orgánicos (cáscaras de huevo, restos de frutas y verduras, restos de café, etc). \nEs importante que no sean desechos procedentes de ningún producto animal."
						+ "\n4)Cuando el contenedor ya casi se encuentre lleno, cubre los desechos con un poco de tierra y mezcla bien todo con una pala. \nDe esta forma, ya posees tu propio abono casero!"
						+ "\nEs importante que cada dos semanas, mezcla bien con una pala llevando los restos que están abajo a la superficie y viceversa. Este paso es importante para airear nuestro abono casero.\n",
				"\n-Cambia tus bombillas por focos ahorrativos o LEDs\n",
				"\n-Busca centros de reciclaje cerca de tu hogar para depositar todas las botellas y papel que utilizas\n",
				"\n-Consume productos ecológicos, no solo los puedes encontrar en alimentación, también en limpieza, moda o cosmética.\n",
				"\n-Utiliza bolsas reciclables cuando vayas a comprar.\n",
				"\n-Evita los productos envasados en plástico, utiliza los que están envasados en papel, cartón o vidrio.\n",
				"\n-Compra productos a granel como legumbres, frutos secos, jabones etc.\n",
				"\n-Antes de desechar ropa, accesorios, libros, juguetes, aparatos electrónicos en buen estado e incluso recipientes de vidrio, cartón y latas, piensa en cómo darles un nuevo uso. \n" };

		int rnd1 = new Random().nextInt(Recomendaciones.length);
		int rnd2 = new Random().nextInt(Recomendaciones.length);
		int rnd3 = new Random().nextInt(Recomendaciones.length);

		System.out.println(Recomendaciones[rnd1] + Recomendaciones[rnd2] + Recomendaciones[rnd3]);

	}

	/**
	 * Le pide el nombre al usuario y guarda la información.
	 * 
	 * @return Devuelve el nombre del usuario.
	 **/
	public String Nombre() {
		String Nombre;
		System.out.println("\nPor favor, ingrese sus datos\n" + "Ingrese su nombre: \n");
		Nombre = scan.nextLine();
		return Nombre;
	}

	/**
	 * Le pide la edad al usuario y guarda la información.
	 * 
	 * @return Devuelve la edad del usuario.
	 **/
	public int Edad() {
		int Edad;
		System.out.println("\nIngrese su edad: \n");
		Edad = scan.nextInt();
		return Edad;
	}

	/**
	 * Le pide al usuario el número de frutas y vegetales que ha consumido y guarda
	 * la información.
	 * 
	 * @return Devuelve el número que ha consumido.
	 **/
	public int FV() {
		int FV;
		System.out.println(
				"\nCuántas frutas y verduras has desechado esta última semana? Ingresa la cantidad en libras: \n");
		FV = scan.nextInt();
		return FV;
	}

	/**
	 * Le pide al usuario la cantidad de pollos que ha consumido y guarda la
	 * información.
	 * 
	 * @return Devuelve el número de pollos que ha consumido.
	 **/
	public int Pollo() {
		int Pollo;
		System.out.println(
				"\nCuánto carne de pollo has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Pollo = scan.nextInt();
		return Pollo;
	}

	/**
	 * Le pide al usuario la cantidad de carne que ha consumido y guarda la
	 * información.
	 * 
	 * @return Devuelve el número de carne que ha consumido.
	 **/
	public int Carne() {
		int Carne;
		System.out.println("\nCuánta carne has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Carne = scan.nextInt();
		return Carne;
	}

	/**
	 * Le pide al usuario la cantidad de carne de cerdo consumido y guarda la
	 * información.
	 * 
	 * @return Devuelve el número de carne de cerdo que ha consumido.
	 **/
	public int Cerdo() {
		int Cerdo;
		System.out.println(
				"\nCuánta carne de cerdo has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Cerdo = scan.nextInt();
		return Cerdo;
	}

	/**
	 * Le pide al usuario la cantidad de pescado que ha consumido y guarda la
	 * información.
	 * 
	 * @return Devuelve el número de pescados que ha consumido
	 **/
	public int Pescado() {
		int Pescado;
		System.out.println(
				"\nCuánta carne de pescado has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Pescado = scan.nextInt();
		return Pescado;
	}

	/**
	 * Le pide al usuario la cantidad de botellas desechadas y guarda la
	 * información.
	 * 
	 * @return Devuelve el número de botellas desechadas.
	 **/
	public int Botellas() {
		int Botellas;
		System.out.println("\nCuantas botellas has desechado esta ultima semana? Ingresa la cantidad: \n");
		Botellas = scan.nextInt();
		return Botellas;
	}

	/**
	 * Le pide la cantidad de hojas de papel desechadas y guarda la información.
	 * 
	 * @return Devuelve el número de hojas de papel desechadas.
	 **/
	public int Papel() {
		int Papel;
		System.out.println("\nCuantas hojas de papel has usado esta ultima semana? Ingresa la cantidad: \n");
		Papel = scan.nextInt();
		return Papel;
	}

	/**
	 * Le pide el tiempo(Minutos) que se toma en bañar y guarda la información.
	 * 
	 * @return Devuelve el número de minutos usados.
	 **/
	public int Tiempo() {
		int Tiempo;
		System.out.println("\nCuanto tiempo tardas en bañarte? Ingresa la cantidad en minutos: \n");
		Tiempo = scan.nextInt();
		return Tiempo;
	}

	/**
	 * Le pide la cantidad de bolsas que ha desechado y guarda la información.
	 * 
	 * @return Devuelve el número de bolsas desechadas.
	 **/
	public int Bolsas() {
		int Bolsas;
		System.out.println("\nCuantas bolsas plasticas deshechas a la semana? Ingresa la cantidad: \n");
		Bolsas = scan.nextInt();
		return Bolsas;
	}

	/**
	 * Le pide los kilometros que viaja en vehiculo y guarda la información.
	 * 
	 * @return Devuelve el número de kilometros.
	 **/
	public float Viaje() {
		float Viaje;
		System.out.println(
				"\nQué tan lejos viajas en automóvil o motocicleta cada semana? Ingresa la cantidad en km: \n");
		Viaje = scan.nextFloat();
		return Viaje;
	}

	/**
	 * Le pide la cantidad de veces que lava la ropa y guarda la información.
	 * 
	 * @return Devuelve el número de lavados.
	 **/
	public int Lavar() {
		int Lavar;
		System.out.println("\nCuantas veces a la semana lavas tu ropa? Ingresa la cantidad: \n");
		Lavar = scan.nextInt();
		return Lavar;
	}

	/**
	 * Le enseña al usuario los resultados de la comparacion
	 * 
	 * @param dos Strings con mensaje y un int.
	 **/
	public void Resultados(String Con, int Num, String Con2) {
		System.out.println(Con + Num + Con2);
	}

	/**
	 * Para crear espacios o para despejar entre cada acción.
	 **/
	public void Division(int a) {
		for (int i = 0; i < a; i++)
			System.out.println();
	}
}
