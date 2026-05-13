package fes.aragon.compilador;

import java.io.FileReader;

public class Inicio {
	public static void main(String[] args) {
		try {
			// Asegúrate de que esta ruta apunte al .txt donde escribes tus pruebas
			String rutaArchivo = "src/fes/aragon/compilador/Fuente.txt";

			// 1. Instanciamos el Lexer pasándole el archivo
			Lexer lexer = new Lexer(new FileReader(rutaArchivo));

			// 2. Instanciamos el Parser pasándole el Lexer
			parser p = new parser(lexer);

			// 3. Ejecutamos el análisis
			p.parse();

			System.out.println("Análisis finalizado sin errores sintácticos.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}