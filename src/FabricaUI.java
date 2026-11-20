public abstract class FabricaUI {
    public abstract ComponenteGrafico crearComponente(String tipo, String texto);

    public final ComponenteGrafico crearBoton(String texto) {
        ComponenteGrafico componente = crearComponente("boton", texto);
        validarComponente(componente);
        return componente;
    }

    public final ComponenteGrafico crearEtiqueta(String texto) {
        ComponenteGrafico componente = crearComponente("etiqueta", texto);
        validarComponente(componente);
        return componente;
    }

    private void validarComponente(ComponenteGrafico componente) {
        if (componente == null) {
            throw new IllegalArgumentException("Tipo de componente gráfico no soportado.");
        }
    }
}