package br.com.step.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConsultaCep {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String uf;

	private String complemento;

	private String logradouro;

	private String bairro;

	private String localidade;

	private String ibge;

	private String unidade;

	private String gia;

	private String cep;

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "ClassPojo [uf = " + uf + ", complemento = " + complemento + ", logradouro = " + logradouro
				+ ", bairro = " + bairro + ", localidade = " + localidade + ", ibge = " + ibge + ", unidade = "
				+ unidade + ", gia = " + gia + ", cep = " + cep + "]";
	}

}
