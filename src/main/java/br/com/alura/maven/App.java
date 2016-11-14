package br.com.alura.maven;

public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Bala juquinha", 1.0);
		System.out.println(String.format("O produto %s custa %f", produto.getNome(), produto.getPreco()));
		
		System.out.println("Hello World!");
	}
}
