public class Fabricante {
    
    private int idFabricante;
    private String nombre;
    private String sede;

    public Fabricante(int idFabricante, String nombre, String sede) {
        this.idFabricante = idFabricante;
        this.nombre = nombre;
        this.sede = sede;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "idFabricante=" + idFabricante + ", nombre=" + nombre + ", sede=" + sede + '}';
    }
}
