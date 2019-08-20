package com.lauroago.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauroago.cursomc.domain.Categoria;
import com.lauroago.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar (Integer id){
		
		Optional <Categoria> obj = repo.findById(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado! Id:" + id + ", Tipo:" + Categoria.class.getName());


		}
		return obj.orElse(null);
	}
}
