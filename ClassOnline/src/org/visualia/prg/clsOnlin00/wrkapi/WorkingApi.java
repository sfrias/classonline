package org.visualia.prg.clsOnlin00.wrkapi;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkingApi {

	public WorkingApi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// En lugar de enviar el volcado ante una excepcion de la pila manejo
		// lo enviamos a un fichero.
	try {
    Handler handler = new FileHandler("OutFile.log");
    Logger.getLogger("").addHandler(handler);
    
} catch (IOException e) {
    Logger logger = Logger.getLogger("package.name"); 
    StackTraceElement elements[] = e.getStackTrace();
    for (int i = 0, n = elements.length; i < n; i++) {
        logger.log(Level.WARNING, elements[i].getMethodName());
    }	
	}
}
}
