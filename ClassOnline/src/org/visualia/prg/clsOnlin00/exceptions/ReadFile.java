/**
 * 
 */
package org.visualia.prg.clsOnlin00.exceptions;

/**
 * 	Desarrollo con esquema excepciones
 * 	@author sfrias
 *	Se analiza ejemplo b�sico de lectura de fichero:
 *	readFile {
 *  	Abre archivo;					�Y si no podemos abrirlo?
 *  	Determina su tama�o;			�Y si no est� determinado?
 *   	Reserva la memoria necesaria;	�Y si no podemos reservar la necesaria?
 *  	Lee contenido Archivo desde dentro memoria;�Y si falla la lectura?
 * 		cierra archivo;					�Y si no podemos cerrarlo?
 *	}catch (fileOpenFailed) {
       AccionApropiada1;
    } catch (sizeDeterminationFailed) {
        AccionApropiada2;
    } catch (memoryAllocationFailed) {
        Acci�nApropiada3;
    } catch (readFailed) {
        AccionApropiada4;
    } catch (fileCloseFailed) {
        AccionApropiada5;
    } finally	{
    	AccionComun;
    }
 *
 */
public class ReadFile {

	/**
	 * 
	 */
	public ReadFile() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
