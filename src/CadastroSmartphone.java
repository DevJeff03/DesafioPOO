
public class CadastroSmartphone {
	
	private int imei;
	private String fabricante;
	private String modelo;
	
	public CadastroSmartphone(int imei, String fabricante, String modelo) {
		this.imei = imei;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	public void exibirDetalhes() {
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Modelo: " + modelo);
		System.out.println("imei: " + imei);
		System.out.println();
	}
}
