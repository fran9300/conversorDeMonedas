package conversorDeMonedas;

public class FuncionesTemperatura {
	
	public String  conversionTemperatura(String opcionElegida, double temperatura) {
		
		
		String resultado = "";
        switch (opcionElegida) {
            case "Convertir de ºC a ºF":
                double fahrenheit = (temperatura * 9/5) + 32;
                resultado = temperatura + " ºC es igual a " + fahrenheit + " ºF.";
                break;
            case "Convertir de ºC a K":
                double kelvinC = temperatura + 273.15;
                resultado = temperatura + " ºC es igual a " + kelvinC + " K.";
                break;
            case "Convertir de ºF a ºC":
                double celsiusF = (temperatura - 32) * 5/9;
                resultado = temperatura + " ºF es igual a " + celsiusF + " ºC.";
                break;
            case "Convertir de ºF a K":
                double kelvinF = (temperatura + 459.67) * 5/9;
                resultado = temperatura + " ºF es igual a " + kelvinF + " K.";
                break;
            case "Convertir de K a ºC":
                double celsiusK = temperatura - 273.15;
                resultado = temperatura + " K es igual a " + celsiusK + " ºC.";
                break;
            case "Convertir de K a ºF":
                double fahrenheitK = (temperatura * 9/5) - 459.67;
                resultado = temperatura + " K es igual a " + fahrenheitK + " ºF.";
                break;
            default:
                resultado = "Opción no válida.";
                break;
        }
        
        return resultado;
	}
}

