package validador.validador;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import validador.validador.service.SenhaService;

@Configuration
public class TestConfig {
	
	@Bean
    public SenhaService senhaService(){
        return new SenhaService();
    }
}
