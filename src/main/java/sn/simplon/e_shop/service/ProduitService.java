package sn.simplon.e_shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.simplon.e_shop.dao.ProduitRepository;
import sn.simplon.e_shop.entity.Produit;
import sn.simplon.e_shop.exception.ProduitNotFoundException;

@Service
public class ProduitService {
	private final ProduitRepository produitRepository;

	@Autowired
	public ProduitService(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}
	
	
	public Produit addProduit(Produit produit) {
		return this.produitRepository.save(produit);
	}
	
	
	public List<Produit> getAllProduits() {
		return this.produitRepository.findAll();
	}
	
	
	public Produit updateProduit(Produit produit) {
		return this.produitRepository.save(produit);
	}
	
	public Produit findProduitById(Long id) {
		return this.produitRepository.findProduitByIdProduit(id)
				.orElseThrow(() -> new ProduitNotFoundException("Produit avec id "+id+" n'existe pas"));
	}
	
	public void deleteProduit(Long id) {
//		this.produitRepository.deleteProduitByIdProduit(id);
		this.produitRepository.deleteById(id);
	}
}
