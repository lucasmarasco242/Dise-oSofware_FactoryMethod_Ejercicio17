public class FabricaUIEscritorio extends FabricaUI {
    private static final String GEOMETRIA_ESCRITORIO = "120x36px, borde 4px";

    public ComponenteGrafico crearComponente(String tipo, String texto) {
        if ("boton".equals(tipo)) {
            return new BotonEscritorioUI(texto, GEOMETRIA_ESCRITORIO);
        }
        if ("etiqueta".equals(tipo)) {
            return new EtiquetaEscritorioUI(texto, GEOMETRIA_ESCRITORIO);
        }
        return null;
    }
}