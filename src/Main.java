public class Main {
    public static void main(String[] args) {
        FabricaUIEscritorio fabricaEscritorio = new FabricaUIEscritorio();
        ComponenteGrafico botonEscritorio = fabricaEscritorio.crearBoton("Guardar");
        ComponenteGrafico etiquetaEscritorio = fabricaEscritorio.crearEtiqueta("Estado: Listo");
        botonEscritorio.renderizar();
        botonEscritorio.alInteractuar("Doble clic");
        etiquetaEscritorio.renderizar();
        etiquetaEscritorio.alInteractuar("Hover");

        FabricaUIMovil fabricaMovil = new FabricaUIMovil();
        ComponenteGrafico botonMovil = fabricaMovil.crearBoton("Enviar");
        ComponenteGrafico etiquetaMovil = fabricaMovil.crearEtiqueta("Sin conexión");
        botonMovil.renderizar();
        botonMovil.alInteractuar("Tap");
        etiquetaMovil.renderizar();
        etiquetaMovil.alInteractuar("Long press");
    }
}