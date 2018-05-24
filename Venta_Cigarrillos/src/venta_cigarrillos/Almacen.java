package venta_cigarrillos;

public class Almacen {

    private int idFiscal;
    private int numCigarrillo;
    private int cantCigarrillo;


    public Almacen(int idFiscal, int numCigarrillo, int cantCigarrillo) {
        this.idFiscal = idFiscal;
        this.numCigarrillo = numCigarrillo;
        this.cantCigarrillo = cantCigarrillo;
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
}


