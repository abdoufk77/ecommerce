package service;

import java.util.List;

import dto.CategorieDTO;


public interface ICategoireService {
	List<CategorieDTO> getAllCategorie();
	CategorieDTO getCategorieById(Long id);
	void ajouterCategorie(CategorieDTO categorie);
	void supprimerCategorie(Long id);
	void editCategorie(Long id,CategorieDTO categorieDTO);
	List<CategorieDTO> getCategorieByMc(String motCle);
}
