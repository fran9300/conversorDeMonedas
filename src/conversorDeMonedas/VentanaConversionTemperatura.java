package conversorDeMonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class VentanaConversionTemperatura extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> comboBox;

	public VentanaConversionTemperatura(double temperatura) {
		
		
		
	       // Configurar la ventana
        setTitle("Conversor de temperaturas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setLayout(new FlowLayout());
        setResizable(false);
        
        setLocationRelativeTo(null);

        // Crear el JComboBox con las opciones
        String[] opciones = {"Convertir de ºC a ºF", "Convertir de ºC a K", "Convertir de ºF a ºC", 
        					 "Convertir de ºF a K", "Convertir de K a ºC", "Convertir de K a ºF",};
        
        comboBox = new JComboBox<>(opciones);

        // Configurar el JComboBox para mostrar solo la opción seleccionada
        comboBox.setEditable(true);
        comboBox.setSelectedIndex(-1);

        // Crear los botones
        JButton confirmarBoton = new JButton("Confirmar");
        JButton cerrarBoton = new JButton("Atras");

        // Agregar los componentes al panel principal
        add(comboBox);
        add(confirmarBoton);
        add(cerrarBoton);
        comboBox.setSelectedIndex(0);
        
        
        confirmarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	String opcionSeleccionada = (String) comboBox.getSelectedItem();
            	
            	String resultado = "";
                DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Para mostrar solo dos decimales

                switch (opcionSeleccionada) {
                    case "Convertir de ºC a ºF":
                        double fahrenheit = (temperatura * 9/5) + 32;
                        resultado = temperatura + " ºC es igual a " + decimalFormat.format(fahrenheit) + " ºF.";
                        break;
                    case "Convertir de ºC a K":
                        double kelvinC = temperatura + 273.15;
                        resultado = temperatura + " ºC es igual a " + decimalFormat.format(kelvinC) + " K.";
                        break;
                    case "Convertir de ºF a ºC":
                        double celsiusF = (temperatura - 32) * 5/9;
                        resultado = temperatura + " ºF es igual a " + decimalFormat.format(celsiusF) + " ºC.";
                        break;
                    case "Convertir de ºF a K":
                        double kelvinF = (temperatura + 459.67) * 5/9;
                        resultado = temperatura + " ºF es igual a " + decimalFormat.format(kelvinF) + " K.";
                        break;
                    case "Convertir de K a ºC":
                        double celsiusK = temperatura - 273.15;
                        resultado = temperatura + " K es igual a " + decimalFormat.format(celsiusK) + " ºC.";
                        break;
                    case "Convertir de K a ºF":
                        double fahrenheitK = (temperatura * 9/5) - 459.67;
                        resultado = temperatura + " K es igual a " + decimalFormat.format(fahrenheitK) + " ºF.";
                        break;
                    default:
                        resultado = "Opción no válida.";
                        break;
                }
            	
                JOptionPane.showMessageDialog(null, resultado);


            }
        });
        



        // Definir el comportamiento del botón "Cerrar"
        cerrarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana
                dispose();
                new VentanaConListaOpciones().setVisible(true);
              
            }
        });
		
		
		
		
		
		
	}
    

	
}

