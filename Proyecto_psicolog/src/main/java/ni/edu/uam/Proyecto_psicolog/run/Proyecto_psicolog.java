package ni.edu.uam.Proyecto_psicolog.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 */

public class Proyecto_psicolog {

	public static void main(String[] args) throws Exception {
		DBServer.start("Proyecto_psicolog-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("Proyecto_psicolog"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
