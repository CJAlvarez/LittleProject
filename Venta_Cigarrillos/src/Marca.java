public class Marca {
    
    private int idFabricante;
    private String marca;

    public Marca(int idFabricante, String marca) {
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

    @Override
    public String toString() {
        return "Marca{" + "idFabricante=" + idFabricante + ", marca=" + marca + '}';
    }
}
