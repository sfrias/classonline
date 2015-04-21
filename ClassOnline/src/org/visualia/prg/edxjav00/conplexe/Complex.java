package org.visualia.prg.edxjav00.conplexe;

import java.lang.Math;

/**
 * Representacion de numeros complejos
 * Created by Frias Moren on 21/04/2015.
 */
public class Complex {
    // Atributos-Propiedades-Campos (items)
    private double real, img, mod, arg;
    /**
     * Constructor de la clase complex
     * @param par1 parte real o módulo
     * @param par2 parte imaginaria o argumento
     * @param concert indicacion de la forma especificada
     */
    
    public Complex (double par1, double par2, boolean concert) {
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
    
	// metodos
    /**@return  string en forma binÃ³mica */
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
    public void cxPlus(Complex csum){
        this.real = real+csum.real;
        this.img = img+csum.img;	
        this.mod = Math.hypot(real, img);
        this.arg = Math.atan2(img, real);
    }
        
public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImg() {
		return img;
	}
	public void setImg(double img) {
		this.img = img;
	}
	public double getMod() {
		return mod;
	}
	public void setMod(double mod) {
		this.mod = mod;
	}
	public double getArg() {
		return arg;
	}
	public void setArg(double arg) {
		this.arg = arg;
	}
	// Metodo principal para pruebas.
    public static void main(String[] main){
        Complex z,w;
        z = new Complex (-1.5, 3.0,true);
        w = new Complex (-1.2 ,2.4,true);
        z.cxPlus (w);
        System.out.println("Complejo: "+ z.strBinomic());
        System.out.println("Complejo: "+ z.strPolar());
    }
}

