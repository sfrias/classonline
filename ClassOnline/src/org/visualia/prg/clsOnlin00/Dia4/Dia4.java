package org.visualia.prg.clsOnlin00.Dia4;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Dia4 {

	public static void main(String[] valor) {

		// TODO Auto-generated method stub
		  
		  //ARRAYS
		
		  //Declaración de un array
		  int[] array=new int[5]; 
		  
		  //Inicializar un array
		   
		  array[0]=15; 
		  array[1]=17; 
		  array[2]=15;
		  array[3]=17; 
		  array[4]=15;
		 
         int[] array2={15,45,6,7,9,56,767,56,765,75,};
		 
         //Imprimir/Recorrer datos de un array
          
         System.out.println(array[5]);
		 
         for(int index=0;index<array.length;index++){
		     System.out.println(array[index]); 
	     
	     }
		
		 int cont=0; //Contador del índice
		 for(int dato:array){
			  cont++;
		      System.out.println(dato); 
		 }
		
         //ARRAYS BIDIMENSIONALES

		//Declaración
		int[][] matriz = new int[2][3];
		
		//Inicialización
		matriz[0][0] = 23;
		matriz[0][1] = 34;
		matriz[0][2] = 15;
		matriz[1][0] = 17;
		matriz[1][1] = 20;
		matriz[1][2] = 67;

	   //Imprimir/Recorrer array
	   System.out.println(matriz[0][2]);

	   for(int indice=0;indice<2;indice++){ 
			  System.out.println(""); 
		       for(int indice2=0;indice2<3;indice2++){
		         System.out.print(matriz[indice][indice2]+" "); }
	   }
		
	   for(int[] fila:matriz){ 
			  System.out.println(""); 
			  for(int val:fila){
		         System.out.print(val+" "); 
		     } 
	   }
		 
	   
	   //ARRAYLIST
        
	    //Declaración
	    ArrayList<Integer> lista = new ArrayList<Integer>();
		
	    //Métodos
	    lista.size(); // Longitud
		lista.add(7);
		lista.add(9);
		lista.add(8);
		lista.add(0, 56);
		lista.add(67);
		lista.get(0);
		lista.remove(0);
		lista.clear();
		lista.set(1, 19);
		if (lista.contains(9)) {

		}
		;

		if (lista.indexOf(9) != -1) {

		}
        
		//Recorrer lista
		for (Integer val : lista) {
			System.out.println(val);
		}

		for (int i = 0; i < lista.size(); i++) {

			System.out.println(lista.get(i));

		}
        
		
		//VECTOR
		
		//Declaración
		Vector<Integer> vector = new Vector<Integer>();
		Vector vector2=new Vector();
		
		//Métodos
		vector.add(67);
		vector.insertElementAt(0, 78);
		vector.elementAt(9);
		
		vector.contains(valor);
		vector.elementAt(0);
		
	    //HASHMAP
		//Declaración
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
	   //Métodos	
		
		map.put(2, "34534");
		map.get(2);
		map.remove(2);
	    
		Set<Integer> keys=map.keySet();
		for(Integer key:keys){
			String valor2=map.get(key);
		}

	}

}