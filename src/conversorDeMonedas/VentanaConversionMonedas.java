package conversorDeMonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class VentanaConversionMonedas extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> comboBox;

	public VentanaConversionMonedas(double dineroIngresado) {
		
		
		
	       // Configurar la ventana
        setTitle("Conversor de monedas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setLayout(new FlowLayout());
        setResizable(false);
        
        setLocationRelativeTo(null);

        // Crear el JComboBox con las opciones
        String[] opciones = {"Convertir peso Argentino a Dólar", "Convertir peso Argentino a Euro",
        					 "Convertir peso Argentino a Libra esterlina", "Convertir peso Argentino a Yen Japones", 
        					 "Convertir peso Argentino a Won surcoreano", "Convertir Dólar a peso Argentino", 
        					 "Convertir Euro a peso Argentino", "Convertir Libra esterlina a peso Argentino", 
        					 "Convertir Yen Japones a peso Argentino", "Convertir Won surcoreano a peso Argentino",};
        
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
            	DecimalFormat decimalFormat = new DecimalFormat("#.####");
            	
                switch (opcionSeleccionada) {
                case "Convertir peso Argentino a Dólar":
                    double dolar = dineroIngresado * 0.0037;
                    resultado = dineroIngresado + " ARS es igual a " + decimalFormat.format(dolar) + " USD.";
                    break;
                case "Convertir peso Argentino a Euro":
                    double euro = dineroIngresado * 0.0033;
                    resultado = dineroIngresado + " ARS es igual a " + decimalFormat.format(euro) + " EUR.";
                    break;
                case "Convertir peso Argentino a Libra esterlina":
                    double libra = dineroIngresado * 0.0029;
                    resultado = dineroIngresado + " ARS es igual a " + decimalFormat.format(libra) + " GBP.";
                    break;
                case "Convertir peso Argentino a Yen Japones":
                    double yen = dineroIngresado * 0.512;
                    resultado = dineroIngresado + " ARS es igual a " + decimalFormat.format(yen) + " JPY.";
                    break;
                case "Convertir peso Argentino a Won surcoreano":
                    double won = dineroIngresado * 4.69;
                    resultado = dineroIngresado + " ARS es igual a " + decimalFormat.format(won) + " KRW.";
                    break;
                case "Convertir Dólar a peso Argentino":
                    double arsDolar = dineroIngresado * 273.04;
                    resultado = dineroIngresado + " USD es igual a " + decimalFormat.format(arsDolar) + " ARS.";
                    break;
                case "Convertir Euro a peso Argentino":
                    double arsEuro = dineroIngresado * 299.95;
                    resultado = dineroIngresado + " EUR es igual a " + decimalFormat.format(arsEuro) + " ARS.";
                    break;
                case "Convertir Libra esterlina a peso Argentino":
                    double arsLibra = dineroIngresado * 349.47;
                    resultado = dineroIngresado + " GBP es igual a " + decimalFormat.format(arsLibra) + " ARS.";
                    break;
                case "Convertir Yen Japones a peso Argentino":
                    double arsYen = dineroIngresado * 1.95;
                    resultado = dineroIngresado + " JPY es igual a " + decimalFormat.format(arsYen) + " ARS.";
                    break;
                case "Convertir Won surcoreano a peso Argentino":
                    double arsWon = dineroIngresado * 0.21;
                    resultado = dineroIngresado + " KRW es igual a " + decimalFormat.format(arsWon) + " ARS.";
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

