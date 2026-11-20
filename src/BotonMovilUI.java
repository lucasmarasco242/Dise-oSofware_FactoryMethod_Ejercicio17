public class BotonMovilUI implements ComponenteGrafico {
    private String texto;
    private String geometria;

    public BotonMovilUI(String texto, String geometria) {
        this.texto = texto;
        this.geometria = geometria;
    }

    public void renderizar() {
        System.out.println("[Móvil | " + geometria + "] Botón: '" + texto + "'");
    }

    public void alInteractuar(String evento) {
        System.out.println("Botón Móvil ('" + texto + "') procesó evento: " + evento);
    }
}