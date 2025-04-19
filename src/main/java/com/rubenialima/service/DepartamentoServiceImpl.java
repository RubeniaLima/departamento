package com.rubenialima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rubenialima.dao.DepartamentoDao;
import com.rubenialima.domain.Departamento;


@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;
	
	@Transactional
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
	}
	
	@Transactional
	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}
	
	@Transactional
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}
	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Departamento> buscarTodos() {
		
		return dao.findAll();
	}

}
