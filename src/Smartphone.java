public class Smartphone{
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone(123456789, "Apple","Iphone");
		iphone.exibirDetalhes();
		
		iphone.abrirReprodutorMusical();
		iphone.tocarMusica();
		iphone.pausarMusica();
		iphone.selecionarMusica();
		iphone.avancarMusica();
		iphone.reproduzirMusicaAnterior();
		iphone.fecharReprodutorMusical();
		System.out.println();
		
		iphone.abrirTelefone();
		iphone.ligar();
		iphone.atender();
		iphone.recusarLigacao();
		iphone.iniciarCorreioVoz();
		iphone.fecharTelefone();
		System.out.println();
		
		iphone.abrirNavegador();
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.fecharAba();
		iphone.atualizarPagina();
		iphone.fecharNavegador();	
		System.out.println();
	}
}
