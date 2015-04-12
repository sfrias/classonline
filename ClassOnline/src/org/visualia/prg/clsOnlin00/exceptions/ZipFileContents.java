package org.visualia.prg.clsOnlin00.exceptions;

import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Enumeration;
import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;


public class ZipFileContents {
	/* Gestion de recursos de try con instrucciones de recursos	 */
	/**
	 * Escribe en un fichero de salida las entradas de un fichero zip
	 * 
	 * @param zipFileName nombre y camino del zip
	 * @param outputFileName nombre y camino del fichero salida
	 * @throws IOException
	 */
	public static void writeToFileZipFileContents(String zipFileName, String outputFileName)
			throws IOException {
		final Charset charset = StandardCharsets.US_ASCII;
		Path outputFilePath = Paths.get(outputFileName);
		// Abrir fichero zip y crear fichero de salida
		// try con instrucciones de recursos
		try (ZipFile zf = new ZipFile(zipFileName);
				BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)) {
			// Enumerar cada entrada.
			for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {
				// Get the entry name and write it to the output file
				String newLine = System.getProperty("line.separator");
				String zipEntryName = ((ZipEntry) entries.nextElement()).getName() + newLine;
				writer.write(zipEntryName, 0, zipEntryName.length());
			}
		}
	}
}