package third;

public class Partitura {
    
    private int codCancion;
    private String origen;
    private double precio;
    private String letra;

    public Partitura(int codCancion, String origen, double precio, String letra) {
        this.codCancion = codCancion;
        this.origen = origen;
        this.precio = precio;
        this.letra = letra;
    }

    public int getCodCancion() {
        return codCancion;
    }

    public void setCodCancion(int codCancion) {
        this.codCancion = codCancion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Partitura{" + "codCancion=" + codCancion + ", origen=" + origen + ", precio=" + precio + ", letra=" + letra + '}';
    }
}
