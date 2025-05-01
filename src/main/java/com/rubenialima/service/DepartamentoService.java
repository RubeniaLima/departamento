package com.rubenialima.service;

import java.util.List;


import com.rubenialima.domain.Departamento;

public interface DepartamentoService {
	
void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);

}
