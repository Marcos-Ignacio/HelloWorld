package br.com.professorisidro.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// tornei a classe HelloController um Controller REST
// ou seja, expor os métodos em na forma URL

@RestController
public class HelloController {

// através desta anotação, temos um caminho URL definido
// http://localhost:8080/hello
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!!! Meu nome é Marcos e estou começando o Curso Modern Web Development";
	}
	
	@GetMapping("/hellohtml")
	public String sayHelloEmHtml() {
		return "<html>"
				+ "<body>"
				+ "<h1> Olá </h1>"
				+ "<p> Curso Modern Web Development </p>"
				+ "</body>"
				+ "</html>";
	}
}
