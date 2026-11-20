public class FabricaUIMovil extends FabricaUI {
    private static final String GEOMETRIA_MOVIL = "100% ancho x 48dp, borde 12dp";

    public ComponenteGrafico crearComponente(String tipo, String texto) {
        if ("boton".equals(tipo)) {
            return new BotonMovilUI(texto, GEOMETRIA_MOVIL);
        }
        if ("etiqueta".equals(tipo)) {
            return new EtiquetaMovilUI(texto, GEOMETRIA_MOVIL);
        }
        return null;
    }
}