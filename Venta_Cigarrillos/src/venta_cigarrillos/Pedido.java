package venta_cigarrillos;

public class Pedido {
    
    private int idFiscal;
    private int idCompra;

    public Pedido(int idFiscal, int idCompra) {
        this.idFiscal = idFiscal;
        this.idCompra = idCompra;
    }

    public int getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(int idFiscal) {
        this.idFiscal = idFiscal;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idFiscal=" + idFiscal + ", idCompra=" + idCompra + '}';
    }
}
