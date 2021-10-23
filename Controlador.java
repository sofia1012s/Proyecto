
/******************************************************************************
 * Controlador.java
 * 
 * @author Taewung Heo
 * @author Héctor de León
 * @author Jeremy Mejía
 * @author Sofía Salguero
 * @version 21/10/2021 
 * 
 * Clase Controlador, se encarga de unir las distintas clases para tener 
 * el código completo funcional
 ******************************************************************************/
import java.util.*;

public class Controlador {

	/**
	 * @param args 
	 * Método main para ejecutar
	 */
	public static void main(String[] args) {
		Vista vis = new Vista();
		PersonaPromedio pp = new PersonaPromedio();
		Organico org = new Organico();
		Inorganico ing = new Inorganico();
		Persona per = new Persona();
		Comparaciones com = new Comparaciones();
		tipoBasura basura = new tipoBasura();
		int Organico = 0;
		int Inorganico = 0;

		vis.Saludo();
		per.setNombre(vis.Nombre());
		int opcion = 0;
		boolean p = false;
		do {
			try {
				vis = new Vista();
				per.setEdad(vis.Edad());
				p = true;
			} catch (InputMismatchException ex) {
				System.out.println("\nPor favor, ingrese un numero.\n");
				p = false;
			} catch (Exception e) {
				System.out.println("\nHubo un error, por favor intente otra opcion.\n");
				p = false;
			}
		} while (!p);
		vis.Division(40);
		while (opcion != 6) {
			// if para eliminar opciones que ya se usaron
			if (Organico == 0 && Inorganico == 0) {

				do {
					try {
						vis = new Vista();
						opcion = vis.Menu(opcion);
						// ifs para cambiar el estado de los int Organico e inorganico
						if (opcion == 1) {
							Organico = 1;
						}
						if (opcion == 2) {
							Inorganico = 1;
						}
						p = true;
					} catch (InputMismatchException ex) {
						vis.Division(40);
						System.out.println("\nPor favor, ingrsar un numero\n");
						p = false;
					}
				} while (!p);
				switch (opcion) {
				case 1:
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setFV(vis.FV());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero.\n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setPollo(vis.Pollo());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero.\n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setCerdo(vis.Cerdo());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setPescado(vis.Pescado());
							vis.Division(40);
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					break;
				case 2:
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setBotellas(vis.Botellas());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setPapel(vis.Papel());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setTiempo(vis.Tiempo());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setBolsas(vis.Bolsas());
							vis.Division(40);
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					break;
				case 3:
					vis.Bibliografia();
					break;

				case 4:
					opcion = 6;

				}

			}

			if (Organico == 1 && Inorganico == 0) {

				do {
					try {
						vis = new Vista();
						opcion = vis.Menu2(opcion);
						// ifs para cambiar el estado de los int Organico e inorganico
						if (opcion == 1) {
							Inorganico = 1;
						}
						p = true;
					} catch (InputMismatchException ex) {
						vis.Division(40);
						System.out.println("\nPor favor, ingrsar un numero\n");
						p = false;
					}
				} while (!p);
				switch (opcion) {
				case 1:
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setBotellas(vis.Botellas());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setPapel(vis.Papel());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setTiempo(vis.Tiempo());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							ing.setBolsas(vis.Bolsas());
							vis.Division(40);
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.");
							p = false;
						}
					} while (!p);
					break;
				case 2:
					vis.Bibliografia();
					break;
				case 3:
					opcion = 6;
				}

			}

			if (Organico == 0 && Inorganico == 1) {

				do {
					try {
						vis = new Vista();
						opcion = vis.Menu3(opcion);
						// ifs para cambiar el estado de los int Organico e inorganico
						if (opcion == 1) {
							Organico = 1;
						}
						p = true;
					} catch (InputMismatchException ex) {
						vis.Division(40);
						System.out.println("\nPor favor, ingrsar un numero\n");
						p = false;
					}
				} while (!p);
				switch (opcion) {
				case 1:
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setFV(vis.FV());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero.\n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setPollo(vis.Pollo());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero.\n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setCerdo(vis.Cerdo());
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					do {
						try {
							vis = new Vista();
							vis.Division(40);
							org.setPescado(vis.Pescado());
							vis.Division(40);
							p = true;
						} catch (InputMismatchException ex) {
							System.out.println("\nPor favor, ingrese un numero. \n");
							p = false;
						} catch (Exception e) {
							System.out.println("\nHubo un error, por favor intente de nuevo.\n");
							p = false;
						}
					} while (!p);
					break;

				case 2:
					vis.Bibliografia();
					break;
				case 3:
					opcion = 6;
				}

			}

