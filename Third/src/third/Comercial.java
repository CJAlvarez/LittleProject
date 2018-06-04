package third;

public class Comercial extends Grabacion {
    
    private String casaProductora;

    public Comercial(String casaProductora, int codCancion, int tipo, int ID) {
        super(codCancion, tipo, ID);
        this.casaProductora = casaProductora;
    }

    public String getCasaProductora() {
        return casaProductora;
    }

    public void setCasaProductora(String casaProductora) {
        this.casaProductora = casaProductora;
    }

    @Override
    public String toString() {
        return "Comercial{" + "casaProductora=" + casaProductora + '}';
    }
}
