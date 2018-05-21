package venta_cigarrillos;

public class Venta {
    private int idVenta;
    private int idFiscal;
    private int numCigarrillo; 
    private int totalNumCigarrillo;
    private int diaVenta;
    private int mesVenta;
    private int añoVenta;

    public Venta(int idVenta, int idFiscal, int totalNumCigarrillo, int numCigarrillo, int diaVenta, int mesVenta, int añoVenta) {
        this.idVenta = idVenta;
        this.idFiscal = idFiscal;
        this.totalNumCigarrillo= totalNumCigarrillo;
        this.numCigarrillo= numCigarrillo;
        this.diaVenta = diaVenta;
        this.mesVenta = mesVenta;
        this.añoVenta = añoVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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

   

    public int getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(int diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getMesVenta() {
        return mesVenta;
    }

    public void setMesVenta(int mesVenta) {
        this.mesVenta = mesVenta;
    }

    public int getAñoVenta() {
        return añoVenta;
    }

    public void setAñoVenta(int añoVenta) {
        this.añoVenta = añoVenta;
    }


}
