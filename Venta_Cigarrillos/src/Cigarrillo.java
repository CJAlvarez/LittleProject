public class Cigarrillo {
    
    private int numCigarrillo;
    private boolean filtro;
    private String colorHoja;
    private float cantContaminante;
    private String marca;

    public Cigarrillo(int numCigarrillo, boolean filtro, String colorHoja, float cantContaminante, String marca) {
        this.numCigarrillo = numCigarrillo;
        this.filtro = filtro;
        this.colorHoja = colorHoja;
        this.cantContaminante = cantContaminante;
        this.marca = marca;
    }

    public int getNumCigarrillo() {
        return numCigarrillo;
    }

    public void setNumCigarrillo(int numCigarrillo) {
        this.numCigarrillo = numCigarrillo;
    }

    public boolean isFiltro() {
        return filtro;
    }

    public void setFiltro(boolean filtro) {
        this.filtro = filtro;
    }

    public String getColorHoja() {
        return colorHoja;
    }

    public void setColorHoja(String colorHoja) {
        this.colorHoja = colorHoja;
    }

    public float getCantContaminante() {
        return cantContaminante;
    }

    public void setCantContaminante(float cantContaminante) {
        this.cantContaminante = cantContaminante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Cigarrillo{" + "numCigarrillo=" + numCigarrillo + ", filtro=" + filtro + ", colorHoja=" + colorHoja + ", cantContaminante=" + cantContaminante + ", marca=" + marca + '}';
    }
}
