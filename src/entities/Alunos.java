package entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Alunos {
	
	private int numeroAlunos;

	Set<Alunos> set = new HashSet<>();
	Scanner sc = new Scanner(System.in);
	
	public Alunos() {
		
	}
	
	
	public Alunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}

	public int getNumeroAlunos() {
		return numeroAlunos;
	}

	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroAlunos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		if (numeroAlunos != other.numeroAlunos)
			return false;
		return true;
	}
	

}
