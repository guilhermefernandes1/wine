package com.algaworks.wine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.wine.model.Vinho;
import com.algaworks.wine.repository.Vinhos;

@Service
public class CadastraVinhoService {

	@Autowired
	private Vinhos vinhoRepo;
	
	public void save(Vinho vinho){
		this.vinhoRepo.save(vinho);
	}
}