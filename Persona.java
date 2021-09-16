import java.util.Scanner;

class Persona{
    Scanner scan = new Scanner(System.in);

    private String Nombre = "";
    private int Edad = 0;

    Nombre = scan.nextLine();
    Edad = scan.nextInt();

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }
}