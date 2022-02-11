package br.com.confidencecambio.javabasico;

import java.util.Scanner;
import br.com.confidencecambio.javabasico.funcao.Cliente;
import br.com.confidencecambio.javabasico.funcao.Gerente;
import br.com.confidencecambio.javabasico.funcao.Robo;

public class GerarNome{
	public static void main(String[] args) {
			
			Scanner input = new Scanner (System.in);
			String tipo;
			String nome;	
			
			Cliente cliente = new Cliente();
			Gerente gerente = new Gerente();
			Robo robo = new Robo();
			
			System.out.println("Tipo: Cliente/Gerente/Robo ");
			System.out.printf("\nDigite o tipo que deseja: ");
			tipo = input.nextLine();
			
			
				while (tipo == null || tipo.isEmpty() ) {
					System.out.println("Por favor preencha o tipo.");
					
					System.out.println("Tipo: Cliente/Gerente/Robo ");
				    System.out.printf("\nDigite o tipo que deseja: ");
				    tipo = input.nextLine();
				    
				} 

				if (tipo.equalsIgnoreCase("Cliente")){
			    	System.out.printf("\nDigite o nome completo do cliente: ");
				    nome = input.nextLine();			    
				    if(nome == null || nome.isEmpty()) {				    	
				    	System.out.println("Preencha o nome");
				    	System.out.printf("\nDigite o nome completo do cliente: ");
					    nome = input.nextLine();
				    } else {
				    	cliente.Cliente(nome);					    	
				    }
			    		    	
			    }
			    if ( tipo.equalsIgnoreCase("Gerente")){
			    	System.out.printf("\nDigite o nome completo do gerente: ");
				    nome = input.nextLine();
				    if(nome == null || nome.isEmpty() ) {
				    	System.out.println("Preencha o nome");
				    	System.out.printf("\nDigite o nome completo do gerente: ");
					    nome = input.nextLine();
				    } else {
				    	gerente.Gerente(nome);
				    }
			    	
			    }
			    if ( tipo.equalsIgnoreCase("Robo")){	
			    	System.out.printf("\nDigite o nome completo do robo: ");
				    nome = input.nextLine();
				    if(nome == null || nome.isEmpty() ) {
				    	System.out.println("Preencha o nome");
				    	System.out.printf("\nDigite o nome completo do robo: ");
					    nome = input.nextLine();
				    } else {
				    	robo.Robo(nome);
				    }
			    }
	    	}
	}
		
