package venta_cigarrillos;

import java.sql.Date;

public class Venta {

    private int idVenta;
    private int idFiscal;
    private int numCigarrillo;
    private int totalNumCigarrillo;
    private Date date;

    public Venta(int idVenta, int idFiscal, int totalNumCigarrillo, int numCigarrillo, Date date) {
        this.idVenta = idVenta;
        this.idFiscal = idFiscal;
        this.numCigarrillo = numCigarrillo;
        this.totalNumCigarrillo = totalNumCigarrillo;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
