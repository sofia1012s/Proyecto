import java.util.*;
public class Controlador{
	
	public static void main(String[] args){
		Vista vis;
		Comparaciones com;
		PersonaPromedio perpro;
		Organico org;
		Inorganico ing;
		Persona per = new Persona();
		
		vis = new Vista();
		vis.Saludo();
		per.setNombre(vis.Nombre());
		per.setEdad(vis.Edad());
		int opcion = 0;
		boolean p = false;
		while(opcion !=5){
			opcion = vis.Menu(opcion);
			switch(opcion){
				case 1:
				org = new Organico();
				do{
					try{
						vis = new Vista();
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
						org.setPescado(vis.Pescado());
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
						vis.Abono();
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
				ing = new Inorganico();
				do{
					try{
						vis = new Vista();
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
						ing.setBolsas(vis.Bolsas());
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
						vis.Desechos();
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
				
				break;
				case 4:
				vis.Recomendaciones();
				break;
			}
		}
	}
}