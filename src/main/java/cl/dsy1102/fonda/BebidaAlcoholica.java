package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {

    public static final int LIMITE_UNIDADES_POR_CLIENTE = 3;

    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumenML, int stock, double gradosAlcohol, boolean certificada) {
        super(nombre, volumenML, stock);
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = false;
    }

    public double getGradosAlcohol() {
        return this.gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) throws IllegalArgumentException {
        if (gradosAlcohol < 0) {
            throw new IllegalArgumentException("Grados de alcohol menor a 0.0%");
        } else if (gradosAlcohol > 100) {
            throw new IllegalArgumentException("Grados de alcohol mayor a 100.0%");
        } else {
            this.gradosAlcohol = gradosAlcohol;
        }
    }

    public boolean isCertificada() {
        return this.certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    @Override
    public double calcularPrecio() {
        return 3500.0 * ((!certificada) ? 1.2 : 1.0);
    }

    @Override
    public String obtenerDetalle() {
        return "Tipo: Bebida alcohólica | Nombre: " + this.nombre + " | Volumen: " + this.volumenML + " mL | Stock: " + this.stock + " | Grados: " + this.gradosAlcohol + " | Certificada: " + (this.certificada ? "Sí" : "No") + "Venta restringida: " + (tieneVentaRestringida() ? "Sí" : "No") +  " | Precio: $" + calcularPrecio();
    }

    @Override
    public boolean tieneVentaRestringida() {
        return this.ventaRestringida;
    }

    @Override
    public void restringirVenta() {
        this.ventaRestringida = true;
    }

    @Override
    public boolean superaLimite(int unidades) {
        return unidades > LIMITE_UNIDADES_POR_CLIENTE;
    }

    @Override
    public String retornarTipo() {
        return "BebidaAlcoholica";
    }

}
