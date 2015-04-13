package org.visualia.prg.clsOnlin00.exceptions;

public class Exceptions {
    public static void main(String args[]) {
        try {
        	//metodo principal llama a metodo a()
            a();
        }// Imprimir la pila de llamadas de excepciones
        /*catch(HighLevelException e) {
         		e.printStackTrace();
        }*/
        //Llamada al método GetStackTrace
        catch (Exception cause) {
        	System.out.println("-----MainLevelException--------");
            StackTraceElement elements[] = cause.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {       
                System.err.println(elements[i].getFileName()
                    + ":" + elements[i].getLineNumber() 
                    + ">> "
                    + elements[i].getMethodName() + "()");
            }
            System.out.println("--------------------------");
        }
    }
    static void a() throws HighLevelException {
        try {
        	//Metodo a() llama a metodo b()
            b();
        } catch(MidLevelException e) {
        	 System.out.println("----MidLevelException a()----");
        	StackTraceElement elements[] = e.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {       
                System.err.println(elements[i].getFileName()
                + ":" + elements[i].getLineNumber() 
                + ">> "
                + elements[i].getMethodName() + "()");
            }
            System.out.println("------------------------");
            throw new HighLevelException(e);
        }
    }
    static void b() throws MidLevelException {
    	//Metodo b() llama a metodo c()
        try{ c();
        }catch(MidLevelException e) {
        System.out.println("-----MidLevelException b()----");
        StackTraceElement elements[] = e.getStackTrace();
        for (int i = 0, n = elements.length; i < n; i++) {       
        	System.err.println(elements[i].getFileName()
        	+ ":" + elements[i].getLineNumber() 
           	+ ">> "
           	+ elements[i].getMethodName() + "()");
           	}
        	System.out.println("------------------------");
        	throw new MidLevelException(e);
        }
    }
    
    static void c() throws MidLevelException {
    	//Captura LowLevelException en el bloque.
    	//Si se produce, genera MidLevelException.
        try {
        	//Metodo c() llama a metodo d()
            d();
        } catch(LowLevelException e) {
        	System.out.println("-----LowLevelException c()----");
            StackTraceElement elements[] = e.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {       
            	System.err.println(elements[i].getFileName()
            	+ ":" + elements[i].getLineNumber() 
               	+ ">> "
               	+ elements[i].getMethodName() + "()");
            }
            System.out.println("------------------------");
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