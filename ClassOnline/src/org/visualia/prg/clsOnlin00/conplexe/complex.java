package org.visualia.prg.clsOnlin00.conplexe;

import java.lang.Math;;

/**
 * Representacion de numeros complejos
 * Created by Frias Moren on 01/04/2015.
 */
public class complex {
    // Atributos-Propiedades-Campos (items)
    private double real, img, mod, arg;
    /**
     * Constructor de la clase complex
     * @param par1 parte real o m�dulo
     * @param par2 parte imaginaria o argumento
     * @param concert indicacion de la forma especificada
     */
    
    public complex (double par1, double par2, boolean concert) {
    	if (concert) {
    	// Parametros en forma binomica
        this.real = par1;
        this.img = par2;
        this.mod = Math.hypot(par1, par2);
        this.arg = Math.atan2(par2, par1);
    	}else {
        // Parametros en forma polar
        	this.real = par1 * Math.cos(par2);
            this.img = par1 * Math.sin(par2);
            this.mod = par1 ;
            this.arg = par2 ;
		}
    }
    // métodos
    /**@return  string en forma binómica */
    public String strBinomic (){
        return real+"+"+img+"i";
    }
    /**@return  string en forma cartesiana */
    public String strCartesian(){
        return "("+real+","+img+")";
    }
    /**@return  string en forma polar */
    public String strPolar(){
        return mod+"("+arg+"rad)";
    }
    /**
    /**@param  csum complejo que le sumamos */
    public void cxPlus(complex csum){
        this.real = real+csum.real;
        this.img = img+csum.img;	
        this.mod = Math.hypot(real, img);
        this.arg = Math.atan2(img, real);

    }
}
