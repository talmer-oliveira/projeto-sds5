package com.talmer.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talmer.dsvendas.dto.SellerDTO;
import com.talmer.dsvendas.entities.Seller;
import com.talmer.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){
		List<Seller> sellers = sellerRepository.findAll();
		return sellers.stream().map(s -> new SellerDTO(s.getId(), s.getName())).collect(Collectors.toList());
	}
	
}
