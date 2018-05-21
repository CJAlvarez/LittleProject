public class Cigarrillo {
    
    private int numCigarrillo;
    private char filtro;
    private String colorHoja;
    private int alquitran;
    private int nicotina;
    private String marca;
    private char mentol;

    public Cigarrillo(int numCigarrillo, char filtro, String colorHoja, int alquitran, int nicotina, String marca, char mentol) {
        this.numCigarrillo = numCigarrillo;
        this.filtro = filtro;
        this.colorHoja = colorHoja;
        this.alquitran = alquitran;
        this.nicotina = nicotina;
        this.marca = marca;
        this.mentol = mentol;
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

    
}
