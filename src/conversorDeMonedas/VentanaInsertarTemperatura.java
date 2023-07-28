package conversorDeMonedas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaInsertarTemperatura extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5852394895480050246L;

	public  VentanaInsertarTemperatura() {
		
        setTitle("Programa de conversión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setLayout(new FlowLayout());
        setResizable(false);
        setLocationRelativeTo(null);
        
        JTextField textField = new JTextField(20);
        add(textField);
        
        
        JButton ingresarTemperaturaBoton = new JButton("ingresar Temperatura");
        add(ingresarTemperaturaBoton);

        // Agregar un ActionListener al botón para realizar el cálculo
        ingresarTemperaturaBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto ingresado en el JTextField
                String textoIngresado = textField.getText();

                try {
                    // Convertir el texto a un valor double
                    double temperatura = Double.parseDouble(textoIngresado);

                	setEnabled(false);
                    new VentanaConversionTemperatura(temperatura).setVisible(true);
                    dispose();
                    
                  
                    // Realizar cualquier operación con el valor double, por ejemplo, mostrarlo
                    //JOptionPane.showMessageDialog(null, "El valor double es: " + temperatura);
                } catch (NumberFormatException ex) {
                    // Si el texto ingresado no es un número válido, mostrar un mensaje de error
                    JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
                }
            }
        });
        
	
}

}
