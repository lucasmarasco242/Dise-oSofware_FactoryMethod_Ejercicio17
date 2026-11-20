Ejercicio 17 - Generador de Componentes de Interfaz Gráfica Minimalista

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para generar componentes gráficos minimalistas (Botones y Etiquetas) adaptados a los modos Escritorio y Móvil con geometría homogénea por entorno, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ComponenteGrafico con los métodos renderizar() y alInteractuar(String evento).
- Cuatro clases concretas (BotonEscritorioUI, EtiquetaEscritorioUI, BotonMovilUI y EtiquetaMovilUI) que representan los elementos visuales y su respuesta a eventos.
- Una clase abstracta FabricaUI con el método de fábrica crearComponente(String tipo, String texto) y métodos de creación validados para botones y etiquetas.
- Dos fábricas concretas (FabricaUIEscritorio y FabricaUIMovil) que construyen componentes compatibles con propiedades geométricas homogéneas.

Luego, dentro del método main, se utilizan ambas fábricas para crear botones y etiquetas, renderizarlos y simular interacciones.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común ComponenteGrafico para estandarizar el renderizado y la interacción.
- Centralizar en FabricaUI el contrato de creación y la validación del componente generado.
- Especializar cada fábrica concreta en un modo de pantalla con reglas geométricas coherentes.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
[Escritorio | 120x36px, borde 4px] Botón: 'Guardar'
Botón de Escritorio ('Guardar') procesó evento: Doble clic
[Escritorio | 120x36px, borde 4px] Etiqueta: 'Estado: Listo'
Etiqueta de Escritorio ('Estado: Listo') procesó evento: Hover
[Móvil | 100% ancho x 48dp, borde 12dp] Botón: 'Enviar'
Botón Móvil ('Enviar') procesó evento: Tap
[Móvil | 100% ancho x 48dp, borde 12dp] Etiqueta: 'Sin conexión'
Etiqueta Móvil ('Sin conexión') procesó evento: Long press

Captura de pantalla

<img width="673" height="352" alt="image" src="https://github.com/user-attachments/assets/e95b3aec-b825-48c7-b94f-eb803ed0e216" />
