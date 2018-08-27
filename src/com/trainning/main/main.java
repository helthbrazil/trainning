package com.trainning.main;

import com.trainning.services.ListaEncadeada;

public class main {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.adiciona(2);
		lista.adiciona(4);
		lista.adiciona("Hebert");
		lista.adiciona(6);
		
		System.out.println(lista);
		
		lista.adicionaNoComeco("João");
		
		System.out.println(lista);
		
		lista.adiciona("Pedro");
		
		System.out.println(lista);
		
	}
}
