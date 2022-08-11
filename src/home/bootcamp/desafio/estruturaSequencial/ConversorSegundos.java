package home.bootcamp.desafio.estruturaSequencial;

import java.util.Scanner;

public class ConversorSegundos {

	Integer intNumSeg = 0, intNumMin = 0, intNumHr = 0, intNumDia = 0, contador = 0;
	String sair = "";
	
	public ConversorSegundos() {
		convertSegundos();
	}
	
	public void convertSegundos() {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			do{
				System.out.println("\n\t ••• Conversor de Segundos •••\n");
				
				System.out.println("Informe o Número em Segundos que você quer Converter: ");
	
				String input = scan.nextLine();
				
				
					if(input.equals("exit")){
						sair = input;
						scan.close();
					}
					else{
	
						try{
							
							contador = Integer.parseInt(input);
							intNumSeg = contador;

									
								for(int i = 0; i <= contador; i++) {				


									if(intNumSeg >= 60) {
																						
										intNumSeg = (intNumSeg - 60);
										intNumMin++;
										
									 }
										
										
									if(intNumMin == 60) {
											
										intNumHr++;
										intNumMin = 0;
											
									 }
										
								}//for
								
								
								if(intNumHr <= 23) {
									System.out.println("Resultado:");
									System.out.println(intNumHr+"h : "+intNumMin+"min : "+intNumSeg+" seg");
									
								}
							
							
							
							if(intNumHr > 23){
								//System.out.println("\nOps... o calculo já passa de 1 dia!\n");
								
								intNumDia++;
								intNumHr = (intNumHr - 24);
								
								while(intNumHr > 23) {
									
									intNumDia++;
									intNumHr = (intNumHr - 24);
									
								}
									
								System.out.println("Resultado:");
								System.out.println(intNumDia+"d : "+intNumHr+"h : "+intNumMin+"min : "+intNumSeg+" seg");

							}

														
						}catch(Exception e){
						
							System.out.println("\nOPS! Informe um valor Numérico válido para Operação... ");
							System.out.println(e+"\n\n ◘ Tente novamente com um Número ◘");
						}
					}
	
				intNumSeg = 0; 
				intNumMin = 0; 
				intNumHr = 0;
				intNumDia = 0;
				
				System.out.println("\n\n * Para finalizar o Programa digite: exit  ---\n\n\n");
			
			}while(sair.equals("exit") == false);
			
			
		}catch(Exception e) {
			System.out.println("OPS! Algo deu errado... ");
			System.out.println(e+"\n\n");
		};
		
		System.out.println("\n*** Programa finalizado com sucesso! ***");

	}
	

}
