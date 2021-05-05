/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Objects;

/**
 *
 * @author diogo
 */
//essa classe servira para todos os objetos e instancias de notas e materias
public class Disciplina {
	private double nota;
	private  String disciplinas;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 59 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
		hash = 59 * hash + Objects.hashCode(this.disciplinas);
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
		final Disciplina other = (Disciplina) obj;
		if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
			return false;
		}
		if (!Objects.equals(this.disciplinas, other.disciplinas)) {
			return false;
		}
		return true;
	}

	public String getDisciplina() {
		return disciplinas;
	}

	public void setDisciplina(String disciplina) {
		this.disciplinas = disciplina;
	}

	@Override
	public String toString() {
		return "Disciplina{" + "nota=" + nota + ", disciplina=" + disciplinas + '}';
	}
	
	
	
}
