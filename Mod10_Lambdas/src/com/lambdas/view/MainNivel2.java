package com.lambdas.view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.lambdas.project.IOperacion;

public class MainNivel2 {

	public static void main(String[] args) {
		
	ArrayList<String> matrix = new ArrayList<String>();	
		
	matrix.add("ys3h4htkf"); matrix.add("nshaf4k396hfvdfdfd"); matrix.add("ea21345grsgaer"); 
	matrix.add("lahu34993h"); matrix.add("c3498jf"); matrix.add("x11234rfg"); matrix.add("d123");
	matrix.add("f294hn"); matrix.add("r4frb44"); matrix.add("e12k"); matrix.add("49598685940");	
	matrix.add("332");
	
	System.out.println("***NIVEL 2***");

	System.out.println("***ORDENADOR DE MENOR A MAYOR LONGITUD***");
	matrix.sort((a,b) -> a.length() - b.length());
	System.out.println(matrix);
	
	System.out.println("***ORDENADO DE MAYOR A MENOR LONGITUD***");
	matrix.sort((a,b) -> b.length() - a.length());	
	System.out.println(matrix);
	
	System.out.println("***ORDENADO ALFABÉTICAMENTE***");
	matrix.sort((a,b) -> {
		
							if(a.charAt(0) > b.charAt(0)) {
								return 1;
							} if (a.charAt(0) < b.charAt(0)) {
								return -1;
							}
							    return 0;
	                       });
	
	System.out.println(matrix);
	
	System.out.println("***ORDENADO PRIMERO INCIAL E***");
	matrix.sort((a,b) -> {
		
							if(a.charAt(0) == 101 || a.charAt(0) == 69 ) {
								return -1;
							} 
							    return 0;
					       });

   System.out.println(matrix);

	
	System.out.println("***CAMBIANDO LA A POR EL 4***");
   //salen descolocados por qué?  
   List<String> newMatrix =  matrix.stream()  
                                   .map(c -> c.replaceAll("a", "4"))
                                   .collect(Collectors.toList()); 
    System.out.println(newMatrix);
 
   
    System.out.println("***MUESTRA STRING NUMÉRICOS***");
   
    matrix.stream()
	      .map(n -> n.toCharArray())
	      .filter(n -> stringIsLetter(n))
	      .forEach(System.out::println);


    
   System.out.println("***FUNCTIONAL INTERFACE: OPERACIONES***"); 
   
   IOperacion calculatorSum = (a, b) -> {return  a + b; } ; 
   System.out.println(calculatorSum.operation(6.1f, 5.2f));
	
   IOperacion calculatorSubs = (a, b) -> {return  a - b; } ; 
   System.out.println(calculatorSubs.operation(7.8f, 1.9f));
 

   IOperacion calculatorMult = (a, b) -> {return  a * b; } ; 
   System.out.println(calculatorMult.operation(8.1f, 9.2f));
    
   
   IOperacion calculatorDiv = (a, b) -> {return  a / b; } ; 
   System.out.println(calculatorDiv.operation(6.7f, 2.5f));
   
   
}    
	
public static boolean stringIsLetter(char[] word) {
boolean find = true;

   for(char c : word) {
	  
	     if(Character.isLetter(c)) {
		     find = false;	  
	     }
    }
		
    return find;
}	


}
