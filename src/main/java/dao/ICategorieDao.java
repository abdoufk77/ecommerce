package dao;

import java.util.List;

import entitie.Categorie;

public interface ICategorieDao {
	List<Categorie> getCategories();
	void ajouterCategorie(Categorie categorie);
	void modifierCategorie(Long id);
	void suppmierCategorie(Long id);
}
