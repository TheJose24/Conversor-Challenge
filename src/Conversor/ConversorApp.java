package Conversor;

import javax.swing.JOptionPane;

public class ConversorApp {

	public static void main(String[] args) {

		ConversorTipos tipo = new ConversorTipos();

		while (true) {

			Object[] input = { "Monedas", "Temperatura", "Kilometraje"};

			String seleccionMenu = (JOptionPane.showInputDialog(null,
					"Por favor seleccione el tipo de conversion que desea realizar:", "Conversor", JOptionPane.PLAIN_MESSAGE,
					null, input, "")).toString();

			try {
				switch (seleccionMenu) {
				case "Monedas":
					tipo.Monedas();
					System.out.println("Opcion conversor de monedas");
					break;
                                case "Temperatura":
                                        tipo.Temperatura();
                                        System.out.println("Opcion conversor de temperatura");
                                        break;
                                case "Kilometraje":
                                        tipo.Kilometraje();
                                        System.out.println("Opcion conversor de kilometraje");
                                        break;
				}

				int confirmacion = JOptionPane.showConfirmDialog(null, "¿Deseas Realizar Otro tipo de Conversion?",
						"Confirmacion", JOptionPane.YES_NO_OPTION);
				if (confirmacion == 1) {
					System.out.println("Cerrado");
					break;
				}

			} catch (NullPointerException exception) {
				System.out.println("Opción nula");
			}
		}
		JOptionPane.showMessageDialog(null, "Hasta luego");
	}

}