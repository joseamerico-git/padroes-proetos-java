# padroes-proetos-java

Dicas:

Contar os desafios que você superou?
E por que tomou determinadas decisões em seu projeto.

Utilizar o GitHub

Colocar o link do repositório e uma breve descrição, quando for entregar o projeto.

Frase interessante

"Alguém está sentado na sombra hoje porque alguém plantou uma árvore há muito tempo." Warrer Buffet

"Falar é fácil. Mostre-me o código" Linus Trovalds (Criador do núcleo Linux)

# Desafios de projetos.

Imagens para agregar conhecimentos.

![Alt text](image.png)

![Alt text](image-1.png)

![Alt text](image-2.png)

# Praticando com Java Puro: Singleton

# Singleton 

Permitir a criação de uma única instância de uma classe e fornecer um modo de recuperá-lo.

# Facade

Prove uma interface que reduza a complexidade nas interações com busistemas.

Client --> Facade --> Optional Aditional

Abstrair a complexidade em subsistemas

Praticando com Spring: Conhecendo Projeto Base

[Spring Initialzr](https://start.spring.io/)

Criar um projeto com maven project --> jar --> dependencias web, jpa, h2 e openfinger

Para gerar o pojo pelo site pegamos a estrutura JSON no site do viacep pegar o JSON e colocamos em [Gerador de Pojo](https://www.jsonschema2pojo.org/) 

# Incluimos as dependências do 

```
    	<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui -->
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.7.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.10.5</version>
		</dependency>

```

para testar http://localhost:8080/swagger-ui/index.html


