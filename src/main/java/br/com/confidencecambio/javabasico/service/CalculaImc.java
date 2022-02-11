package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CalculaImc {
	
	private static final double altura = 1.78;
    private static final double peso = 85;

    private static final double result = peso/Math.pow(altura, 2);; 
    
    String imc = String.valueOf(result);

    public String retornaValorValido(@Nullable String resultado) {
        return Optional.ofNullable(resultado).orElse(imc);
    }
}
