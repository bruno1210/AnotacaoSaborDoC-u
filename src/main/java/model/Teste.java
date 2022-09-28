package model;

public class Teste {

	public static void main(String[] args) {
		int[] numeros= {2,3,5,7,9,11,13,18,21,25,29,34};
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				System.out.println(numeros[i]);
			}
		}

	}

}
