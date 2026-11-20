public class BotonEscritorioUI implements ComponenteGrafico {
    private String texto;
    private String geometria;

    public BotonEscritorioUI(String texto, String geometria) {
        this.texto = texto;
        this.geometria = geometria;
    }

    public void renderizar() {
        System.out.println("[Escritorio | " + geometria + "] Botón: '" + texto + "'");
    }

    public void alInteractuar(String evento) {
        System.out.println("Botón de Escritorio ('" + texto + "') procesó evento: " + evento);
    }
}
