package venta_cigarrillos;

public class Cigarrillo {

    private int numCigarrillo;
    private char filtro;
    private String colorHoja;
    private int alquitran;
    private int nicotina;
    private String marca;
    private String clase;
    private char mentol;
    private float precio_v;
    private float precio_c;

    public Cigarrillo(int numCigarrillo, char filtro, String colorHoja, int alquitran, int nicotina, String marca, String clase, char mentol, float precio_v, float precio_c) {
        this.numCigarrillo = numCigarrillo;
        this.filtro = filtro;
        this.colorHoja = colorHoja;
        this.alquitran = alquitran;
        this.nicotina = nicotina;
        this.marca = marca;
        this.clase = clase;
        this.mentol = mentol;
        this.precio_v = precio_v;
        this.precio_c = precio_c;
    }

    public float getPrecio_v() {
        return precio_v;
    }

    public void setPrecio_v(float precio_v) {
        this.precio_v = precio_v;
    }

    public float getPrecio_c() {
        return precio_c;
    }

    public void setPrecio_c(float precio_c) {
        this.precio_c = precio_c;
    }

    public int getNumCigarrillo() {
        return numCigarrillo;
    }

    public void setNumCigarrillo(int numCigarrillo) {
        this.numCigarrillo = numCigarrillo;
    }

    public char getFiltro() {
        return filtro;
    }

    public void setFiltro(char filtro) {
        this.filtro = filtro;
    }

    public String getColorHoja() {
        return colorHoja;
    }

    public void setColorHoja(String colorHoja) {
        this.colorHoja = colorHoja;
    }

    public int getAlquitran() {
        return alquitran;
    }

    public void setAlquitran(int alquitran) {
        this.alquitran = alquitran;
    }

    public int getNicotina() {
        return nicotina;
    }

    public void setNicotina(int nicotina) {
        this.nicotina = nicotina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public char getMentol() {
        return mentol;
    }

    public void setMentol(char mentol) {
        this.mentol = mentol;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

}
