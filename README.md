1-Baixe o projeto e execulte os comandos:
	mvn install spring-boot:run
	
2-A solução para validar senhas foi construída pensando em ser simples e performática.
Para parte da validação de quantidade, números e letras foi usado regex. E sem sucesso para
validação de caracteres repetidos com regex, foi criado um algoritmo de interação sobre a string e
consequentemente validação da mesma.