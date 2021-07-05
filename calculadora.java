package capgemini;

import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a cada 100 pessoas que visualizam o an�ncio 12 clicam nele.
		a cada 20 pessoas que clicam no an�ncio 3 compartilham nas redes sociais.
		cada compartilhamento nas redes sociais gera 40 novas visualizaçoes.
		30 pessoas visualizam o an�ncio original (n�o compartilhado) a cada R$ 1,00 investido.
		o mesmo anuncio é compartilhado no m�ximo 4 vezes em sequencia
		(1 pessoa -> compartilha -> 2� pessoa -> compartilha - > 3 pessoa -> compartilha -> 4 pessoa)
			*/	
		        Scanner in = new Scanner(System.in);
				 double visualizacao;
				 
				System.out.println("Digite o valor investido em Reais");
			     double valorinvestido = in.nextDouble(); 
			     
			     visualizacao = (valorinvestido *120); //30 pessoas =~ 4 cliques =~ 1 compartilhamento =~ 40 vizualizaçoes * 3 anuncio =120
			    System.out.println("O número aproximado de visualizações é " + visualizacao );
			     
			     in.close();
	}

}
