public class Rueda {
    private String fabricante;
    private int aro;
    private double ancho;

    public Rueda(String fabricante, double ancho, int aro) {
        this.fabricante = fabricante;
        this.ancho = ancho;
        this.aro = aro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }
}
