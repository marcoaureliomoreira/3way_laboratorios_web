package data.dao;

import java.util.Iterator;
import java.util.List;

import data.model.Livro;

public class TestaLivroDao {

	public static void main(String[] args) {
		LivroDao livroDao = new LivroDao();
		
		List<Livro> listeLivro = livroDao.listeLivro();
		Iterator<Livro> iterator = listeLivro.iterator();
		while (iterator.hasNext()) {
			Livro livro = (Livro) iterator.next();
			System.out.println("Livro: " + livro);
		}

	}

}