			if (Organico == 1 && Inorganico == 1) {

				do {
					try {
						vis = new Vista();
						opcion = vis.Menu4(opcion);
						p = true;
					} catch (InputMismatchException ex) {
						vis.Division(40);
						System.out.println("\nPor favor, ingrsar un numero\n");
						p = false;
					}
				} while (!p);
				switch (opcion) {
				case 1:
					do {
						try {
							com.comparacionBotellas(ing.getBotellas());
							com.comparacionPapel(ing.getPapel());
							com.comparacionAgua(ing.getTiempo());
							com.comparacionBolsas(ing.getBolsas());
							vis.Division(40);
							System.out.println("\nResultados: \n");
							vis.Resultados(
									"\nSi toda la poblacion de Guatemala (16,600,000) gastara la misma cantidad de botellas por semana, se llenarian: ",
									com.comparacionBotellas(ing.getBotellas()), " canchas de futbol cada semana.");
							vis.Resultados("\nCon la cantidad de hojas que gasta por semana, se tardaría: ",
									com.comparacionPapel(ing.getPapel()),
									" semanas en imprimir el libro Quijote de la Mancha");
							vis.Resultados("\nEl tiempo que tardas bañandote podria llenar una piscina en: ",
									com.comparacionAgua(ing.getTiempo()), " dias.");
							vis.Resultados(
									"\nSi toda la poblacion de Guatemala (16,600,000) gastara la misma cantidad de bolsas por semana, se llenarian: ",
									com.comparacionBolsas(ing.getBolsas()), " canchas de baloncesto cada semana.");
							vis.Division(2);
							int[] A;
							String[] B = { "agua", "botellas", "papel", "bolsas", "frutas y verduras", "pollo", "carne",
									"cerdo", "pescado" };
							A = com.comparacionPersonaP(pp.getAguaPromedio(), ing.conversionAgua(),
									pp.getBotellasPromedio(), basura.conversionMes(ing.getBotellas()),
									pp.getPapelPromedio(), basura.conversionMes(ing.getPapel()), pp.getBolsasPromedio(),
									basura.conversionMes(ing.getBolsas()), pp.getFrutasVerdurasPromedio(),
									basura.conversionMes(org.getFrutasVerduras()), pp.getPolloPromedio(),
									basura.conversionMes(org.getPollo()), pp.getCarnePromedio(),
									basura.conversionMes(org.getCarne()), pp.getCerdoPromedio(),
									basura.conversionMes(org.getCerdo()), pp.getPescadossPromedio(),
									basura.conversionMes(org.getCerdo()));
							for (int i = 0; i < A.length; i++) {
								if (A[i] == 1) {
									System.out.println(
											"Su consumo de " + B[i] + " es mayor que el de la persona promedio.\n");
								} else {
									System.out.println(
											"Su consumo de " + B[i] + " esta por debajo del de la persona promedio.\n");
								}
							}
							p = true;
						} catch (ArithmeticException ex) {
							vis.Division(40);
							System.out.println(
									"\nRecordatorio: \n \nSi desea obtener los resultados por favor, ingrese los consumos organicos e inorganicos.\n");
							break;
						} catch (Exception e) {
							System.out.println("\nHubo un error, intente de nuevo.\n");
							break;
						}
					} while (!p);
					break;
				case 2:
					vis.Division(40);
					System.out.println("\nRecomendaciones: \n");
					vis.Recomendaciones();
					break;

				case 3:
					vis.Bibliografia();
					break;
				case 4:
					opcion = 6;
				}

			}

		}
	}
}
