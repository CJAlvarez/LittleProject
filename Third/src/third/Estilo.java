package third;

public class Estilo {
    
    private String origen;
    private String influencia;
    private String padre;

    public Estilo(String origen, String influencia, String padre) {
        this.origen = origen;
        this.influencia = influencia;
        this.padre = padre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getInfluencia() {
        return influencia;
    }

    public void setInfluencia(String influencia) {
        this.influencia = influencia;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return "Estilo{" + "origen=" + origen + ", influencia=" + influencia + ", padre=" + padre + '}';
    }
}
