package cl.dsy1102.fonda;

import java.util.List;
import java.util.ArrayList;

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
            System.out.println(bebida.getNombre() + " (" + bebida.retornarTipo() + ") registrada correctamente.");
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
        // POR IMPLEMENTAR
    }

}
