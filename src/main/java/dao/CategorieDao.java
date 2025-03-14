package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entitie.Categorie;
import util.JpaUtil;

public class CategorieDao implements ICategorieDao{

	EntityManager entityManager = JpaUtil.getEntityManager();
	
	@Override
	public List<Categorie> getCategories() {
		return entityManager.createQuery("SELECT c FROM Categorie c",Categorie.class).getResultList();
	}

	@Override
	public void ajouterCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorie(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppmierCategorie(Long id) {
		// TODO Auto-generated method stub
		
	}

}
