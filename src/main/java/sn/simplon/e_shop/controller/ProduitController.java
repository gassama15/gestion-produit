package sn.simplon.e_shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.simplon.e_shop.entity.Produit;
import sn.simplon.e_shop.service.ProduitService;

@RestController
@RequestMapping("/produit")
public class ProduitController {

	private final ProduitService produitService;

	@Autowired
	public ProduitController(ProduitService produitService) {
		this.produitService = produitService;
	}
	
	
	@GetMapping
	public ResponseEntity<List<Produit>> getAllProduits(){
		List<Produit> produits = this.produitService.getAllProduits();
		return new ResponseEntity<>(produits, HttpStatus.OK);
	}
	
	
	@GetMapping("/show/{idProduit}")
	public ResponseEntity<Produit> getProduitById(@PathVariable("idProduit") Long idProduit){
		Produit produit = this.produitService.findProduitById(idProduit);
		return new ResponseEntity<>(produit, HttpStatus.OK);
	}
	
	
	@PostMapping("/new")
	public ResponseEntity<Produit> addProduit(@RequestBody Produit produit){
		Produit newProduit = this.produitService.addProduit(produit);
		return new ResponseEntity<>(newProduit, HttpStatus.CREATED);
	}
	
	
	
	@PutMapping("/update")
	public ResponseEntity<Produit> updateProduit(@RequestBody Produit produit){
		Produit updatedProduit = this.produitService.updateProduit(produit);
		return new ResponseEntity<>(updatedProduit, HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/delete/{idProduit}")
	public ResponseEntity<?> deleteProduit(@PathVariable("idProduit") Long idProduit){
		this.produitService.deleteProduit(idProduit);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
