import java.util.*;
public class Controlador{
	
	public static void main(String[] args){
		Vista vis = new Vista();
		PersonaPromedio pp = new PersonaPromedio();
		Organico org = new Organico();
		Inorganico ing = new Inorganico();
		Persona per = new Persona();
		Comparaciones com = new Comparaciones();
		
		vis.Saludo();
		per.setNombre(vis.Nombre());
		int opcion = 0;
		boolean p = false;
		do{
			try{
				vis = new Vista();
				per.setEdad(vis.Edad());
				p = true;
			}
			catch(InputMismatchException ex){
				System.out.println("\nPor favor, ingrese un numero.\n");
				p = false;
			}
			catch(Exception e){
				System.out.println("\nHubo un error, por favor intente otra opcion.\n");
				p = false;
			}
		}while(!p);
		vis.Division(40);
		while(opcion !=5){
			opcion = vis.Menu(opcion);
			switch(opcion){
				case 1:
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						org.setFV(vis.FV());
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero.\n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.\n");
						p = false;
					}
				}while(!p);
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						org.setPollo(vis.Pollo());
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero.\n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.\n");
						p = false;
					}
				}while(!p);
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						org.setCerdo(vis.Cerdo());
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero. \n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.\n");
						p = false;
					}
				} while(!p);
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						org.setPescado(vis.Pescado());
						vis.Division(40);
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero. \n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.\n");
						p = false;
					}
				} while(!p);
				break;
				case 2:
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						ing.setBotellas(vis.Botellas());
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero. \n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.");
						p = false;
					}
				} while(!p);
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						ing.setPapel(vis.Papel());
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero. \n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.");
						p = false;
					}
				} while(!p);
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						ing.setTiempo(vis.Tiempo());
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero. \n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.");
						p = false;
					}
				} while(!p);
				do{
					try{
						vis = new Vista();
						vis.Division(40);
						ing.setBolsas(vis.Bolsas());
						vis.Division(40);
						p = true;
					}
					catch(InputMismatchException ex){
						System.out.println("\nPor favor, ingrese un numero. \n");
						p = false;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, por favor intente de nuevo.");
						p = false;
					}
				} while(!p);
				break;
				case 3:
				do{
					try{
						com.comparacionBotellas(ing.getBotellas());
						com.comparacionPapel(ing.getPapel());
						com.comparacionAgua(ing.getTiempo());
						com.comparacionBolsas(ing.getBolsas());
						vis.Division(40);
						System.out.println("\nResultados: \n");
						vis.Resultados("\nSi toda la poblacion de Guatemala (16,600,000) gastara la misma cantidad de botellas por semana, se llenarian: ",com.comparacionBotellas(ing.getBotellas())," canchas de futbol cada semana.");
						vis.Resultados("\nCon la cantidad de hojas que gasta por semana se podrian hacer:",com.comparacionPapel(ing.getPapel())," libros.");
						vis.Resultados("\nEl tiempo que tardas bañandote podria llenar una piscina en: ",com.comparacionAgua(ing.getTiempo())," dias.");
						vis.Resultados("\nCon la cantidad de bolsas que tiras por semana llenarias: ",com.comparacionBolsas(ing.getBolsas())," canchas de baloncesto cada semana.");
						vis.Division(2);
						int[] A;
						String[] B = {"agua","botellas","papel","bolsas","frutas y verduras","pollo","carne","cerdo","pescado"};
						A = com.comparacionPersonaP(pp.getAguaPromedio(),ing.getTiempo(),pp.getBotellasPromedio(),ing.getBotellas(),pp.getPapelPromedio(),ing.getPapel(),pp.getBolsasPromedio(),ing.getBolsas(),pp.getFrutasVerdurasPromedio(),org.getFrutasVerduras(),pp.getPolloPromedio(),org.getPollo(),pp.getCarnePromedio(),org.getCarne(),pp.getCerdoPromedio(),org.getCerdo(),pp.getPescadossPromedio(),org.getPescado());
						for(int i = 0; i < A.length; i++){
							if(A[i] == 1){
								System.out.println("Su consumo de " + B[i] + " es mayor que el de la persona promedio.\n");
							}
							else{
								System.out.println("Su consumo de " + B[i] + " esta por debajo del de la persona promedio.\n");
							}
						}
						p = true;
					}
					catch(ArithmeticException ex){
						vis.Division(40);
						System.out.println("\nRecordatorio: \n \nSi desea obtener los resultados por favor, ingrese los consumos organicos e inorganicos.\n");
						break;
					}
					catch(Exception e){
						System.out.println("\nHubo un error, intente de nuevo.\n");
						break;
					}
				}while(!p);
				break;
				case 4:
				vis.Division(40);
				System.out.println("\nRecomendaciones: \n");
				vis.Recomendaciones();
				break;
			}
		}
	}
}
