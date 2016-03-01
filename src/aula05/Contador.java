package aula05;

public class Contador {
	private static int contagem = 0;
	
	public static void NovoAcesso(){
		contagem++;
	}
	public static int getQuantidadeDeAcessos(){
		return contagem;
	}
}
