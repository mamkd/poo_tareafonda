package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {

    // Atributos
    private List<Bebida> bebidas;



    // Constructor
    public GestorFonda() {
        this.bebidas = new ArrayList<Bebida>();
    }



    // Métodos de comportamiento
    public void registrarBebida(Bebida bebida) throws IllegalArgumentException {
        if (bebida == null) {
            throw new IllegalArgumentException("Bebida es null");
        } else {
            this.bebidas.add(bebida);
            String tipoBebida;
            if (bebida instanceof BebidaAlcoholica) {
                tipoBebida = "BebidaAlcoholica";
            } else if (bebida instanceof BebidaSinAlcohol) {
                tipoBebida = "BebidaSinAlcohol";
            } else {
                tipoBebida = "Bebida Desconocida";
            }
            System.out.println(bebida.getNombre() + " (" + tipoBebida + ") registrada correctamente.");
        }
    }

    public List<Bebida> buscarPorNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null) {
            throw new IllegalArgumentException("Nombre es null");
        } else if (nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre está en blanco");
        } else {
            List<Bebida> resultados = new ArrayList<>();
            for (Bebida bebida : this.bebidas) {
                if (bebida.getNombre().equals(nombre)) {
                    resultados.add(bebida);
                }
            }
            return resultados;
        }
    }

    public void vender(String nombre, int unidades) {
        Bebida match = null;
        for (int i = 0; i < this.bebidas.size(); i++) {
            if (this.bebidas.get(i).getNombre().equals(nombre)) {
                match = this.bebidas.get(i);
                break;
            }
        }
        if (match == null) {
            System.out.println("Venta rechazada: No se encontraron bebidas con el nombre '" + nombre + "'.");
        } else {
            if (match instanceof ConsumoResponsable) {
                if (((ConsumoResponsable) match).tieneVentaRestringida()) {
                    System.out.println("Venta rechazada: " + nombre + " tiene venta restringida.");
                } else if (unidades > ConsumoResponsable.LIMITE_UNIDADES_POR_CLIENTE) {
                    System.out.println("Venta rechazada: " + unidades + " unidades de " + nombre + " superan el límite de " + ConsumoResponsable.LIMITE_UNIDADES_POR_CLIENTE + " por cliente.");
                } else {
                    System.out.println("Venta autorizada: " + unidades + " x " + nombre + " | Total: $" + unidades * match.calcularPrecio());
                }
            } else if (match instanceof BebidaSinAlcohol) {
                System.out.println("Venta autorizada: " + unidades + " x " + nombre + " | Total: $" + unidades * match.calcularPrecio());
            }
        }
    }

    public List<Bebida> obtenerTodas() {
        return this.bebidas;
    }

}
