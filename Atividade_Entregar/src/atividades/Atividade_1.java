package atividades;

public class Atividade_1 {

	public static void metodo1()  throws ArrayIndexOutOfBoundsException{		
		System.out.println("Início da metodo1.");		
		int []vetor = new int[5];
		
		for(int i = 0; i<10; i++) {		
			vetor[i] = i;			
			System.out.println(i);		
		}
		
		
		System.out.println("Início da metodo2.");		
	}
		
	public static void main(String[] args) {		
		System.out.println("Início da main.");	
		try {
			metodo1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro " + e);
		}
				
		System.out.println("Fim da main.");		
	}	
}
