package validador.validador.service;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class SenhaService {
	
	public Boolean validaSenha(String senha){
		return validaQtETipoCaracter(senha) && validaCaracterRepetido(senha);
	}
	
	public Boolean validaCaracterRepetido(String valor) {
		char[] array = Arrays.asList(valor.toCharArray()).get(0);
		String elemento = null;
		for(int i = 0; i< array.length; i++) {
			elemento = String.valueOf(array[i]);
			for(int u = i+1; u < array.length; u++) {  
				if(elemento.equals(String.valueOf(array[u])))					
				 return false;
			}			
	    }			
		return true;
	}
	
	public Boolean validaQtETipoCaracter(String valor) {
		return valor.matches("(?=.*[!@#$%^&*()-+])(?=.*[a-zA-Z])(?=.*[0-9]).{9,}");
	}
	
}
