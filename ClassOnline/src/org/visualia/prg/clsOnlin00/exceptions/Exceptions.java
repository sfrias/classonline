package org.visualia.prg.clsOnlin00.exceptions;

public class Exceptions {
    public static void main(String args[]) {
        try {
        	//metodo principal llama a metodo a()
            a();
        } catch(HighLevelException e) {
            e.printStackTrace();
        }
    }
    static void a() throws HighLevelException {
        try {
        	//Metodo a() llama a metodo b()
            b();
        } catch(MidLevelException e) {
            throw new HighLevelException(e);
        }
    }
    static void b() throws MidLevelException {
    	//Metodo b() llama a metodo c()
        c();
    }
    static void c() throws MidLevelException {
    	//Captura LowLevelException en el bloque.
    	//Si se produce, genera MidLevelException.
        try {
        	//Metodo c() llama a metodo d()
            d();
        } catch(LowLevelException e) {
            throw new MidLevelException(e);
        }
    }
    static void d() throws LowLevelException {
    	//Metodo d() llama a metodo e()
       e();
    }
    static void e() throws LowLevelException {
    	//Metodo e() genera Excepcion definida.
        throw new LowLevelException();
    }
}
//Tres clases extendidas desde Exception

class HighLevelException extends Exception {
    HighLevelException(Throwable cause) { super(cause); }
}

class MidLevelException extends Exception {
    MidLevelException(Throwable cause)  { super(cause); }
}

class LowLevelException extends Exception {
}