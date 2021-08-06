package sn.simplon.e_shop.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "produit")
public class Produit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProduit;
	private String description;
	private boolean disponibilite;
	private String photo;
	private Long prix;
	private Long qte;
	private String categorie;
	
	
	public Produit() {
	}


	public Produit(String nomProduit, String description, boolean disponibilite, String photo, Long prix, Long qte,
			String categorie) {
		this.nomProduit = nomProduit;
		this.description = description;
		this.disponibilite = disponibilite;
		this.photo = photo;
		this.prix = prix;
		this.qte = qte;
		this.categorie = categorie;
	}


	public Produit(Long idProduit, String nomProduit, String description, boolean disponibilite, String photo,
			Long prix, Long qte, String categorie) {
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.description = description;
		this.disponibilite = disponibilite;
		this.photo = photo;
		this.prix = prix;
		this.qte = qte;
		this.categorie = categorie;
	}


	public Long getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}


	public String getNomProduit() {
		return nomProduit;
	}


	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isDisponibilite() {
		return disponibilite;
	}


	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Long getPrix() {
		return prix;
	}


	public void setPrix(Long prix) {
		this.prix = prix;
	}


	public Long getQte() {
		return qte;
	}


	public void setQte(Long qte) {
		this.qte = qte;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", description=" + description
				+ ", disponibilite=" + disponibilite + ", photo=" + photo + ", prix=" + prix + ", qte=" + qte
				+ ", categorie=" + categorie + "]";
	}
	
	
	
	
	

}
