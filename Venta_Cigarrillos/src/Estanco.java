public class Estanco {
    
    private int idFiscal;
    private int numExpendio;
    private String localidad;

    public Estanco(int idFiscal, int numExpendio, String localidad) {
        this.idFiscal = idFiscal;
        this.numExpendio = numExpendio;
        this.localidad = localidad;
    }

    public int getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(int idFiscal) {
        this.idFiscal = idFiscal;
    }

    public int getNumExpendio() {
        return numExpendio;
    }

    public void setNumExpendio(int numExpendio) {
        this.numExpendio = numExpendio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idFiscal=" + idFiscal + ", numExpendio=" + numExpendio + ", localidad=" + localidad + '}';
    }
}
