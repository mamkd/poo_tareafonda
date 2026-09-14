package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {

    public static final int LIMITE_UNIDADES_POR_CLIENTE = 3;

    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRegistrada;

    public BebidaAlcoholica(String nombre, int volumenML, int stock, double gradosAlcohol, boolean certificada) {
        super(nombre, volumenML, stock);
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRegistrada = false;
    }

    public double getGradosAlcohol() {
        return this.gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        // POR IMPLEMENTAR
    }

    public boolean isCertificada() {
        return this.certificada;
    }

    public void setCertificada(boolean certificada) {
        // POR IMPLEMENTAR
    }

    @Override
    public double calcularPrecio() {
        // POR IMLPEMENTAR
    }

    @Override
    public String obtenerDetalle() {
        // POR IMPLEMENTAR
    }

    @Override
    public boolean tieneVentaRestringida() {
        // POR IMPLEMENTAR
    }

    @Override
    public void restringirVenta() {
        // POR IMLPEMENTAR
    }

    @Override
    public boolean superaLimite(int unidades) {
        // POR IMPLEMENTAR
    }

}
