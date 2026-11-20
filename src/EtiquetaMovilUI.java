public class EtiquetaMovilUI implements ComponenteGrafico {
    private String texto;
    private String geometria;

    public EtiquetaMovilUI(String texto, String geometria) {
        this.texto = texto;
        this.geometria = geometria;
    }

    public void renderizar() {
        System.out.println("[Móvil | " + geometria + "] Etiqueta: '" + texto + "'");
    }

    public void alInteractuar(String evento) {
        System.out.println("Etiqueta Móvil ('" + texto + "') procesó evento: " + evento);
    }
}