package org.visualia.prg.clsOnlin00.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class cat {

	public cat() {
		// TODO Auto-generated constructor stub
	}
public static void Kat(String string) {
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(string, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        return;
    } catch(FileNotFoundException fnf) {
        System.err.format("File: %s not found%n", string);
    } catch(IOException e) {
        System.err.println(e.toString());
    } finally {
        if (input != null) {
            try {
                input.close();
            } catch(IOException io) {
            }
        }
    }
}
	public static void main(String[] args) {
		Kat ("Salida.txt");
	}
}
