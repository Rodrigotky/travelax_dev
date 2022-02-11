package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.service.CalculaImc;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculaPeso{
	
	  private CalculaImc result;

	  public CalculaPeso(final CalculaImc result) {

	        this.result = result;
	    }
	
	    @RequestMapping(value = "/imc", method = RequestMethod.GET)
	    public ResponseEntity<String> imc(@RequestParam(value = "resultado", required = false) String resultado) {
	    	 var retorno = "Valor do peso: 85";
	    		 retorno += "\nValor da Altura: 1,78 \n";
	    		 retorno += "\nResultado do calculo de IMC: " + result.retornaValorValido(resultado);
		        return new ResponseEntity<>(retorno, HttpStatus.OK);
	    }
}