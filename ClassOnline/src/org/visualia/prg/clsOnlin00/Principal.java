package org.visualia.prg.clsOnlin00;

class Principal {
    public static void main(String[] main){
        complex z,w;
        z = new complex (-1.5, 3.0);
        w = new complex (-1.2 ,2.4);
        z.cxPlus (w);
        System.out.println("Complejo: "+ z.strBinomic());
    }
}
