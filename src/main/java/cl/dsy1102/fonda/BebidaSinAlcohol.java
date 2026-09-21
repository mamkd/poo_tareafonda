package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {

    // Atributos
    private int azucarPorLitro;



    // Constructor
    public BebidaSinAlcohol(String nombre, int volumenML, int stock, int azucarPorLitro) {
        super(nombre, volumenML, stock);
        this.azucarPorLitro = azucarPorLitro;
    }



    // Getters y setters
    public int getAzucarPorLitro() {
        return this.azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) throws IllegalArgumentException {
        if (azucarPorLitro < 0) {
            throw new IllegalArgumentException("Azúcar por litro inferior a 0");
        } else {
            this.azucarPorLitro = azucarPorLitro;
        }
    }



    // Métodos especiales
    @Override
    public double calcularPrecio() {
        return 2000.0 * ((this.azucarPorLitro > 80) ? 1.1 : 1.0);
    }

    @Override
    public String obtenerDetalle() {
        return "Tipo: Bebida sin alcohol | Nombre: " + this.nombre + " | Volumen: " + this.volumenML + " mL | Stock: " + this.stock + " | Azúcar: " + this.azucarPorLitro + " g/L | Precio: $" + calcularPrecio();
    }

    @Override
    public String retornarTipo() {
        return "BebidaSinAlcohol";
    }


}
