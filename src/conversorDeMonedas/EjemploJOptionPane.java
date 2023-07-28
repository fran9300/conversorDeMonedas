package conversorDeMonedas;

import javax.swing.*;

public class EjemploJOptionPane {
    public static void main(String[] args) {
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};

        // Muestra un cuadro de diálogo de entrada simulando una lista desplegable
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción:",
                "Lista Desplegable",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0] // Opción predeterminada
        );

        // Verifica si el usuario seleccionó una opción y muestra el resultado
        if (opcionSeleccionada != null) {
            JOptionPane.showMessageDialog(null, "Opción seleccionada: " + opcionSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción.");
        }
    }
}
