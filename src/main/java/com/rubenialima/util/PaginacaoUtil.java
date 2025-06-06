package com.rubenialima.util;

import java.util.List;

public class PaginacaoUtil<T> {
	private int tamanho;
	private int pagina;
	private int totalPaginas;
	private List<T> registro;
	
	
	public PaginacaoUtil(int tamanho, int pagina, int totalPaginas, List<T> registro) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalPaginas = totalPaginas;
		this.registro = registro;
	}


	public int getTamanho() {
		return tamanho;
	}


	public int getPagina() {
		return pagina;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}


	public List<T> getRegistro() {
		return registro;
	}


}
