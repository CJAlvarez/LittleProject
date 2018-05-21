package venta_cigarrillos;

public class Manufactura {

    private int idFabricante;
    private String marca;
    private int carton;
    private int embalaje;

    public Manufactura(int idFabricante, String marca, int carton, int embalaje) {
        this.idFabricante = idFabricante;
        this.marca = marca;
        this.carton = carton;
        this.embalaje = embalaje;
    }

    public Manufactura(int idFabricante, String marca) {
        this.idFabricante = idFabricante;
        this.marca = marca;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCarton() {
        return carton;
    }

    public void setCarton(int carton) {
        this.carton = carton;
    }

    public int getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(int embalaje) {
        this.embalaje = embalaje;
    }

    
    
    @Override
    public String toString() {
        return "Marca{" + "idFabricante=" + idFabricante + ", marca=" + marca + '}';
    }
}
