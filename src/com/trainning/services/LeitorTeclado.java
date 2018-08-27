package com.trainning.services;

import java.util.Scanner;

public class LeitorTeclado {
	private static Scanner console;

	public static String lerTeclado() {
		return console.nextLine();
	}

	public static Number lerTecladoNumero() {
		console = new Scanner(System.in);
		boolean continuar = false;

		System.out.println("***  Informe um número ***");
		do {
			try {
				Double number = Double.parseDouble(console.nextLine());
				continuar = true;
				return number;
			} catch (Exception e) {
				System.out.println("Por favor informe um número válido");
			}
		} while (!continuar);

		return null;
	}

}
