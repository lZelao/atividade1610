package atividade1610;


public class Livro extends Publicacao {
 private int edicao;
 private String isbn;

 public Livro(
		 String titulo,
		 String autor,
		 int anoPublicacao,
		 String genero,
		 String editora,
		 int quantidadeDisponivel,
		 int edicao,
		 String isbn
		 ) {
     super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
     this.edicao = edicao;
     this.isbn = isbn;
 }

 public int getEdicao() {
     return edicao;
 }

 public String getIsbn() {
     return isbn;
 }

 @Override
 public void imprimirDados() {
     System.out.println("Livro: " + getTitulo() + ", Autor: " + getAutor() + ", Ano de Publicação: " + getAnoPublicacao() + ", Gênero: " + getGenero() +
             ", Editora: " + getEditora() + ", Quantidade Disponível: " + getQuantidadeDisponivel() + ", Edição: " + edicao + ", ISBN: " + isbn);
 }
}
