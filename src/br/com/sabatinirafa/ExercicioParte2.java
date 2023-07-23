package br.com.sabatinirafa;

import java.util.Scanner;

public class ExercicioParte2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nomesFemStr = "";
		String nomesMascStr = "";
				
		System.out.println("Digite o nome e sexo das pessoas: [nome - m/f]");
		
		String[] listaNomes = s.nextLine().split(",");
		
		for(String i : listaNomes) {
			String[] nomeESexo = i.split(" - ");
			
			if(nomeESexo[1].equals("f")) {
				nomesFemStr += nomeESexo[0] + ",";
			} else if(nomeESexo[1].equals("m")) {
				nomesMascStr += nomeESexo[0] + ",";
			}
		}
		
		String[] nomesFemininos = nomesFemStr.split(",");
		String[] nomesMaculinos = nomesMascStr.split(",");
		
		System.out.println("Nomes femininos: ");
		
		for(String i : nomesFemininos) {
			System.out.println(i);
		}
		
		System.out.println("Nomes masculinos: ");
		
		for(String i : nomesMaculinos) {
			System.out.println(i);
		}
		
		s.close();
	}

}
