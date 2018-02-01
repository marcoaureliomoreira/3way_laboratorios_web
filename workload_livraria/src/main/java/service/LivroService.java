package service;

import java.util.List;

import data.dao.LivroDao;
import data.model.Livro;

public class LivroService {
	
	private LivroDao livroDao;
	
	public List<Livro> listeLivros (){
		livroDao = new LivroDao ();
		return null;
	}

}
