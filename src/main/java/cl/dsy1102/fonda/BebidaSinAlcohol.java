package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {

    private int azucarPorLitro;

    public BebidaSinAlcohol(String nombre, int volumenML, int stock, int azucarPorLitro) {
        super(nombre, volumenML, stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    public int getAzucarPorLitro() {
        return this.azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        // POR IMPLEMENTAR
    }

    @Override
    public double calcularPrecio() {
        // POR IMPLEMENTAR
    }

    @Override
    public String obtenerDetalle() {
        // POR IMPLEMENTAR
    }


}
