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

    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null) {
            throw new IllegalArgumentException("Nombre es null.");
        } else if (nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre no contiene carácteres alfanuméricos. ");
        } else {
            this.nombre = nombre;
        }
    }

    public int getVolumenML() {
        return this.volumenML;
    }

    public void setVolumenML(int volumenML) throws IllegalArgumentException {
        if (volumenML < 100) {
            throw new IllegalArgumentException("Volumen inferior a 100 mL");
        } else if (volumenML > 3000) {
            throw new IllegalArgumentException("Volumen superior a 3.000 mL");
        } else {
            this.volumenML = volumenML;
        }
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) throws IllegalArgumentException {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock inferior a 0");
        }
    }

    public abstract double calcularPrecio();

    public abstract String obtenerDetalle();

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Volumen: " + this.volumenML + " mL";
    }

}
