### Orientações
------------

Baixe o projeto e execulte os comandos:
- mvn install 
- spring-boot:run
	
	
### Sobre a solução

------------

A solução para validação de senhas foi construída pensando em ser simples e performática. 
Para a parte da validação de quantidade, números e letras, foi usado regex. 
Como não houve sucesso na validação de caracteres repetidos com regex, foi criado um algoritmo de interação sobre a string e, a partir disso, foi possível efetuar a validação da mesma.
