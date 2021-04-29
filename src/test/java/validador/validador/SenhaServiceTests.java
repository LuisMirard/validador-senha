package validador.validador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.mockito.junit.MockitoJUnitRunner;


import validador.validador.service.SenhaService;

@RunWith(MockitoJUnitRunner.class)
public class SenhaServiceTests {
	
	
	SenhaService senhaService = new SenhaService();
	
	@Test 
	public void validaSenhaErradas() { 		
		Assertions.assertEquals(senhaService.validaSenha("av"), false);
		Assertions.assertEquals(senhaService.validaSenha("AbTp9!foo"), false); 
		 		
	}
	
	@Test 
	public void validaSenhaCorretas() {
		Assertions.assertEquals(senhaService.validaSenha("AbTp9!fok"), true);
		Assertions.assertEquals(senhaService.validaSenha("AbTp9!f21"), true);
	}

}
