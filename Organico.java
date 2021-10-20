//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************

public class Organico extends tipoBasura{

    // *****************************************************************************
    // variables
    // *****************************************************************************
    private int frutasVerduras;
    private int pollo;
    private int carne;
    private int cerdos;
    private int pescado;
    private int cuatroSemanas = 4;

    // *****************************************************************************
    // Metodos
    // *****************************************************************************
    public int getFrutasVerduras() {
        return frutasVerduras;
    }

    public int getPollo() {
        return pollo;
    }

    public int getCarne() {
        return carne;
    }

    public int getCerdo() {
        return cerdos;
    }

    public int getPescado() {
        return pescado;
    }

    public void setFV(int frutasVerduras) {
        this.frutasVerduras = frutasVerduras;
    }

    public void setPollo(int pollo) {
        this.pollo = pollo;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public void setCerdo(int cerdos) {
        this.cerdos = cerdos;
    }

    public void setPescado(int pescado) {
        this.pescado = pescado;
    }

}
