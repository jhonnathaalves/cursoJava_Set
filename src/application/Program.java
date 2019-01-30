package application;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import entities.Alunos;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Alunos> set = new HashSet<>();
		Alunos aluno = new Alunos();

		System.out.print("How many students for course A?");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int j = sc.nextInt();
			set.add(new Alunos(j));
		}

		System.out.print("How many students for course B?");
		int j = sc.nextInt();
		for (int i = 1; i <= j; i++) {
			int l = sc.nextInt();
			set.add(new Alunos(l));
		}

		System.out.print("How many students for course C?");
		int m = sc.nextInt();
		for (int i = 1; i <= m; i++) {
			int l = sc.nextInt();
			set.add(new Alunos(l));
		}

		System.out.println();
		System.out.print("Total students: " + set.size());

		sc.close();
	}

}
