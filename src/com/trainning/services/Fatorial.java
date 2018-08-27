package com.trainning.services;

public class Fatorial {

	public static int fatorial(int n) {
		if (n == 1)
			return n;

		int fat = fatorial(n - 1) * n;
		return fat;
	}

}
