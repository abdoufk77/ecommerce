package service;

import java.util.ArrayList;
import java.util.List;

import dao.CategorieDao;
import dao.ICategorieDao;
import dto.CategorieDTO;
import entitie.Categorie;


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

	@Override
	public void ajouterCategorie(CategorieDTO categorieDTO) {
		Categorie categorie = new Categorie();
		categorie.setName(categorieDTO.getName());
		categorieDao.save(categorie);
	}

	@Override
	public void supprimerCategorie(Long id) {
		categorieDao.delete(id);
	}

	@Override
	public CategorieDTO getCategorieById(Long id) {
		Long Id = categorieDao.getById(id).getId();
		String Name = categorieDao.getById(Id).getName();
		return new CategorieDTO(Id,Name);
	}

	@Override
	public void editCategorie(Long id,CategorieDTO categorieDTO) {
		Categorie categorie = new Categorie();
		categorie.setId(id);
		categorie.setName(categorieDTO.getName());
		categorieDao.edit(id,categorie);
	}

	@Override
	public List<CategorieDTO> getCategorieByMc(String motCle) {
		List<CategorieDTO> listCategByMCate = new ArrayList<CategorieDTO>();
		new CategorieDao().categoriesParMc(motCle).forEach(categorie ->{
			listCategByMCate.add(new CategorieDTO(categorie.getId(), categorie.getName()));
		});
		
		return listCategByMCate;
	}


}
