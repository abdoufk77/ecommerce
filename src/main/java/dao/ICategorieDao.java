package dao;

import java.util.List;

import entitie.Categorie;

public interface ICategorieDao {
	List<Categorie> getCategories();
	Categorie getById(Long id);
	List<Categorie> categoriesParMc(String mc);
	void save(Categorie categorie);
	void edit(Long id,Categorie categorie);
	void delete(Long id);
}
