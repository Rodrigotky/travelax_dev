package br.com.confidencecambio.javabasico.funcao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Robo{

	public void Robo(String nome) {	
		String primeiro;
		String meio = "" ; 
		String ultimo;
			    
		      String[] nomes = nome.split(" ");
		      
		      primeiro = nomes[0];
	
		      for (int i = 1; i < nomes.length - 1; i++) 
		      {
		          if (!nomes[i].toLowerCase().equals("de") &&
		        	  !nomes[i].toLowerCase().equals("da") && 
		        	  !nomes[i].toLowerCase().equals("do") && 
		        	  !nomes[i].toLowerCase().equals("das") && 
		        	  !nomes[i].toLowerCase().equals("dos"))
		          {
		               meio += nomes[i].substring(0, 1); 
		               meio += ". "; 
		          }
		      }
		      ultimo = nomes[nomes.length-1];
		      
		      System.out.println("O primero nome é: " + primeiro); 
		      System.out.println("Sobrenome é: " + ultimo);
		      System.out.println("Todas em letra maiúsculas: " + nome.toUpperCase());
		      System.out.println("O nome abreviado é: " + primeiro + " " + meio + ultimo);
	}
}