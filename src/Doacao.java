import java.time.LocalDateTime; 
public class Doacao {
	private int id_donativo;
	private LocalDateTime dataDoacao;
	private String CPF_doador;
	private String CNPJ_doador;
	
	public void DoacaoInst(String id_doador) {
		
	}
	public void DoacaoPF(String id_doador) {
		this.CPF_doador = id_doador;
		setDataDoacao();
		//TODO: Gerar os códigos de produto garantindo sua unicidade
		setId_donativo(id_donativo);
	}
	
	public int getId_donativo() {
		return id_donativo;
	}
	private void setId_donativo(int id_donativo) {
		this.id_donativo = id_donativo;
	}
	public LocalDateTime getDataDoacao() {
		return dataDoacao;
	}
	private void setDataDoacao() {
		this.dataDoacao = LocalDateTime.now();
	}
	public String getCPF_doador() {
		return CPF_doador;
	}
	public void setCPF_doador(String cPF_doador) {
		CPF_doador = cPF_doador;
	}
	public String getCNPJ_doador() {
		return CNPJ_doador;
	}
	public void setCNPJ_doador(String cNPJ_doador) {
		CNPJ_doador = cNPJ_doador;
	}
	
	
}
