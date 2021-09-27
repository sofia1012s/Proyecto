import java.util.*;

class Vista{
	private Scanner scan;
	
	public Vista(){
		scan = new Scanner(System.in);
	}
/**
*Crea un menu el cual le muestra las opciones y le pide un input al usuario.
*@return opcion que eligio el usuario.
**/
	public int Menu(int opcion){
		String Mensaje = "\nQue desea hacer?\n" + "1. Ingresar consumos orgánicos\n" + "2. Ingresar consumos inorganicos\n" + "3. Ver resultados\n" + "4. Recomendaciones\n" + "5. Salir\n";
		System.out.println(Mensaje);
		opcion = scan.nextInt();
		return opcion;
	}
/**
*Mensaje de bienvenida al usuario.
**/
	public void Saludo(){
		System.out.println("\nBienvenido al programa de concientización sobre el medio ambiente\n" + "El capitalino promedio produce una cantidad de basura de 2 libras por día. Estos desechos se dividen en un 4% de vidrio, 5% de aluminio, 6% de plástico, 11% de papel y cartón y un 68% orgánico. De todos estos desechos el 70% se vuelve inutilizable debido a la humedad que absorben al llegar al basurero. Gonzalez, (2019)\n" + "\nEl programa busca concientizar al usuario sobre el uso y desecho excesivo de los recursos que consume. Haciéndolo de una forma más amigable, con datos que pueda relacionar con su estilo de vida y entender la dimensión del problema.\n" + "A continuación, se realizará una serie de preguntas relacionadas con su consumo de recursos. Con sus respuestas, se le dará una aproximación de cuánto puede llegar a contaminar en cierta cantidad de tiempo y se dimensionarán con ejemplos de qué tan dañino puede llegar a ser ese consumo para que conozca la magnitud del problema.\n");
	}
/**
*Muestra las recomendaciones sobre el consumo de recursos.
**/
	public void Recomendaciones(){
		System.out.println("\n-Reduce tus duchas a menos de 5 minutos si es posible\n" + "\n-Cierra el grifo cuando no lo necesites (al cepillarte los dientes, al enjabonarte, al lavar los platos, etc)\n" + "\n-Reduce los paseos en automóvil y de ser posible compártelo con alguien más\n" + "\n-Considera implementar otras fuentes de proteínas a tu alimentación para disminuir los consumos de carnes\n" + "\n-Investiga como puedes realizar tu propio abono para el jardín, así aprovechas al máximo tus deshechos orgánicos\n" + "\n-Cambia tus bombillas por focos ahorrativos o LEDs\n" + "\n-Busca centros de reciclaje cerca de tu hogar para dejar de tirar las botellas y papel que utilizas\n");
	}
/**
*Le pide el nombre al usuario y guarda la información.
*@return Devuelve el nombre del usuario.
**/
	public String Nombre(){
		String Nombre;
		System.out.println("\nPor favor, ingrese sus datos\n" + "Ingrese su nombre: \n");
		Nombre = scan.nextLine();
		return Nombre;
	}
/**
*Le pide la edad al usuario y guarda la información.
*@return Devuelve la edad del usuario.
**/
	public int Edad(){
		int Edad;
		System.out.println("\nIngrese su edad: \n");
		Edad = scan.nextInt();
		return Edad;
	}
/**
*Le pide al usuario el número de frutas y vegetales que ha consumido y guarda la información.
*@return Devuelve el número que ha consumido.
**/
	public int FV(){
		int FV;
		System.out.println("\nCuántas frutas y verduras has desechado esta última semana? Ingresa la cantidad: \n");
		FV = scan.nextInt();
		return FV;
	}
/**
*Le pide al usuario la cantidad de pollos que ha consumido y guarda la información.
*@return Devuelve el número de pollos que ha consumido.
**/
	public int Pollo(){
		int Pollo;
		System.out.println("\nCuánto carne de pollo has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Pollo = scan.nextInt();
		return Pollo;
	}
/**
*Le pide al usuario la cantidad de carne que ha consumido y guarda la información.
*@return Devuelve el número de carne que ha consumido.
**/
	public int Carne(){
		int Carne;
		System.out.println("\nCuánta carne has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Carne = scan.nextInt();
		return Carne;
	}
/**
*Le pide al usuario la cantidad de carne de cerdo consumido y guarda la información.
*@return Devuelve el número de carne de cerdo que ha consumido.
**/
	public int Cerdo(){
		int Cerdo;
		System.out.println("\nCuánta carne de cerdo has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Cerdo = scan.nextInt();
		return Cerdo;
	}
/**
*Le pide al usuario la cantidad de pescado que ha consumido y guarda la información.
*@return Devuelve el número de pescados que ha consumido
**/
	public int Pescado(){
		int Pescado;
		System.out.println("\nCuánta carne de pescado has consumido esta última semana? Ingresa un aproximado en libras: \n");
		Pescado = scan.nextInt();
		return Pescado;
	}
/**
*Le pregunta al usuario su hace algun tipo de abono. De hacerlo le pide que ingrese 1, de no hacelo le pide que ingrese 2.
*Crea un loop que se detiene hasta que se ingrese 1 o 2.
*@return el valor que el usuario ingrese.
**/
	public int Abono(){
		int Abono = 0;
		while (true){
			System.out.println("\nCon sus desechos orgánicos realiza algún tipo de abono? Si = 1, No = 2\n");
			Abono = scan.nextInt();
			if (Abono == 1){
				System.out.println("");
				break;
			}
			else if (Abono == 2){
				System.out.println("");
				break;
			}
			else {
				System.out.println("\nPor favor ingrese 1 = Si o 2 = No\n");
			}
		}
		return Abono;
	}
/**
*Le pide al usuario la cantidad de botellas desechadas y guarda la información.
*@return Devuelve el número de botellas desechadas.
**/
	public int Botellas(){
		int Botellas;
		System.out.println("\nCuantas botellas has desechado esta ultima semana? Ingresa la cantidad: \n");
		Botellas = scan.nextInt();
		return Botellas;
	}
/**
*Le pide la cantidad de hojas de papel desechadas y guarda la información.
*@return Devuelve el número de hojas de papel desechadas.
**/
	public int Papel(){
		int Papel;
		System.out.println("\nCuantas hojas de papel has usado esta ultima semana? Ingresa la cantidad: \n");
		Papel = scan.nextInt();
		return Papel;
	}
/**
*Le pide el tiempo(Minutos) que se toma en bañar y guarda la información.
*@return Devuelve el número de minutos usados.
**/
	public int Tiempo(){
		int Tiempo;
		System.out.println("\nCuanto tiempo tardas en bañarte? Ingresa la cantidad en minutos: \n");
		Tiempo = scan.nextInt();
		return Tiempo;
	}
/**
*Le pide la cantidad de bolsas que ha desechado y guarda la información.
*@return Devuelve el número de bolsas desechadas.
**/
	public int Bolsas(){
		int Bolsas;
		System.out.println("\nCuantas bolsas plasticas deshechas a la semana? Ingresa la cantidad: \n");
		Bolsas = scan.nextInt();
		return Bolsas;
	}
/**
*Le pide los kilometros que viaja en vehiculo y guarda la información.
*@return Devuelve el número de kilometros.
**/
	public float Viaje(){
		float Viaje;
		System.out.println("\nQué tan lejos viajas en automóvil o motocicleta cada semana? Ingresa la cantidad en km: \n");
		Viaje = scan.nextFloat();
		return Viaje;
	}
/**
*Le pide la cantidad de veces que lava la ropa y guarda la información.
*@return Devuelve el número de lavados.
**/
	public int Lavar(){
		int Lavar;
		System.out.println("\nCuantas veces a la semana lavas tu ropa? Ingresa la cantidad: \n");
		Lavar = scan.nextInt();
		return Lavar;
	}
/**
*Le pregunta si recicla sus desechos y guarda la información.
*@return Devuelve la respuesta del usuario.
**/
	public int Desechos(){
		int Desechos = 0;
		while (true){
			System.out.println("\nRecicla sus desechos inorganicos? Si = 1, No = 2\n");
			Desechos = scan.nextInt();
			if (Desechos == 1){
				System.out.println("");
				break;
			}
			else if (Desechos == 2){
				System.out.println("");
				break;
			}
			else {
				System.out.println("\nPor favor ingrese 1 = Si o 2 = No\n");
			}
		}
		return Desechos;
	}
	public void Resultados(){
		
	}
	public void Division(){
		for(int i = 0; i < 40; i++)
			System.out.println();
	}
	public void Ascii(){
		
	}
}
