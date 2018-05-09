public class Venta {
    private int idVenta;
    private int idFiscal;
    private String tipo; // Verificar.
    private int totalTipo;
    private int diaVenta;
    private int mesVenta;
    private int añoVenta;

    public Venta(int idVenta, int idFiscal, String tipo, int totalTipo, int diaVenta, int mesVenta, int añoVenta) {
        this.idVenta = idVenta;
        this.idFiscal = idFiscal;
        this.tipo = tipo;
        this.totalTipo = totalTipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTotalTipo() {
        return totalTipo;
    }

    public void setTotalTipo(int totalTipo) {
        this.totalTipo = totalTipo;
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

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", idFiscal=" + idFiscal + ", tipo=" + tipo + ", totalTipo=" + totalTipo + ", diaVenta=" + diaVenta + ", mesVenta=" + mesVenta + ", a\u00f1oVenta=" + añoVenta + '}';
    }
}
