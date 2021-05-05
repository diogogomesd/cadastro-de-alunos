/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author diogo
 */

public class Alunos {

	static void add(Alunos aluno1) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade =idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	//metodo que retorna a media do aluno
	public double getMedia(){
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
			
		}		
		return somaNotas /disciplinas.size();
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 67 * hash + Objects.hashCode(this.nome);
		hash = 67 * hash + this.idade;
		hash = 67 * hash + Objects.hashCode(this.dataNascimento);
		hash = 67 * hash + Objects.hashCode(this.registroGeral);
		hash = 67 * hash + Objects.hashCode(this.numeroCpf);
		hash = 67 * hash + Objects.hashCode(this.nomeMae);
		hash = 67 * hash + Objects.hashCode(this.nomePai);
		hash = 67 * hash + Objects.hashCode(this.dataMatricula);
		hash = 67 * hash + Objects.hashCode(this.nomeEscola);
		hash = 67 * hash + Objects.hashCode(this.serieMatriculado);
		hash = 67 * hash + Objects.hashCode(this.disciplinas);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Alunos other = (Alunos) obj;
		if (this.idade != other.idade) {
			return false;
		}
		if (!Objects.equals(this.nome, other.nome)) {
			return false;
		}
		if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
			return false;
		}
		if (!Objects.equals(this.registroGeral, other.registroGeral)) {
			return false;
		}
		if (!Objects.equals(this.numeroCpf, other.numeroCpf)) {
			return false;
		}
		if (!Objects.equals(this.nomeMae, other.nomeMae)) {
			return false;
		}
		if (!Objects.equals(this.nomePai, other.nomePai)) {
			return false;
		}
		if (!Objects.equals(this.dataMatricula, other.dataMatricula)) {
			return false;
		}
		if (!Objects.equals(this.nomeEscola, other.nomeEscola)) {
			return false;
		}
		if (!Objects.equals(this.serieMatriculado, other.serieMatriculado)) {
			return false;
		}
		if (!Objects.equals(this.disciplinas, other.disciplinas)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Alunos{" + "nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + '}';
	}
	
	

}	
	
