package br.com.sabatinirafa;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioParte1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		String[] listaArray = s.nextLine().split(",");
		
		Arrays.sort(listaArray);
				
		for (String i : listaArray) {
			System.out.println(i);
		}
		
		s.close();
	}

}
