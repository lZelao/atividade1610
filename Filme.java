package atividade1610;



public class Filme extends Publicacao {
 private String diretor;
 private String atorPrincipal;
 private String sinopse;
 private int duracao;

 public Filme(
		 String titulo,
		 String autor,
		 int anoPublicacao,
		 String genero,
		 String editora,
		 int quantidadeDisponivel,
		 String diretor,
		 String atorPrincipal,
		 String sinopse,
		 int duracao) {
	 
     super(
    		 titulo,
    		 autor, 
    		 anoPublicacao,
    		 genero,
    		 editora,
    		 quantidadeDisponivel);
     this.diretor = diretor;
     this.atorPrincipal = atorPrincipal;
     this.sinopse = sinopse;
     this.duracao = duracao;
 }

 public String getDiretor() {
     return diretor;
 }

 public String getAtorPrincipal() {
     return atorPrincipal;
 }

 public String getSinopse() {
     return sinopse;
 }

 public int getDuracao() {
     return duracao;
 }
 @Override
 public void imprimirDados() {
     System.out.println("Filme: " + getTitulo() + ", Diretor: " + diretor + ", Ator Principal: " + atorPrincipal + ", Sinopse: " + sinopse + ", Duração: " + duracao + " minutos");
 }
}
