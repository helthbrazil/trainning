package com.trainning.services;

import com.trainning.interfaces.IListaEncadeada;
import com.trainning.model.Celula;

public class ListaEncadeada implements IListaEncadeada {
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;

	@Override
	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}

	}
	
	@Override
	public String toString() {
		  // Verificando se a Lista está vazia
		  if(this.totalDeElementos == 0){
		    return "[]";
		  }
		  
		  StringBuilder builder = new StringBuilder("[");
		  Celula atual = primeira;

		  // Percorrendo até o penúltimo elemento.
		  for (int i = 0; i < this.totalDeElementos - 1; i++) {
		    builder.append(atual.getElemento());
		    builder.append(", ");
		    atual = atual.getProxima();
		  }

		  // último elemento
		  builder.append(atual.getElemento());
		  builder.append("]");
		  
		  return builder.toString();
	}
	

	@Override
	public void adiciona(int posicao, Object elemento) {

	}

	@Override
	public Object pega(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int posicao) {
		// TODO Auto-generated method stub

	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contem(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;

		if (this.totalDeElementos == 0)
			this.ultima = this.primeira;

		this.totalDeElementos++;
	}

	@Override
	public void removeDoComeco() {

	}

	@Override
	public void removeDoFim() {
		// TODO Auto-generated method stub

	}

}
