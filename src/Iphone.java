import com.funcionalidades.AparelhoTelefonico;
import com.funcionalidades.NavegadorInternet;
import com.funcionalidades.ReprodutorMusical;

public class Iphone extends CadastroSmartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet  {
	
	public Iphone(int imei, String marca, String modelo) {
		super(imei, marca, modelo);
	}


	@Override
	public void abrirNavegador() {
		System.out.println("Abrindo navegador da internet.");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina da internet.");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta.");
		
	}

	@Override
	public void fecharAba() {
		System.out.println("Aba fechada.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina web.");
		
	}

	@Override
	public void fecharNavegador() {
		System.out.println("Navegador da Internet encerrado.");
		
	}

	@Override
	public void abrirTelefone() {
		System.out.println("Abrindo aparelho telefonico.");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando.");
		
	}

	@Override
	public void atender() {
		System.out.println("Ligacao recebida.");
		
	}

	@Override
	public void recusarLigacao() {
		System.out.println("Chamada recusada.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
		
	}

	@Override
	public void fecharTelefone() {
		System.out.println("Aplicacao telefonica encerrada.");
		
	}

	@Override
	public void abrirReprodutorMusical() {
		System.out.println("Abrindo reprodutor musical.");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Play.");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pause.");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Reproduzindo musica selecionada.");
		
	}

	@Override
	public void avancarMusica() {
		System.out.println("Reproduzindo proxima musica.");
		
	}

	@Override
	public void reproduzirMusicaAnterior() {
		System.out.println("Reproduzindo musica anterior.");
		
	}

	@Override
	public void fecharReprodutorMusical() {
		System.out.println("Reproddutor musical encerrado.");
		
	}
	
}
