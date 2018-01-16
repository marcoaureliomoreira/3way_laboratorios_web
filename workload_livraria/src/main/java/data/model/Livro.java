package data.model;

import java.util.Arrays;

public class Livro {
  	
	private long id;
	private String codigo;
	private String titulo;
	private String autor;
	private String descricao;
	private double preco;
	private byte[] imagem;
	
	public static final String NOME_COL_AUTOR_LIVRO = "autor";
	public static final String NOME_COL_COD_LIVRO = "cod_livro";
	public static final String NOME_COL_TITULO_LIVRO = "titulo";
	public static final String NOME_COL_DESC_LIVRO = "descricao";
	public static final String NOME_COL_PRECO_LIVRO = "preco";
	public static final String NOME_COL_IMAGEM_LIVRO = "imagem";
	
	public static final String DELETE_LIVRO = "DELETE from estoque e where e.id = ?;";
	public static final String CREATE_LIVRO = "INSERT into estoque (cod_livro, titulo, descricao, autor, preco, imagem) values(?, ?, ?, ?, ?, ?);";
	public static final String UPDATE_LIVRO = "UPDATE estoque e set e.? = ? where e.id = ?;";
	
	public Livro() {
		super();
	}
	public Livro(long id, String codigo, String titulo, String autor, String descricao, double preco, byte[] imagem) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + Arrays.hashCode(imagem);
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (!Arrays.equals(imagem, other.imagem))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Livro [id=" + id + ", codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", descricao="
				+ descricao + ", preco=" + preco + ", imagem=" + Arrays.toString(imagem) + "]";
	}
  }