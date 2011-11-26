import java.util.Scanner;

public class ManipuladorDeString {
	
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		while(true){
		System.out.println("Digite uma frase: ");
		String fraseDigitada = entrada.nextLine();
		
		String ordenando = ordenar(fraseDigitada);
		System.out.println("A frase ordenada é: " + ordenando);
		
		}
	}
	
	public static String ordenar(String frase) {
		
		String [] palavras = frase.split(" ");
		
		for(int i = 0; i < palavras.length; i ++) {
			for(int j = 0; j < palavras.length - 1; j ++){
				
				String palavraAtual = palavras[j];
				String proximaPalavra = palavras[j + 1];
				
				if(palavraAtual.length() > proximaPalavra.length()){
					
					String aux = palavras[j + 1];
					palavras[j + 1] = palavras[j];
					palavras[j] = aux;
				}
			}
		}
		String resultado = "";
		
		for(int k = 0; k < palavras.length; k ++) {
			resultado += " " + palavras[k];
		}
		return resultado.trim();
	}

}
