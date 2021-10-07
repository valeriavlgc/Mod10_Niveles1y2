package com.lambdas.view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.lambdas.project.IPiValue;
import com.lambdas.project.IReverse;

public class Main {

	public static void main(String[] args) {
						
		List<String> nombres = new ArrayList<String>();
		nombres.add("Valeria"); nombres.add("Ana"); nombres.add("Pedro"); nombres.add("Luca");
		nombres.add("Milagros"); nombres.add("Tom"); nombres.add("Eduardo"); nombres.add("Yolanda");
		
		System.out.println("***NIVEL 1***/Fase 1");
		System.out.println("***FILTRADOS POR INICIAL (A) Y LONGITUD NOMBRE (3)***");
		List<String> resultNames = nombres.stream()
										  .filter(n -> n.charAt(0) == 'A' && n.length() == 3)
										  .collect(Collectors.toList());
		resultNames.forEach(System.out::println);

		System.out.println("***PARES(E) E IMPARES(O)***");
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(7); numList.add(6); numList.add(1); numList.add(2); numList.add(4); numList.add(3);
		
		String stringResult = numList.stream()
				                     .map(n -> String.valueOf(n) + esPar(n) + ",")    
				                     .collect(Collectors.joining());        
		System.out.println(stringResult);
	
		 
		System.out.println("***FILTRADOS POR CONTENER LA LETRA O***");
		
		List<String> resultStrings = nombres.stream()
										    .filter(n -> n.contains("o"))
											.collect(Collectors.toList());
		
		resultStrings.forEach(System.out::println);
		
		
		System.out.println("***FILTRADOS POR CONTENER LA LETRA O Y MÁS DE 5 CHAR***");
		
		List<String> resultStrings1 = nombres.stream()
												.filter(n -> n.contains("o") && n.length() > 5)
											    .collect(Collectors.toList());
		resultStrings1.forEach(System.out::println);
		

		System.out.println("***MESES/Lambda***");
		
		List<String> months = new ArrayList<String>();
		months.add("Enero"); months.add("Febrero"); months.add("Marzo"); months.add("Abril"); 
		months.add("Mayo"); months.add("Junio"); months.add("Julio"); months.add("Agosto"); 
		months.add("Septiembre"); months.add("Octubre"); months.add("Noviembre"); months.add("Diciembre"); 
		
		months.forEach(m -> System.out.println(m));
	
		System.out.println("***MESES/MethodRef***");
		
		months.forEach(System.out::println);
	

		System.out.println("***Fase 2: Functional Interface (PiValue)***"); 
		
		IPiValue piValue = () -> { return 3.1415; };
		
	    System.out.println(piValue.getPiValue());	
		       	            

	    System.out.println("***Fase 3: Functional Interface (Reverse)***"); 
	    
	    IReverse reversed = (a) -> { String b = "";

									       for(int i = a.length() - 1; i >=0; i--) {
											b += a.charAt(i);
										    }
										
									    return b;
	    	  
	                               };
   
        System.out.println(reversed.reverse("Valeria"));
										
		
		
	}

	public static String esPar(int numero) {
		if (numero%2 == 0) {
			return "e";
		} else {
			return "o";
		}
	}
	
}
