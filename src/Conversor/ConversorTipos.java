package Conversor;

import javax.swing.JOptionPane;

public class ConversorTipos {

    public void Monedas() {
        Object[] seleccion = {"Dolares a Soles", "Soles a Dolares", "Euros a Soles",
            "Soles a Euros", "Libras a Soles", "Soles a Libras",
            "Yen a Soles", "Soles a Yen"};
        String seleccionado = (JOptionPane.showInputDialog(null, "Seleccione el Tipo de moneda a Convertir",
                "ConversApp", JOptionPane.PLAIN_MESSAGE, null, seleccion, "")).toString();
        String TipoDemonedaInicial = seleccionado.substring(0, 3);

        try {
            String valorInicial = JOptionPane.showInputDialog("Ingrese el valor en " + TipoDemonedaInicial);

            double monedaInicial = Double.parseDouble(valorInicial);

            double monedaFinal;

            switch (seleccionado) {

                case "Dolares a Soles":
                    monedaFinal = monedaInicial * 3.78;
                    convercionMensajeResultado(monedaFinal, "Soles");
                    break;
                case "Soles a Dolares":
                    monedaFinal = monedaInicial / 3.78;
                    convercionMensajeResultado(monedaFinal, "Dolares");
                    break;
                case "Euros a Soles":
                    monedaFinal = monedaInicial * 4;
                    convercionMensajeResultado(monedaFinal, "Soles");
                    break;
                case "Soles a Euros":
                    monedaFinal = monedaInicial / 4;
                    convercionMensajeResultado(monedaFinal, "Euros");
                    break;
                case "Libras a Soles":
                    monedaFinal = monedaInicial * 4.63;
                    convercionMensajeResultado(monedaFinal, "Soles");
                    break;
                case "Soles a Libras":
                    monedaFinal = monedaInicial / 4.63;
                    convercionMensajeResultado(monedaFinal, "Libras");
                    break;
                case "Yen a Soles":
                    monedaFinal = monedaInicial / 0.025;
                    convercionMensajeResultado(monedaFinal, "Soles");
                    break;
                case "Soles a Yen":
                    monedaFinal = monedaInicial / 0.025;
                    convercionMensajeResultado(monedaFinal, "Yenes");
                    break;
            }

        } catch (NumberFormatException ex) {
            System.out.println("Error de valor");
            JOptionPane.showMessageDialog(null, "Valor No Valido");
            Monedas();
        }

    }

    public void Temperatura() {
        Object[] seleccion = {"Celsius a Fahrenheit", "Fahrenheit a Celsius", "Kelvin a Celsius",
            "Celsius a Kelvin"};
        String seleccionado = (JOptionPane.showInputDialog(null, "Seleccione el Tipo de temperatura a Convertir",
                "ConversApp", JOptionPane.PLAIN_MESSAGE, null, seleccion, "")).toString();
        String TipoTemperaturaInicial = seleccionado.substring(0, 3);

        try {
            String temperaturaInicial = JOptionPane.showInputDialog("Ingrese el valor en " + TipoTemperaturaInicial);

            double temperaturaConvertir = Double.parseDouble(temperaturaInicial);

            double temperaturaConvertida;

            switch (seleccionado) {

                case "Celsius a Fahrenheit":
                    temperaturaConvertida = (temperaturaConvertir * 9 / 5) + 32;
                    convercionMensajeResultado(temperaturaConvertida, "Fahrenheit");
                    break;
                case "Fahrenheit a Celsius":
                    temperaturaConvertida = (temperaturaConvertir - 32) * 5 / 9;
                    convercionMensajeResultado(temperaturaConvertida, "Celsius");
                    break;
                case "Kelvin a Celsius":
                    temperaturaConvertida = temperaturaConvertir - 273.15;
                    convercionMensajeResultado(temperaturaConvertida, "Celsius");
                    break;
                case "Celsius a Kelvin":
                    temperaturaConvertida = temperaturaConvertir + 273.15;
                    convercionMensajeResultado(temperaturaConvertida, "Kevin");
                    break;
            }

        } catch (NumberFormatException ex) {
            System.out.println("Error de valor");
            JOptionPane.showMessageDialog(null, "Valor No Valido");
            Monedas();
        }
    }

    public void Kilometraje() {
        Object[] seleccion = {"Kilometros a Millas", "Millas a Kilometros", "Metros a Kilometros",
            "Kilometros a Metros"};
        String seleccionado = (JOptionPane.showInputDialog(null, "Seleccione el Tipo de Kilometraje a Convertir",
                "ConversApp", JOptionPane.PLAIN_MESSAGE, null, seleccion, "")).toString();
        String TipoKilometrajeInicial = seleccionado.substring(0, 3);

        try {
            String kilometrajeInicial = JOptionPane.showInputDialog("Ingrese el valor en " + TipoKilometrajeInicial);

            double kilometrajeConvertir = Double.parseDouble(kilometrajeInicial);

            double kilometrajeConvertido;

            switch (seleccionado) {

                case "Kilometros a Millas":
                    kilometrajeConvertido = kilometrajeConvertir / 1.609;
                    convercionMensajeResultado(kilometrajeConvertido, "Millas");
                    break;
                case "Millas a Kilometros":
                    kilometrajeConvertido = kilometrajeConvertir * 1.609;
                    convercionMensajeResultado(kilometrajeConvertido, "Kilometros");
                    break;
                case "Metros a Kilometros":
                    kilometrajeConvertido = kilometrajeConvertir / 1000;
                    convercionMensajeResultado(kilometrajeConvertido, "Kilometros");
                    break;
                case "Kilometros a Metros":
                    kilometrajeConvertido = kilometrajeConvertir * 1000;
                    convercionMensajeResultado(kilometrajeConvertido, "Metros");
                    break;
            }

        } catch (NumberFormatException ex) {
            System.out.println("Error de valor");
            JOptionPane.showMessageDialog(null, "Valor No Valido");
            Monedas();
        }
    }

    public void convercionMensajeResultado(double valorA, String valorB) {

        valorA = (double) Math.round(valorA * 100d) / 100;

        JOptionPane.showMessageDialog(null, "El resultado de tu conversión es : " + valorA + " " + valorB);

    }

}
