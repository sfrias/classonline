package org.visualia.prg.clsOnlin00.exceptions;

import java.io.*;
import java.util.List;
import java.util.ArrayList;


/*	 Clase ListOfNumbers: ArrayList con 10 valores (0 al 9) indexados
 * 	el método writeList escribe la lista en un fichero de texto OutFile.txt
 * 	mediante E/S básica definida en java.io.
 *	 Se usa manejo básico de excepciones.
 */


public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException {
	// Constructor FileWriter puede lanzar IOException,que debe ser capturada.
        PrintWriter out = new PrintWriter(new FileWriter("Salida.txt"));

        for (int i = 0; i < SIZE; i++) {
            // El método get(int) puede lanzar IndexOutOfBoundsException, que debe ser capturada.
            out.println("Valor en: " + i + " = " + list.get(i));
        }
        out.close();
    }
    public void writeList2() {
        PrintWriter out = null;
        try {
            System.out.println("Entrada sentencia try.");
            out = new PrintWriter(new FileWriter("Salida.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Valor en: " + i + " = " + list.get(i));
            }
        }catch (IndexOutOfBoundsException e) {
                System.err.println("IndexOutOfBoundsException: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());
        }finally {// Nos aseguramos en cualquier caso la ejecucion de éste codeblock.
            if (out != null) { 
                System.out.println("Cerrando PrintWriter");
                out.close(); 
            } else { 
                System.out.println("PrintWriter no abierto");
            } 
        } 
    }
}