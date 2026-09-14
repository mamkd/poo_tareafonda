package cl.dsy1102.fonda;

public abstract class Bebida {

    protected String nombre;
    protected int volumenML;
    protected int stock;

    public Bebida(String nombre, int volumenML, int stock) {
        this.nombre = nombre;
        this.volumenML = volumenML;
        this.stock = stock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        // POR IMPLEMENTAR
    }

    public int getVolumenML() {
        return this.volumenML;
    }

    public void setVolumenML(int volumenML) {
        // POR IMPLEMENTAR
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        // POR IMPLEMENTAR
    }

    public abstract double calcularPrecio();

    public abstract String obtenerDetalle();

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Volumen: " + this.volumenML + " mL";
    }

}
