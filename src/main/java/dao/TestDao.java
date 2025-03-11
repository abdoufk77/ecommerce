package dao;

import java.util.List;

import javax.persistence.EntityManager;


import entitie.Categorie;
import entitie.Produit;
import util.JpaUtil;


public class TestDao {

	public static void main(String[] args) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		Categorie categorie = new Categorie("Electornique");
		Produit p1 = new Produit("Smartphone",2000.0,5,categorie);
		Produit p2 = new Produit("Ordinateur",5000.0,3,categorie);
		
		
		categorie.setProduits(List.of(p1,p2));
		entityManager.persist(categorie);
		
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
