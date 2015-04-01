package org.visualia.prg.clsOnlin00;

/**
 * Representacion de numeros complejos
 * Created by Frias Moren on 01/04/2015.
 */
public class complex {
    // Atributos-Propiedades-Campos (items)
    private double real, img;
    private int mod, arg;

    // Constructores
    public complex (double real, double img){
        this.real = real;
        this.img = img;
    }
    public complex (int mod, int arg){
        this.mod = mod;
        this.arg = arg;
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
        return mod+"("+arg+")";
    }
    /**@param  csum complejo que le sumamos */
    public void cxPlus(complex csum){
        real = real+csum.real;
        img = img+csum.img;
    }
}
