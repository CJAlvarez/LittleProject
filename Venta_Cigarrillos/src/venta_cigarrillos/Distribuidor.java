package venta_cigarrillos;

public class Distribuidor {
    
    private int idCompra;
    private int numCigarrillo;

    public Distribuidor(int idCompra, int numCigarrillo) {
        this.idCompra = idCompra;
        this.numCigarrillo = numCigarrillo;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getNumCigarrillo() {
        return numCigarrillo;
    }

    public void setNumCigarrillo(int numCigarrillo) {
        this.numCigarrillo = numCigarrillo;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "idCompra=" + idCompra + ", numCigarrillo=" + numCigarrillo + '}';
    }
}
