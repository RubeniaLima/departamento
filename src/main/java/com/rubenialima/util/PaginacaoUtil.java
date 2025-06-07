package com.rubenialima.util;

import java.util.List;

public class PaginacaoUtil<T> {
	private int tamanho;
	private int pagina;
	private long totalDePaginas;
	private List<T> registro;
	
	
	public PaginacaoUtil(int tamanho, int pagina, long totalDePaginas, List<T> registro) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalDePaginas = totalDePaginas;
		this.registro = registro;
	}


	public PaginacaoUtil() {
		super();
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public int getPagina() {
		return pagina;
	}


	public void setPagina(int pagina) {
		this.pagina = pagina;
	}


	public long getTotalDePaginas() {
		return totalDePaginas;
	}


	public void setTotalDePaginas(int totalDePaginas) {
		this.totalDePaginas = totalDePaginas;
	}


	public List<T> getRegistro() {
		return registro;
	}


	public void setRegistro(List<T> registro) {
		this.registro = registro;
	}
	
	
	

}
