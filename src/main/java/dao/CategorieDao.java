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
	public void save(Categorie categorie) {
		entityManager.getTransaction().begin();
		entityManager.persist(categorie);
		entityManager.getTransaction().commit();
	}

	@Override
	public void edit(Long id,Categorie Newcategorie) {
		entityManager.getTransaction().begin();
		Categorie categorie = entityManager.find(Categorie.class, id);
		if(categorie != null) {
			categorie.setName(Newcategorie.getName());
			entityManager.getTransaction().commit();
		}
	}

	@Override
	public void delete(Long id) {
		entityManager.getTransaction().begin();
		Categorie categorie = entityManager.find(Categorie.class, id);
		if(categorie != null) {
			entityManager.remove(categorie);
			entityManager.getTransaction().commit();
		}
	}

	@Override
	public Categorie getById(Long id) {
		return entityManager.find(Categorie.class, id);
	}

	@Override
	public List<Categorie> categoriesParMc(String mc) {
		return entityManager.createQuery("SELECT c FROM Categorie c WHERE LOWER(c.name) LIKE LOWER(:mc)", Categorie.class)
                .setParameter("mc", "%" + mc + "%") 
                .getResultList();
	}

	

}
