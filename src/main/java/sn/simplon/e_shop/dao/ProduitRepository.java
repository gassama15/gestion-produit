package sn.simplon.e_shop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.simplon.e_shop.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	void deleteProduitByIdProduit(Long idProduit);

	Optional<Produit> findProduitByIdProduit(Long idProduit);

}
