package cl.dsy1102.fonda;

public abstract class Bebida {

    // Atributos
    protected String nombre;
    protected int volumenML;
    protected int stock;



    // Constructores
    public Bebida(String nombre, int volumenML, int stock) {
        this.nombre = nombre;
        this.volumenML = volumenML;
        this.stock = stock;
    }



    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null) {
            throw new IllegalArgumentException("Nombre es null.");
        } else if (nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre está vacío");
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
        } else {
            this.stock = stock;
        }
    }



    // Métodos abstractos
    public abstract double calcularPrecio();

    public abstract String obtenerDetalle();


    // Métodos mágicos
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Volumen: " + this.volumenML + " mL";
    }

}
