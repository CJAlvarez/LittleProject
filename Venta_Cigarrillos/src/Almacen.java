public class Almacen {
    
    private int idFiscal;
    private int numCigarrillo;
    private int cantCigarrillo;
    private int numExpendio;
    private String localidad;
    private String nombre;

    public Almacen(int idFiscal, int numCigarrillo, int cantCigarrillo, int numExpendio, String localidad, String nombre) {
        this.idFiscal = idFiscal;
        this.numCigarrillo = numCigarrillo;
        this.cantCigarrillo = cantCigarrillo;
        this.numExpendio = numExpendio;
        this.localidad = localidad;
        this.nombre = nombre;
    }

    public int getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(int idFiscal) {
        this.idFiscal = idFiscal;
    }

    public int getNumCigarrillo() {
        return numCigarrillo;
    }

    public void setNumCigarrillo(int numCigarrillo) {
        this.numCigarrillo = numCigarrillo;
    }

    public int getCantCigarrillo() {
        return cantCigarrillo;
    }

    public void setCantCigarrillo(int cantCigarrillo) {
        this.cantCigarrillo = cantCigarrillo;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Almacen{" + "idFiscal=" + idFiscal + ", numCigarrillo=" + numCigarrillo + ", cantCigarrillo=" + cantCigarrillo + ", numExpendio=" + numExpendio + ", localidad=" + localidad + ", nombre=" + nombre + '}';
    }
}
