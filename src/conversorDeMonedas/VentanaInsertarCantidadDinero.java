package conversorDeMonedas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaInsertarCantidadDinero extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -500749762632649758L;
	
	
	public  VentanaInsertarCantidadDinero() {
		
	        setTitle("Programa de conversión");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(500, 100);
	        setLayout(new FlowLayout());
	        setResizable(false);
	        setLocationRelativeTo(null);
	        
	        JTextField textField = new JTextField(20);
	        add(textField);
	        
	        
	        JButton ingresarDineroBoton = new JButton("ingresar dinero");
	        add(ingresarDineroBoton);

	        // Agregar un ActionListener al botón para realizar el cálculo
	        ingresarDineroBoton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Obtener el texto ingresado en el JTextField
	                 String textoIngresado = textField.getText();

	                try {
	                    // Convertir el texto a un valor double
	                    double dineroIngresado = Double.parseDouble(textoIngresado);

                    	setEnabled(false);
                        new VentanaConversionMonedas(dineroIngresado).setVisible(true);
                        dispose();
                        
	                } catch (NumberFormatException ex) {
	                    // Si el texto ingresado no es un número válido, mostrar un mensaje de error
	                    JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
	                }
	            }
	        });
	        
		
	}
	

}
