package service;

import java.util.ArrayList;
import java.util.List;

import dao.CategorieDao;
import dao.ICategorieDao;
import dto.CategorieDTO;


public class CategoireServiceImp implements ICategoireService{
	
	private ICategorieDao categorieDao;

	@Override
	public List<CategorieDTO> getAllCategorie() {
		categorieDao = new CategorieDao();
		List<CategorieDTO> categories = new ArrayList<>();
		
		categorieDao.getCategories().forEach(categorie ->{
			Long id = categorie.getId();
			String name= categorie.getName();
			categories.add(new CategorieDTO(id, name));
		});
		
		return categories;
	}


}
