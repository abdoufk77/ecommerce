package dao;

import java.util.List;

import entitie.Categorie;

public class CategorieDao implements ICategorieDao{

	@Override
	public List<Categorie> getCategories() {
		List<Categorie> categories = List.of(new Categorie("cat1"),new Categorie("cat2"),
				new Categorie("cat3"));
		
		return categories;
	}

}
