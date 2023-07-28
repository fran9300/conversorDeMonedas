package conversorDeMonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConListaOpciones extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6301129857332062031L;
	private JComboBox<String> comboBox;
	
	

    public VentanaConListaOpciones() {
    	
    	
    	
        // Configurar la ventana
        setTitle("Programa de conversión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setLayout(new FlowLayout());
        setResizable(false);

        
        setLocationRelativeTo(null);

        // Crear el JComboBox con las opciones
        String[] opciones = {"Conversor de monedas", "Conversor de temperaturas"};
        comboBox = new JComboBox<>(opciones);

        // Configurar el JComboBox para mostrar solo la opción seleccionada
        comboBox.setEditable(true);
        comboBox.setSelectedIndex(-1);

        // Crear los botones
        JButton confirmarBoton = new JButton("Confirmar");
        JButton cerrarBoton = new JButton("Cerrar");

        // Agregar los componentes al panel principal
        add(comboBox);
        add(confirmarBoton);
        add(cerrarBoton);
        comboBox.setSelectedIndex(0);

        // Definir el comportamiento del botón "Confirmar"
        confirmarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la opción seleccionada del JComboBox
                String opcionSeleccionada = (String) comboBox.getSelectedItem();
                if (opcionSeleccionada == "Conversor de monedas") {
                   
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                        	setEnabled(false);
                            new VentanaInsertarCantidadDinero().setVisible(true);
                            dispose();
                        }
                    });
                	
                } else if (opcionSeleccionada == "Conversor de temperaturas") {
                	
                	 SwingUtilities.invokeLater(new Runnable() {
                         public void run() {
                         	setEnabled(false);
                             new VentanaInsertarTemperatura().setVisible(true);
                             dispose();
                         }
                     });
                	}
                else {
                    JOptionPane.showMessageDialog(VentanaConListaOpciones.this, "Selecciona una opción antes de confirmar.");
                }
            }
        });

        // Definir el comportamiento del botón "Cerrar"
        cerrarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana
                dispose();
            }
        });
    
    }
    
}
