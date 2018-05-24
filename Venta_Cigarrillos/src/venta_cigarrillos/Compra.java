package venta_cigarrillos;

import java.sql.Date;

public class Compra {

    private int idCompra;
    private int idFiscal;
    private int numCigarrillo;
    private int totalNumCigarrillo;
    private Date date;

    public Compra(int idCompra, int idFiscal, int numCigarrillo, int totalNumCigarrillo, Date date) {
        this.idCompra = idCompra;
        this.idFiscal = idFiscal;
        this.numCigarrillo = numCigarrillo;
        this.totalNumCigarrillo = totalNumCigarrillo;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
