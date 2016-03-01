package aula06.encontro.modelo;

import java.util.Date;

public class Encontro {
	private String nomePessoa;
	private String local;
	private Date data;
	private String motivo;
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getlocal() {
		return local;
	}
	public void setlocal(String local) {
		this.local = local;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
