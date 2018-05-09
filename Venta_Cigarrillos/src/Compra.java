public class Compra {
    
    private int idCompra;
    private int idFiscal;
    private String tipo;
    private int totalTipo;
    private int diaCompra;
    private int mesCompra;
    private int añoCompra;

    public Compra(int idCompra, int idFiscal, String tipo, int totalTipo, int diaCompra, int mesCompra, int añoCompra) {
        this.idCompra = idCompra;
        this.idFiscal = idFiscal;
        this.tipo = tipo;
        this.totalTipo = totalTipo;
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

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idFiscal=" + idFiscal + ", tipo=" + tipo + ", totalTipo=" + totalTipo + ", diaCompra=" + diaCompra + ", mesCompra=" + mesCompra + ", a\u00f1oCompra=" + añoCompra + '}';
    }
}
