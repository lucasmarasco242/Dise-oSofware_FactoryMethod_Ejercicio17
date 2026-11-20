public class EtiquetaEscritorioUI implements ComponenteGrafico {
    private String texto;
    private String geometria;

    public EtiquetaEscritorioUI(String texto, String geometria) {
        this.texto = texto;
        this.geometria = geometria;
    }

    public void renderizar() {
        System.out.println("[Escritorio | " + geometria + "] Etiqueta: '" + texto + "'");
    }

    public void alInteractuar(String evento) {
        System.out.println("Etiqueta de Escritorio ('" + texto + "') procesó evento: " + evento);
    }
}