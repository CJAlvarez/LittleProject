package third;

public class Grabacion {
    
    private int codCancion;
    private int tipo;
    private int ID;

    public Grabacion(int codCancion, int tipo, int ID) {
        this.codCancion = codCancion;
        this.tipo = tipo;
        this.ID = ID;
    }

    public int getCodCancion() {
        return codCancion;
    }

    public void setCodCancion(int codCancion) {
        this.codCancion = codCancion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Grabacion{" + "codCancion=" + codCancion + ", tipo=" + tipo + ", ID=" + ID + '}';
    }
}
