package capgemini;
import java.util.Scanner;
public class cadastro {

	public static void main(String[] args) {
		

		String opc ="x";
		double valorinvestido = 0;
		String anuncio="x";
		String cliente="x";
		String datainicio="x";
		String datatermino="x";
		double investimento=0;

				
				System.out.println("Digite o valor investido em Reais");
			    Scanner in = new Scanner(System.in);
			    valorinvestido = in.nextDouble();
				
				System.out.println("Digite a op��o que deseja fazer (01-Cadastro de An�ncio, 02-Visualizar relat�rio por cliente , 03-Visualizar relat�rio por tempo )");
			    in = new Scanner(System.in);
			    opc = in.nextLine();
				
			      switch(opc) {
			        case "01":
			        	 System.out.println("Digite o nome do An�ncio");
					     anuncio = in.nextLine();
					     
					     System.out.println("Digite o nome do Cliente");
					     cliente = in.nextLine();
					     
					     System.out.println("Digite a data de Inicio");
					     datainicio = in.nextLine();
					
					     
					     System.out.println("Digite oa data de T�rmino");
					     datatermino = in.nextLine();
					     
					     System.out.println("Digite o valor do Ivestimento por dia");
					     investimento = in.nextDouble();
					     
			          break;
			          
			        case "02":
			            System.out.println(anuncio);
			        	System.out.println(cliente);
			        	System.out.println(datainicio);
			        	System.out.println(datatermino);
			        	
			        	
			          break;
			          
			        case "03":
		                System.out.println(anuncio);
			        	System.out.println(cliente);
			        	System.out.println(datainicio);
			        	System.out.println(datatermino);
			          break;
			      
			        
			         
		           default:
		           System.out.println("Op��o n�o encontrada");
				
				
				in.close();
			}
			}

	}