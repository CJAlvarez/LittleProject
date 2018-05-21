package venta_cigarrillos;

public class Compra {
    
    private int idCompra;
    private int idFiscal;
    private int numCigarrillo;
    private int totalNumCigarrillo;
    private int diaCompra;
    private int mesCompra;
    private int añoCompra;

    public Compra(int idCompra, int idFiscal, int numCigarrillo, int totalNumCigarrillo, int diaCompra, int mesCompra, int añoCompra) {
        this.idCompra = idCompra;
        this.idFiscal = idFiscal;
        this.numCigarrillo = numCigarrillo;
        this.totalNumCigarrillo = totalNumCigarrillo;
        this.diaCompra = diaCompra;
        this.mesCompra = mesCompra;
        this.añoCompra = añoCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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

    public int getTotalNumCigarrillo() {
        return totalNumCigarrillo;
    }

    public void setTotalNumCigarrillo(int totalNumCigarrillo) {
        this.totalNumCigarrillo = totalNumCigarrillo;
    }

   
    public int getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(int diaCompra) {
        this.diaCompra = diaCompra;
    }

    public int getMesCompra() {
        return mesCompra;
    }

    public void setMesCompra(int mesCompra) {
        this.mesCompra = mesCompra;
    }

    public int getAñoCompra() {
        return añoCompra;
    }

    public void setAñoCompra(int añoCompra) {
        this.añoCompra = añoCompra;
    }


}
